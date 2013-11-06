package org.cvrgrid.philips;

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
