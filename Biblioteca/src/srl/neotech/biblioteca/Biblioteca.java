package srl.neotech.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	
	List<Libri>libri=new ArrayList<Libri>();
	List<Associati>associati=new ArrayList<Associati>();
	
	
	public List<Libri> getLibri() {
		return libri;
	}
	public void setLibri(List<Libri> libri) {
		this.libri = libri;
	}
	public List<Associati> getAssociati() {
		return associati;
	}
	public void setAssociati(List<Associati> associati) {
		this.associati = associati;
	}

	

	 
}
