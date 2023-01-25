package srl.neotech.model;

public class Provincia {
	
	private String provincia;
	private String idProvincia;
	

	
	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getIdProvincia() {
		return idProvincia;
	}

	public void setIdProvincia(String idProvincia) {
		this.idProvincia = idProvincia;
	}

	public Provincia(String provincia, String idProvincia) {
		super();
		this.provincia = provincia;
		this.idProvincia = idProvincia;
	}



}
