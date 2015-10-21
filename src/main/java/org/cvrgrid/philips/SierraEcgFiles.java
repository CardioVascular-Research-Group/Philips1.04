package org.cvrgrid.philips;
/*
Copyright 2015 Johns Hopkins University Institute for Computational Medicine

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
/**
* @author Stephen Granite
*/
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.cvrgrid.philips.codecs.Base64;
import org.cvrgrid.philips.codecs.XliDecompressor;
import org.cvrgrid.philips.jaxb.beans.Parsedwaveforms;
import org.cvrgrid.philips.jaxb.beans.Restingecgdata;
import org.cvrgrid.philips.jaxb.beans.TYPEdataencoding;

public final class SierraEcgFiles {
	
	private SierraEcgFiles() {
	}
	
	private static PreprocessReturn preprocessNew(JAXBContext context, InputStream inputStream) throws JAXBException, IOException {
		Unmarshaller reader = context.createUnmarshaller();
		Restingecgdata restingecgdata = (Restingecgdata)reader.unmarshal(inputStream);
		
		return preprocessNewComplete(restingecgdata);
	}
	
	private static PreprocessReturn preprocessNew(JAXBContext context, File input) throws JAXBException, IOException {
		Unmarshaller reader = context.createUnmarshaller();
		Restingecgdata restingecgdata = (Restingecgdata)reader.unmarshal(input);

		return preprocessNewComplete(restingecgdata);
	}
	
	private static PreprocessReturn preprocessNewComplete(Restingecgdata restingecgdata) throws JAXBException, IOException{
		DecodedLead[] leads = extractLeads(restingecgdata);
		
		StringBuffer buffer = new StringBuffer();
        for (DecodedLead lead : leads) {
        	for (int count = 0; count < lead.size(); ++count) {
        		buffer.append(lead.get(count));
        		if (count % 25 > 0 || count == 0) {
        			buffer.append(" ");
        		} 
        		else {
        			buffer.append("\n");
        		}
        	}
        }
        
        Parsedwaveforms parsedwaveforms = restingecgdata.getWaveforms().getParsedwaveforms();
        parsedwaveforms.setDataencoding(TYPEdataencoding.PLAIN);
        parsedwaveforms.setValue(buffer.toString());
        return new PreprocessReturn(restingecgdata, leads);
	}
	
	private static Restingecgdata preprocess(JAXBContext context, File input) throws JAXBException, IOException {
		Unmarshaller reader = context.createUnmarshaller();
		Restingecgdata restingecgdata = (Restingecgdata)reader.unmarshal(input);
		DecodedLead[] leads = extractLeads(restingecgdata);
		
		StringBuffer buffer = new StringBuffer();
        for (DecodedLead lead : leads) {
        	for (int count = 0; count < lead.size(); ++count) {
        		buffer.append(lead.get(count));
        		if (count % 25 > 0 || count == 0) {
        			buffer.append(" ");
        		} 
        		else {
        			buffer.append("\n");
        		}
        	}
        }
        
        Parsedwaveforms parsedwaveforms = restingecgdata.getWaveforms().getParsedwaveforms();
        parsedwaveforms.setDataencoding(TYPEdataencoding.PLAIN);
        parsedwaveforms.setValue(buffer.toString());
        
        return restingecgdata;
	}
	
	public static PreprocessReturn preprocess(InputStream inputStream) throws IOException, JAXBException {
		JAXBContext context = JAXBContext.newInstance("org.cvrgrid.philips.jaxb.beans");
		
		return preprocessNew(context, inputStream);
	}
	
	public static PreprocessReturn preprocess(File input) throws IOException, JAXBException {
		JAXBContext context = JAXBContext.newInstance("org.cvrgrid.philips.jaxb.beans");
		
		return preprocessNew(context, input);
	}
	
	public static void preprocess(File input, File output) throws IOException, JAXBException {
		JAXBContext context = JAXBContext.newInstance("org.cvrgrid.philips.jaxb.beans");
		
		Restingecgdata restingecgdata = preprocess(context, input);
        
        Marshaller writer = context.createMarshaller();
        writer.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        writer.marshal(restingecgdata, output);
	}
	
	public static DecodedLead[] extractLeads(Restingecgdata input) throws IOException {
		Parsedwaveforms parsedwaveforms = input.getWaveforms().getParsedwaveforms();
		
		InputStream in = new ByteArrayInputStream(parsedwaveforms.getValue().getBytes());
		if (parsedwaveforms.getDataencoding() == TYPEdataencoding.BASE_64) {
			in = new Base64.InputStream(in);
		}
		
		ArrayList<int[]> leadData = new ArrayList<int[]>();
		if (parsedwaveforms.getCompression().equalsIgnoreCase("XLI")) {
			XliDecompressor xli = new XliDecompressor(in);
			int[] payload;
			while (null != (payload = xli.readLeadPayload())) {
				leadData.add(payload);
			}
		}
		in.close();
		String reportlabel = input.getReportinfo().getReportlabel();
		DecodedLead[] leads = DecodedLead.createFromLeadSet(reportlabel, leadData);
		
		return leads;
	}
	
	public static DecodedLead[] extractLeads(File input) throws IOException, JAXBException {
		JAXBContext context = JAXBContext.newInstance("org.cvrgrid.philips.jaxb.beans");
		Unmarshaller reader = context.createUnmarshaller();
		Restingecgdata restingecgdata = (Restingecgdata)reader.unmarshal(input);
		
		return extractLeads(restingecgdata);
	}
}