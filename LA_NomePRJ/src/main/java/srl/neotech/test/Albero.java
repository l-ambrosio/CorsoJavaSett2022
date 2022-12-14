package srl.neotech.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Albero {
	
	@Autowired
	private Fiore fiore;

	public Fiore getFiore() {
		return fiore;
	}

	public void setFiore(Fiore fiore) {
		this.fiore = fiore;
	}

	
}
