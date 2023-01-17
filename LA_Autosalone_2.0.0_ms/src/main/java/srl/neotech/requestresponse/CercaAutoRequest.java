package srl.neotech.requestresponse;

import java.util.ArrayList;

import srl.neotech.model.Automobile;

public class CercaAutoRequest extends ResponseBase{
	
	private String targa;
	private String colore;
	private String costruttore;
	private ArrayList<Automobile> auto;
	
	
	
	public ArrayList<Automobile> getAuto() {
		return auto;
	}
	public void setAuto(ArrayList<Automobile> auto) {
		this.auto = auto;
	}
	public String getTarga() {
		return targa;
	}
	public void setTarga(String targa) {
		this.targa = targa;
	}
	public String getColore() {
		return colore;
	}
	public void setColore(String colore) {
		this.colore = colore;
	}
	public String getCostruttore() {
		return costruttore;
	}
	public void setCostruttore(String costruttore) {
		this.costruttore = costruttore;
	}
	
	

}
