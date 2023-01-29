package srl.neotech.model;

public class Comune {

	private String comune;
	private String idComune;
	private String lat;
	private String lang;
	private String istat;
	
	
	public String getIstat() {
		return istat;
	}
	public void setIstat(String istat) {
		this.istat = istat;
	}
	public String getComune() {
		return comune;
	}
	public void setComune(String comune) {
		this.comune = comune;
	}
	
	public String getIdComune() {
		return idComune;
	}
	
	public void setIdComune(String idComune) {
		this.idComune = idComune;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}
	
	
	public Comune(String comune, String idComune, String istat) {
		super();
		this.comune = comune;
		this.idComune = idComune;
		this.istat = istat;
	}
	public Comune(String lat, String lang) {
		super();
		this.lat = lat;
		this.lang = lang;
	}
	
}
