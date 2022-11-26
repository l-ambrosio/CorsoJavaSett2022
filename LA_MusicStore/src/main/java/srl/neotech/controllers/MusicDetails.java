package srl.neotech.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MusicDetails {
		
		@GetMapping(value="MusicDetails")
		public String paginaMusicaDetails() {
			return "MusicDetails";
		}
	
}
