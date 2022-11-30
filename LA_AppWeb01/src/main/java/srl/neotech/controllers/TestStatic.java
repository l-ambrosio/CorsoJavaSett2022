package srl.neotech.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestStatic {

	@GetMapping(value="testPaginaStatic01")
	public String testPaginaStatic() {
		return "static01";
	}
}
