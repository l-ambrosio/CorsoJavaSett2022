package srl.neotech.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Test {

	@GetMapping(value="Test")
	public String paginaTest() {
		return "Test";
	}
}
