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
	
	
	public List<Automobile> ricercaAutomobili(CercaAutoRequest request){
	    List<Automobile> autoTornate=new ArrayList<Automobile>();
	    
	    
	    if(request.getTarga()!=null) {
	    	for(Automobile auto: autoSalone.getAutomobili()) {
	    		if(auto.getTarga().equals(request.getTarga()))
	    			autoTornate.add(auto);
	    	}
	    }
	    
	    if(!request.getColore().equals("0")) {
	    	for(Automobile auto: autoSalone.getAutomobili()) {
	    		if(auto.getColore().equals(request.getColore()))
	    				autoTornate.add(auto);
	    	}
	    }
	    
	    if(!request.getCostruttore().equals("0")) {
	    	for(Automobile auto: autoSalone.getAutomobili()) {
	    		if(auto.getCostruttore().equals(request.getCostruttore()))
	    			autoTornate.add(auto);
	    	}
	    }
	    
	    return autoTornate;
	    
		}

}
