package srl.neotech.corso;

public class Tagliaerba {
	
	private String strisciaInElaborazione;
	private Integer passo;
	private String stato;
	private Integer altezzaLama;

	public String getStrisciaInElaborazione() {
		return strisciaInElaborazione;
	}

	public void setStrisciaInElaborazione(String strisciaInElaborazione) {
		this.strisciaInElaborazione = strisciaInElaborazione;
	}

	public Integer getPasso() {
		return passo;
	}

	public void setPasso(Integer passo) {
		this.passo = passo;
	}

	public String getStato() {
		return stato;
	}

	public void setStato(String stato) {
		this.stato = stato;
	}

	public Integer getAltezzaLama() {
		return altezzaLama;
	}

	public void setAltezzaLama(Integer altezzaLama) {
		this.altezzaLama = altezzaLama;
	}

	public void tagliaStriscia() {
		for(int i=0;i<80;i++) {
		avanzaDiUnPasso();
		if 
		(i%2!=0) 	this.altezzaLama=5; 
		gira(2,"SX");
		System.out.println("SX");
		if (i%2==0)
		this.altezzaLama=10;
		gira(2,"DX");
		System.out.println("DX");
	
		}
	}
	
	private  void avanzaDiUnPasso() {
		this.passo=+1;
		System.out.println("tagliaerba:"+this.getStato()+"passo"+this.getPasso()+this.getAltezzaLama());
		
	}
	
	private void gira(Integer numeroRotazioni, String direzione) {
		System.out.println(this.getStato());
	}
	
}
