package srl.neotech.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Impiccato {
	
	@GetMapping(value="impiccato")
	public String testPaginaImpiccato() {
		return "impiccato";
	}

}
