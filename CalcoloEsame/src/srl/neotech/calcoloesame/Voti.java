package srl.neotech.calcoloesame;

import java.util.ArrayList;

public class Voti {

	private ArrayList<Integer> votoScritto=new ArrayList<Integer>();
	
	private ArrayList<Integer> votoOrale=new ArrayList<Integer>();
	
	private String risultatoTotale;

	
	
	public String getRisultatoTotale() {
		return risultatoTotale;
	}

	public void setRisultatoTotale(String risultatoTotale) {
		this.risultatoTotale = risultatoTotale;
	}

	public ArrayList<Integer> getVotoScritto() {
		return votoScritto;
	}

	public void setVotoScritto(ArrayList<Integer> votoScritto) {
		this.votoScritto = votoScritto;
	}

	public ArrayList<Integer> getVotoOrale() {
		return votoOrale;
	}

	public void setVotoOrale(ArrayList<Integer> votoOrale) {
		this.votoOrale = votoOrale;
	}
	
	
	
	
	
}
