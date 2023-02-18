package srl.neotech.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import srl.neotech.entity.MovieCast;
import srl.neotech.entity.PersonaggioEntity;
import srl.neotech.repository.MovieCastRepository;
import srl.neotech.repository.PersonRepository;

@Component
public class PersonDAO {

	@Autowired
	PersonRepository personRepository;
	
	@Autowired
	MovieCastRepository movieCastRepository;
	
	public List<MovieCast> getPersonaggibyMovie(Integer movie_id){
		return movieCastRepository.getPersonByMovie(movie_id);
	}
	
	
	public List<PersonaggioEntity> getPersonaggibyMovie_(Integer movie_id){
		return personRepository.getPersonByMovie_(movie_id);
	}
	
	
	
	}