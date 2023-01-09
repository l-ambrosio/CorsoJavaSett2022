package srl.neotech.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import srl.neotech.model.Automobile;
import srl.neotech.model.Autosalone;
import srl.neotech.model.EAlimentazione;
import srl.neotech.model.EColore;
import srl.neotech.model.ECostruttore;
import srl.neotech.requestresponse.CercaAutoRequest;
import srl.neotech.services.AutosaloneService;



@Controller
public class AutosaloneController {
	
	@Autowired
	AutosaloneService autosaloneService;

	
	@Autowired
	Autosalone autoSalone;
	
	
	@GetMapping(value="listaAuto")
	public String getListaAuto(ModelMap modelMap) {
		modelMap.addAttribute("listaAuto",autoSalone.getAutomobili());
		return "listaAuto";
	}
	
	
	@GetMapping(value="aggiungiAuto")
	public String aggiungiAuto(ModelMap modelMap) {
		modelMap.addAttribute("automobili", autoSalone.getAutomobili());
		return "aggiungiAuto";
	}
	
	@PostMapping(value="add")
	public String Add(@ModelAttribute("auto") Automobile auto) {
		autoSalone.getAutomobili().add(auto);
		return "aggiungiAuto";
	}
	
	@GetMapping(value="rimuoviAuto")   
	public String rimuoviAutoPage(@RequestParam("id") String id, ModelMap modelMap) { 
		autosaloneService.rimuoviAuto(id);
		modelMap.addAttribute("listaAuto",autoSalone.getAutomobili());
		return "listaAuto";
	}
	
	@GetMapping(value="dettaglioAuto")
	public String dettaglioAuto(@RequestParam("id") String id, ModelMap modelMap) {
		autosaloneService.dettaglioAuto(id);
		modelMap.addAttribute("auto",autoSalone.getAutomobili().get(0).getId());
		modelMap.addAttribute("auto",autoSalone.getAutomobili().get(1));
		modelMap.addAttribute("auto",autoSalone.getAutomobili().get(2));
		modelMap.addAttribute("auto",autoSalone.getAutomobili().get(3));
		modelMap.addAttribute("auto",autoSalone.getAutomobili().get(4));
	        return "dettaglioAuto";
	}
	
	
	@GetMapping(value="cercaAuto")   
	public String cercaAuto(@ModelAttribute("requestCercaAuto") CercaAutoRequest request, ModelMap modelMap) { 
		modelMap.addAttribute("colore", EColore.values());
		modelMap.addAttribute("costruttore", ECostruttore.values());
		modelMap.addAttribute("alimentazione", EAlimentazione.values());
		return "cercaAuto";
	}
	
	
	@PostMapping("searchAuto")   
	public String cercaAutoPage(@ModelAttribute("requestCercaAuto") CercaAutoRequest request, ModelMap modelMap) { 
		List<Automobile> autoTrovate=autosaloneService.ricercaAutomobili(request);
		modelMap.addAttribute("listaAutoTrovate",autoTrovate);
		return "cercaAuto";
	}
	
	
	
}
