package srl.neotech.biblioteca;

import java.util.ArrayList;

public class Associato {

	
	private Integer idAssociato;
	private String nominativo;
	private String stato;
	
	
	public String getStato() {
		return stato;
	}

	public void setStato(String stato) {
		this.stato = stato;
	}


	ArrayList<Integer>libriPresi=new ArrayList<Integer>();

	public Integer getIdAssociato() {
		return idAssociato;
	}

	public void setIdAssociato(Integer idAssociato) {
		this.idAssociato = idAssociato;
	}

	public String getNominativo() {
		return nominativo;
	}

	public void setNominativo(String nominativo) {
		this.nominativo = nominativo;
	}

	public ArrayList<Integer> getLibriPresi() {
		return libriPresi;
	}

	public void setLibriPresi(ArrayList<Integer> libriPresi) {
		this.libriPresi = libriPresi;
	}

	@Override
	public String toString() {
		return "Associati [idAssociato=" + idAssociato + ", nominativo=" + nominativo + ", stato=" + stato
				+ ", libriPresi=" + libriPresi + "]";
	}
	
	
	
	
}
