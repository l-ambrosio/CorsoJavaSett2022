package srl.neotech.aeroporto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Aeroporto {
	

	List<Aereo> aerei=new ArrayList<Aereo>();
	List<Passeggero> passeggeri=new ArrayList<Passeggero>();
	
	private Integer raggioDiAzione;
	
	
	Aereo a=new Aereo();
	Passeggero p=new Passeggero();
	Random rnd=new Random();
	int numCasuale=rnd.nextInt(1,3);
	
	
	public Aeroporto() {
		if(numCasuale==1) p=new Business();
		if(numCasuale==2) p=new Excelsior();
		if(numCasuale==3) p=new Turista();
		
	}
	
	public void atterraggio(Aereo stato) {
		a.setStato(StatoAereo.ATTERRATO.toString()); 
		System.out.println(a.getStato());
	}
	
	public void decollo(Aereo stato) {
		a.setStato(StatoAereo.IN_PARTENZA.toString());
		System.out.println(a.getStato());
	}
	
	
	
	public Aereo checkIn(Aereo a, Passeggero p) {
		if(p instanceof Business) ((Business) p).setHaGiornale(true);
		if(p instanceof Excelsior) ((Excelsior) p).setHaChampagne(true);
		if(p instanceof Turista) ((Turista) p).setHaAnimale(true);
		return null;
	
	}
	

	public List<Aereo> getAerei() {
		return aerei;
	}

	public void setAerei(List<Aereo> aerei) {
		this.aerei = aerei;
	}

	public List<Passeggero> getPasseggeri() {
		return passeggeri;
	}

	public void setPasseggero(List<Passeggero> passeggero) {
		this.passeggeri = passeggero;
	}

	public Integer getRaggioDiAzione() {
		return raggioDiAzione;
	}

	public void setRaggioDiAzione(Integer raggioDiAzione) {
		this.raggioDiAzione = raggioDiAzione;
	}
	
	

}
