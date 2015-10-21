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
import org.cvrgrid.philips.jaxb.beans.Restingecgdata;

public class PreprocessReturn {

	private Restingecgdata restingEcgData;
	private DecodedLead[] decodedLeads;
	
	public PreprocessReturn(Restingecgdata restingEcgData, DecodedLead[] decodedLeads) {
		super();
		this.restingEcgData = restingEcgData;
		this.decodedLeads = decodedLeads;
	}
	
	public Restingecgdata getRestingEcgData() {
		return restingEcgData;
	}
	public void setRestingEcgData(Restingecgdata restingEcgData) {
		this.restingEcgData = restingEcgData;
	}
	public DecodedLead[] getDecodedLeads() {
		return decodedLeads;
	}
	public void setDecodedLeads(DecodedLead[] decodedLeads) {
		this.decodedLeads = decodedLeads;
	}
}