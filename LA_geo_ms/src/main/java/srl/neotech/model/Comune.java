package srl.neotech.model;

public class Comune {

	private String comune;
	private String idRegione;


	public String getComune() {
		return comune;
	}

	public void setComune(String comune) {
		this.comune = comune;
	}

	public String getIdRegione() {
		return idRegione;
	}

	public void setIdRegione(String idRegione) {
		this.idRegione = idRegione;
	}

	public Comune(String comune, String idRegione) {
		super();
		this.comune = comune;
		this.idRegione = idRegione;
	}

	
}
