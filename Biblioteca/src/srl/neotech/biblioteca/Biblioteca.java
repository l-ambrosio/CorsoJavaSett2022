package srl.neotech.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	
	List<Libro>libri=new ArrayList<Libro>();
	List<Associato>associati=new ArrayList<Associato>();
	
	
	public List<Libro> getLibri() {
		return libri;
	}
	public void setLibri(List<Libro> libri) {
		this.libri = libri;
	}
	public List<Associato> getAssociati() {
		return associati;
	}
	public void setAssociati(List<Associato> associati) {
		this.associati = associati;
	}

	

	 
}
