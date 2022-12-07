package srl.neotech.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ForzaQuattro {
	
	@GetMapping(value="forzaquattro")
	public String testPaginaForzaQuatttro() {
		return "forzaquattro";
	}
	
}
