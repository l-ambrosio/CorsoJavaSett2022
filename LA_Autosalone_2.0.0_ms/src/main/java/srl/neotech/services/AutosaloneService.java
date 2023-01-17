package srl.neotech.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import srl.neotech.dao.AutosaloneDAO;
import srl.neotech.model.Automobile;
import srl.neotech.model.EColore;
import srl.neotech.model.ECostruttore;
import srl.neotech.requestresponse.AddAutoRequest;
import srl.neotech.requestresponse.CercaAutoRequest;

@Service
public class AutosaloneService {
	
	@Autowired
	AutosaloneDAO autosalone;
	
	public void addAuto (AddAutoRequest dati) {
		autosalone.getAutomobili().add(dati.getAuto());
	} 
	
	
	public Automobile getAuto(String id) {
		Automobile autoTrovata=new Automobile();
		for(Automobile auto:autosalone.getAutomobili()) {
			if(auto.getId().equals(id)) autoTrovata=auto;
		}
		
		return autoTrovata;
	}
	
	
	public ArrayList<Automobile> getListaAuto() {
		return autosalone.getAutomobili();
	}

	
	public Automobile rimuoviAuto(String id) {
		Automobile autoDaRimuovere=new Automobile();
		for(Automobile auto:autosalone.getAutomobili()) {
			if(auto.getId().equals(id)) autoDaRimuovere=auto;
		}
		return autoDaRimuovere;
	}
	
	public ArrayList<Automobile> cercaAuto(CercaAutoRequest autoCerca) {
		ArrayList<Automobile> autoCercata=new ArrayList<Automobile>();
		for(Automobile auto:autosalone.getAutomobili()) {
			if(autoCerca.getTarga().equals(auto.getTarga())) autoCercata.add(auto);
			EColore colore = auto.getColore();
			if(autoCerca.getColore().equals(colore)) autoCercata.add(auto);
			ECostruttore costruttore = auto.getCostruttore();
			if(autoCerca.getCostruttore().equals(costruttore)) autoCercata.add(auto);
		}
		return autoCercata;
	}
	
}
