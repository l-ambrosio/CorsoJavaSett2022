package srl.neotech.requestresponse;

import java.util.ArrayList;

import srl.neotech.model.Regione;

public class GetListaRegioniResponse extends ResponseBase{

	private ArrayList<Regione> regioni=new ArrayList<Regione>();

	public ArrayList<Regione> getRegioni() {
		return regioni;
	}

	public void setRegioni(ArrayList<Regione> regioni) {
		this.regioni = regioni;
	}
	
	
}
