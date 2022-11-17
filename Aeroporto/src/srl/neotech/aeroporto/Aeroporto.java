package srl.neotech.aeroporto;

import java.util.ArrayList;
import java.util.List;

public class Aeroporto {
	

	List<Aereo> aerei=new ArrayList<Aereo>();
	List<Passeggero> passeggero=new ArrayList<Passeggero>();
	
	private Integer raggioDiAzione;
	
	Aereo a=new Aereo();
	Passeggero p=new Passeggero();
	
	
	public Aereo atterraggio(Aereo stato) {
		a.setStato(StatoAereo.ATTERRATO.toString()); 
		return stato ;
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

	public List<Passeggero> getPasseggero() {
		return passeggero;
	}

	public void setPasseggero(List<Passeggero> passeggero) {
		this.passeggero = passeggero;
	}

	public Integer getRaggioDiAzione() {
		return raggioDiAzione;
	}

	public void setRaggioDiAzione(Integer raggioDiAzione) {
		this.raggioDiAzione = raggioDiAzione;
	}
	
	

}
