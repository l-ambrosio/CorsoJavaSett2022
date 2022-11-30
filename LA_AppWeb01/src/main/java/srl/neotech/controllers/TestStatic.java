package srl.neotech.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestStatic {

	@GetMapping(value="testPaginaStatic")
	public String testPaginaStatic() {
		return "static01";
	}
}
