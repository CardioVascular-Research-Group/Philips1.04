package edu.jhu.cvrg.jsierraecg.test;
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
* @author Chris Jurado
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.bind.JAXBException;

import org.cvrgrid.philips.DecodedLead;
import org.cvrgrid.philips.PreprocessReturn;
import org.cvrgrid.philips.SierraEcgFiles;
import org.junit.Test;

import junit.framework.TestCase;

public class AppTest extends TestCase{

	private final String INPUT_FILE_PATH = "/ecg_900657176_1.xml";
	
    public AppTest(String testName)
    {
        super(testName);
    }
    
    @Test
    public void testParse(){
    
		InputStream inputStream = getClass().getResourceAsStream(INPUT_FILE_PATH);
		PreprocessReturn preprocessReturn = null;
		DecodedLead[] leadData = null;
  	
		try {
			preprocessReturn = SierraEcgFiles.preprocess(inputStream);
			leadData = preprocessReturn.getDecodedLeads();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (JAXBException e) {
			e.printStackTrace();
		}

		assertTrue(leadData != null && leadData.length > 0);
    }
    
    @Test
    public void testPreprocess(){
    	String[] args = {INPUT_FILE_PATH};
    	assertTrue(preprocessTest(args));
    }
    
    
	private boolean preprocessTest(String[] args) {
		for (String arg : args) {
			File input = new File(arg);
			try {
				SierraEcgFiles.preprocess(input, new File(input.getCanonicalPath() + ".decoded.xml"));
			} catch (FileNotFoundException e) {
				System.out.println("No such file: " + input);
				e.printStackTrace();
				return false;
			} catch (IOException e) {
				System.out.println("Error reading file: " + input);
				e.printStackTrace();
				return false;
			} catch (JAXBException e) {
				System.out.println("Error reading/writing XML: " + input);
				e.printStackTrace();
				return false;
			}
		}
		return true;
	}
}