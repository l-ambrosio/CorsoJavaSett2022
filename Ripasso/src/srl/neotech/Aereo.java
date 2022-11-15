package srl.neotech;

public class Aereo {
	
	
	private Integer targa;
	private String compagnia;
	private Integer numeroPosti;
	private Integer velocita;
	
	
	public Aereo() {
		
	}

	public Aereo(String compagnia) {
		this.compagnia=compagnia;
	}
	
	
	public Integer getVelocita() {
		return velocita;
	}

	public void setVelocita(Integer velocita) {
		this.velocita = velocita;
	}

	public Integer getTarga() {
		return targa;
	}
	public void setTarga(Integer targa) {
		this.targa = targa;
	}
	public String getCompagnia() {
		return compagnia;
	}
	public void setCompagnia(String compagnia) {
		this.compagnia = compagnia;
	}
	public Integer getNumeroPosti() {
		return numeroPosti;
	}
	public void setNumeroPosti(Integer numeroPosti) {
		this.numeroPosti = numeroPosti;
	}
	
	
	//COMPORTAMENTI
	//10% dei posti riservati al business class
	public Integer getNumeroPostiBusiness() {
		return Math.round(this.numeroPosti*10/100);
	}
	
	public void accellera(Integer quantita) {
	this.velocita=this.velocita+quantita;
	}

	public void decellera(Integer quantita) {
		this.velocita=this.velocita-quantita;
		}
	
	
	private void mioMetodoPrivato() {
		System.out.println("privato");
	}
	
	
}
