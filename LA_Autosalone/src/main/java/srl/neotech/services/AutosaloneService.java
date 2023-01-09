package srl.neotech.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import srl.neotech.model.Automobile;
import srl.neotech.model.Autosalone;
import srl.neotech.requestresponse.CercaAutoRequest;

@Service
public class AutosaloneService {
	
	@Autowired
	Autosalone autoSalone;
	
	public void rimuoviAuto(String id) {
		int indice=-1;
		for (int i=0;i<autoSalone.getAutomobili().size();i++) {
			if(autoSalone.getAutomobili().get(i).getId().equals(id)) indice=i;
		}
		if(indice >=0)
		autoSalone.getAutomobili().remove(indice);
	}
	

	public void dettaglioAuto(String id) {
		for (Automobile auto: autoSalone.getAutomobili()) {
			if (auto.getId().equals(id)) {
			auto.getAccessori();
			}
		}
	}
	
	public List<Automobile> ricercaAutomobili(CercaAutoRequest request){
	    List<Automobile> autoTornate=new ArrayList<Automobile>();
	    
	    
	    if(request.getTarga()!=null) {
	    	for(Automobile auto: autoSalone.getAutomobili()) {
	    		if(auto.getTarga().equals(auto.getTarga()))
	    			autoTornate.add(auto);
	    	}
	    	//ciclate la lista e se trovate una auto con la stessa targa la mettete dentro autoTrovate
	    }
	    
	    if(!request.getColore().equals("0")) {
	    	//ciclate la lista e se trovate una auto con lo stesso colore la mettete dentro autoTrovate
	    }
	    
	    if(!request.getCostruttore().equals("0")) {
	    	//ciclate la lista e se trovate una auto con lo stesso colore la mettete dentro autoTrovate
	    }
	    return autoTornate;
		}


}
