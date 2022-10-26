package srl.neotech.corso.allocazione;

public class TavoloDaGioco {
	
	private int celle;
	private String colore;
	
	
	private String[] pezzi= {"pedone"+"torre"+"cavallo"+"regina"+"re"};

	public int getCelle() {
		return celle;
	}

	public void setCelle(int celle) {
		this.celle = celle;
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public String[] getPezzi() {
		return pezzi;
	}

	public void setPezzi(String[] pezzi) {
		this.pezzi = pezzi;
	}
	
	public String calcoloColore() {
		String tipoColoreCella=null;
		if(this.celle<=32) tipoColoreCella="bianco";
		if(this.celle>32) tipoColoreCella="nero";
		return tipoColoreCella;
	}

	
	public String calcoloPezzoOccupato() {
		String tipoCellaOccupata=null;
		if(this.celle<=16) tipoCellaOccupata="e' occupata";
		if(this.celle>=48) tipoCellaOccupata="e' occupata";
		return tipoCellaOccupata;
	}
	
}
