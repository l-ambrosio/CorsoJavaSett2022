package srl.neotech.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import srl.neotech.model.Automobile;
import srl.neotech.model.Autosalone;

@Controller
public class AutosaloneController {

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
		modelMap.addAttribute("listaAuto",autoSalone.getAutomobili());
		return "listaAuto";
	}
	
	@GetMapping("dettaglioAuto")
	public String dettaglioAuto(@RequestParam String id, ModelMap modelMap) {
		Automobile auto = null;
	        modelMap.addAttribute("auto", auto);
	        modelMap.addAttribute("listaccessori", auto.getAccessori());
	        return "dettaglioAuto";
	}
	
}
