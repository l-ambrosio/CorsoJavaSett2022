package srl.neotech.requestresponse;

import java.util.ArrayList;

import srl.neotech.model.MeteoGiornaliero;

public class GetMeteoResponse extends ResponseBase{
	
	
	private ArrayList<MeteoGiornaliero> meteo=new ArrayList<MeteoGiornaliero>();

	
	public ArrayList<MeteoGiornaliero> getMeteo() {
		return meteo;
	}

	public void setMeteo(ArrayList<MeteoGiornaliero> meteo) {
		this.meteo = meteo;
	}

	
}
