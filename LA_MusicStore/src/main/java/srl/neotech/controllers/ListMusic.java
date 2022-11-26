package srl.neotech.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ListMusic {

		@GetMapping(value="ListMusic")
		public String paginaListMusic() {
			return "ListMusic";
		}
		
	
}
