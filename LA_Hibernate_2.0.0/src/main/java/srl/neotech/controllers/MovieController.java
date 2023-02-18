package srl.neotech.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import srl.neotech.dto.DepartmentDTO;
import srl.neotech.dto.LanguageDTO;
import srl.neotech.dto.MovieDTO;
import srl.neotech.dto.PersonCastDTO;
import srl.neotech.dto.ProductionCompanyDTO;
import srl.neotech.requestresponse.ResponseBase;
import srl.neotech.services.MovieService;

@RestController
public class MovieController {
	
	@Autowired 
	MovieService movieService;
	
	@GetMapping("/getMovieBrad")
	public ResponseBase getMovieBrad(@RequestParam("name") String actor) {
		ResponseBase response=new ResponseBase();
		
		try {
			List<MovieDTO> films=movieService.getMovieBrad(actor);
			response.setSimpleData(films);
			response.setCode("OK");
		} catch (Exception e) {
			response.setCode("KO");
			response.setDescr(e.getMessage());
		}
	return response;
	}
	
	@GetMapping("/getMovieActionBrad")
	public ResponseBase getMovieActionBrad(@RequestParam("name") String actor,@RequestParam("genre") String genre) {
		ResponseBase response=new ResponseBase();
		
		try {
			List<MovieDTO> films=movieService.getMovieActionBrad(actor, genre);
			response.setSimpleData(films);
			response.setCode("OK");
		} catch (Exception e) {
			response.setCode("KO");
			response.setDescr(e.getMessage());
		}
	return response;
	}
	
	@GetMapping("/getProductionBudget")
	public ResponseBase getProductionBudget(@RequestParam("budget") Integer budget) {
		ResponseBase response=new ResponseBase();
		
		try {
			List<ProductionCompanyDTO> productions=movieService.getProductionBudget(budget);
			response.setSimpleData(productions);
			response.setCode("OK");
		} catch (Exception e) {
			response.setCode("KO");
			response.setDescr(e.getMessage());
		}
	return response;
	}
	
	@GetMapping("/getDPActor")
	public ResponseBase getDPActor(@RequestParam("role1") String role1, @RequestParam("role2") String role2) {
		ResponseBase response=new ResponseBase();
		
		try {
			List<DepartmentDTO> departments=movieService.getDPActor(role1, role2);
			response.setSimpleData(departments);
			response.setCode("OK");
		} catch (Exception e) {
			response.setCode("KO");
			response.setDescr(e.getMessage());
		}
	return response;
	}
	
	@GetMapping("/getCountFilm")
	public ResponseBase getCountFilm() {
		ResponseBase response=new ResponseBase();
		
		try {
			List<PersonCastDTO> films = movieService.getCountFilm();
			response.setSimpleData(films);
			response.setCode("OK");
		} catch (Exception e) {
			response.setCode("KO");
			response.setDescr(e.getMessage());
		}
	return response;
	}
	
	@GetMapping("/getPersonLanguage")
	public ResponseBase getPersonLanguage(@RequestParam("lang") String lang) {
		ResponseBase response=new ResponseBase();
		
		try {
			List<LanguageDTO> persons = movieService.getPersonLanguage(lang);
			response.setSimpleData(persons);
			response.setCode("OK");
		} catch (Exception e) {
			response.setCode("KO");
			response.setDescr(e.getMessage());
		}
	return response;
	}
}
