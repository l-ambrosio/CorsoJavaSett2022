package srl.neotech.model;

public class Regione {
	
	private String regione;
	private String idRegione;

	
	public String getRegione() {
		return regione;
	}

	public void setRegione(String regione) {
		this.regione = regione;
	}

	public String getIdRegione() {
		return idRegione;
	}

	public void setIdRegione(String idRegione) {
		this.idRegione = idRegione;
	}

	public Regione(String regione, String idRegione) {
		super();
		this.regione = regione;
		this.idRegione = idRegione;
	}

	

}
