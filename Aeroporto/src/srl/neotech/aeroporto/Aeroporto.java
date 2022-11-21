package srl.neotech.aeroporto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Aeroporto {
	
	List<Aereo> aereiInPartenza=new ArrayList<Aereo>();
	List<Aereo> aereiInAvvicinamento=new ArrayList<Aereo>();
	List<Passeggero> passeggeriInAttesa=new ArrayList<Passeggero>();
	
	private Integer raggioDiAzione;
	

	public List<Aereo> getAereiInPartenza() {
		return aereiInPartenza;
	}

	public void setAereiInPartenza(List<Aereo> aereiInPartenza) {
		this.aereiInPartenza = aereiInPartenza;
	}

	public List<Aereo> getAereiInAvvicinamento() {
		return aereiInAvvicinamento;
	}

	public void setAereiInAvvicinamento(List<Aereo> aereiInAvvicinamento) {
		this.aereiInAvvicinamento = aereiInAvvicinamento;
	}

	public List<Passeggero> getPasseggeriInAttesa() {
		return passeggeriInAttesa;
	}

	public void setPasseggeriInAttesa(List<Passeggero> passeggeriInAttesa) {
		this.passeggeriInAttesa = passeggeriInAttesa;
	}

	public Integer getRaggioDiAzione() {
		return raggioDiAzione;
	}

	public void setRaggioDiAzione(Integer raggioDiAzione) {
		this.raggioDiAzione = raggioDiAzione;
	}

	public Aereo atterraggio(Aereo a) {
		while(a.getDistanzaDallAereoporto()>0) {
			Integer distanzaAttuale=a.getDistanzaDallAereoporto()-a.getVelocita();
			System.out.println("Blink!:"+a);
			a.setDistanzaDallAereoporto(distanzaAttuale);
		}
		a.setStato(StatoAereo.ATTERRATO);
		System.out.println(a);
		for(Passeggero p:a.getPasseggeri()) {
			this.checkOut(p);
		}
			return a;
	}

	public Aereo decollo(Aereo a) {
		while(a.getDistanzaDallAereoporto()<=0) {
			Integer partenza=a.getDistanzaDallAereoporto()+a.getVelocita();
			a.setDistanzaDallAereoporto(partenza);
		}
		a.setStato(StatoAereo.IN_PARTENZA);
		System.out.println(a);
		for(Passeggero p:a.getPasseggeri()) {
			this.checkIn(p);
		}
		return a;
	}
	
	public void checkIn (Passeggero p) {
		if(p instanceof Excelsior) ((Excelsior) p).setHasChampagne(true);
		if(p instanceof Business) ((Business) p).setHasGiornale(true);
		if(p instanceof Turista) ((Turista) p).setHasAnimale(true);
		if(p.getMF().equals('F')) p.setHasFiore(true);
		System.out.println(p);
	}
	
	
	
	public void checkOut (Passeggero p) {
		if(p instanceof Excelsior) ((Excelsior) p).setHasChampagne(true);
		if(p instanceof Business) ((Business) p).setHasGiornale(true);
		if(p instanceof Turista) ((Turista) p).setHasAnimale(true);
		if(p.getMF().equals('F')) p.setHasFiore(true);
		System.out.println(p);
	}
}
