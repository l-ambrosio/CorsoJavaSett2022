package srl.neotech.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping(value="testLudovica")
	public String testPaginaLudovica() {
		return "testPagina";
	}
	
	@GetMapping(value="testPagina")
	public String testPagina() {
		return "testAltraPagina";
	}
	
}
