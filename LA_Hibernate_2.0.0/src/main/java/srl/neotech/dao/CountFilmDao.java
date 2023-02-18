package srl.neotech.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import srl.neotech.entity.Person;
import srl.neotech.repository.CountFilmRepository;

@Component
public class CountFilmDao {
	
	@Autowired
	CountFilmRepository countFilmRepository;
	
	public List<Person> getCountFilm (){
		return countFilmRepository.getCountFilm();
	}
	
	

}
