package srl.neotech.aereoporto;

import java.util.ArrayList;
import java.util.List;

public class Aereoporto {

	
	List<Aereo> aerei=new ArrayList<Aereo>();
	List<Passeggero> passeggero=new ArrayList<Passeggero>();
	
	private Integer raggioDiAzione;
	
	
	
	
	
	

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
