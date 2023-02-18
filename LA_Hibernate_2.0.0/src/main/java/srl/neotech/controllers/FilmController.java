package srl.neotech.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import srl.neotech.dto.MovieDTO;
import srl.neotech.dto.NazioneDTO;
import srl.neotech.dto.PersonaggioDTO;
import srl.neotech.requestresponse.ResponseBase;
import srl.neotech.services.FilmService;

@RestController
public class FilmController {

	@Autowired
	FilmService filmService;
	
	@GetMapping("/getFilm")
	public ResponseBase getFilm(@RequestParam("film_id") Integer film_id) {
		ResponseBase response=new ResponseBase();
		
		try {
			MovieDTO film_trovato=filmService.getFilm(film_id);
			response.setSimpleData(film_trovato);
			response.setCode("OK");
		} catch (Exception e) {
			response.setCode("KO");
			response.setDescr(e.getMessage());
		}
	return response;
	}
	
	
	@GetMapping("/getFilmByBudget")
	public ResponseBase getFilmByBudget(@RequestParam("budget") Integer budget) {
		ResponseBase response=new ResponseBase();
		
		try {
			List<MovieDTO> films=filmService.getFilmByBudget(budget);
			response.setSimpleData(films);
			response.setCode("OK");
		} catch (Exception e) {
			response.setCode("KO");
			response.setDescr(e.getMessage());
		}
	return response;
	}
	
	
	
	
	@GetMapping("/getFilmByActor")
	public ResponseBase getFilmByActor(@RequestParam("name") String name) {
		ResponseBase response=new ResponseBase();
		
		try {
			List<MovieDTO> films=filmService.getFilmByActor(name);
			response.setSimpleData(films);
			response.setCode("OK");
		} catch (Exception e) {
			response.setCode("KO");
			response.setDescr(e.getMessage());
		}
	return response;
	}

	
	
	
	@GetMapping("insertMovie")
	public ResponseBase insertMovie(@RequestParam("film_id") Integer film_id, @RequestParam("titolo") String titolo) {
		ResponseBase response=new ResponseBase();
		
		try {
			MovieDTO f=new MovieDTO();
			f.setId(film_id);
			f.setTitle(titolo);
			filmService.insertFilm(f);
			response.setCode("OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			response.setCode("KO");
			response.setDescr(e.getMessage());
		}
		
		return response;
	}
	
	@GetMapping("getPersonaggibyFilm")
	public ResponseBase getPersonaggiByFilm(@RequestParam("film_id") Integer film_id) {
		ResponseBase response=new ResponseBase();	
		try {
			List<PersonaggioDTO> personaggi= filmService.getPersonaggibyFilm(film_id);
			response.setSimpleData(personaggi);
			response.setCode("OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			response.setCode("KO");
			response.setDescr(e.getMessage());
		}
		return response;
	}
	
	@GetMapping("getPersonaggibyFilm_")
	public ResponseBase getPersonaggiByFilm_(@RequestParam("film_id") Integer film_id) {
		ResponseBase response=new ResponseBase();	
		try {
			List<PersonaggioDTO> personaggi= filmService.getPersonaggibyFilm_(film_id);
			response.setSimpleData(personaggi);
			response.setCode("OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			response.setCode("KO");
			response.setDescr(e.getMessage());
		}
		return response;
	}
	
	
	@GetMapping("getNazioneByCode")
	public ResponseBase getNazioneByCode(@RequestParam("code") String code) {
		ResponseBase response=new ResponseBase();	
		try {
			NazioneDTO nazione=filmService.getCountryByCode(code);
			response.setSimpleData(nazione);
			response.setCode("OK");
		} catch (Exception e) {
			response.setCode("KO");
			response.setDescr(e.getMessage());
		}
		return response;
	}
	
	
	@GetMapping("getFilmByGenereAndPopolarita")
	public ResponseBase getFilmByGenereAndPopolarita(@RequestParam("genere") String genere, @RequestParam("pop") Integer popolarita) {
		ResponseBase response=new ResponseBase();	
		try {
			List<MovieDTO> movies=filmService.getFilmByGenereAndPopolairta(genere, popolarita);
			response.setSimpleData(movies);
			response.setCode("OK");
		} catch (Exception e) {
			response.setCode("KO");
			response.setDescr(e.getMessage());
		}
		return response;
	}
	
	
}