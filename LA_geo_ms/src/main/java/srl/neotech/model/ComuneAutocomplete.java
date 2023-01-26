package srl.neotech.model;

public class ComuneAutocomplete {
	
	private String id;
	private String value;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	
	public ComuneAutocomplete(String id, String value) {
		super();
		this.id = id;
		this.value = value;
	}
	

}
