package srl.neotech.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import srl.neotech.test.Albero;
import srl.neotech.test.Automobile;

@Controller
public class MusicController {
	
		//IOC: Inversion of Control.
		//Crea Motore--> Crea Automobile--> MusicController 
		
		@Autowired //voglio usare 
		Automobile auto;
		Albero albero;
		
		
		//No variabili a livello di classe !!!!!!!!
		//Perchè essendo Singleton sarebbero sharate con tutti i chiamanti.
		
		
		//Rotta
		@GetMapping(value="prima_rotta/{id}/{citta}")
		//le chiamate sono serializzate....
		public String primaRotta(	
			@PathVariable("id") String idDato,
			@PathVariable("citta") String cittaDato
			) {
			int contaOggetti=0;
			auto.getMotore().setCilindrata(3000);
			System.out.println(auto.getMotore().getCilindrata());
			contaOggetti=contaOggetti+1;
			System.out.println(contaOggetti);
			return "test";
		}
		
		public String secondaRotta(	
				@PathVariable("id") String idDato,
				@PathVariable("citta") String cittaDato
				) {
				int contaOggetti=0;
				albero.getFiore().setQuantita(10);
				System.out.println(albero.getFiore().getQuantita());
				contaOggetti=contaOggetti+1;
				System.out.println(contaOggetti);
				return "test2";
			}
}
