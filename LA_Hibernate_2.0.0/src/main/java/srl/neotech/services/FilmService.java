package srl.neotech.services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import srl.neotech.dao.CountryDAO;
import srl.neotech.dao.FilmDao;
import srl.neotech.dao.PersonDAO;
import srl.neotech.dto.MovieDTO;
import srl.neotech.dto.NazioneDTO;
import srl.neotech.dto.PersonaggioDTO;
import srl.neotech.entity.Country;
import srl.neotech.entity.Movie;
import srl.neotech.entity.MovieCast;
import srl.neotech.entity.PersonaggioEntity;

@Service
public class FilmService {

	@Autowired
	FilmDao filmDao;
	
	
	@Autowired
	PersonDAO personDao;
	
	
	@Autowired
	CountryDAO countyDao;
	
	
	@Autowired
	ModelMapper modelMapper;

	
	
	
	public MovieDTO getFilm(Integer film_id) {
		Movie m= filmDao.getMovie(film_id);
		MovieDTO f=modelMapper.map(m,MovieDTO.class);
		return f;
	}

	
	public List<MovieDTO> getFilmByBudget(Integer budget) {
	List<Movie> movies= filmDao.getMovieByBudget(budget);	
	List<MovieDTO> moviesDto=new ArrayList<>();
	for(Movie movie:movies) {
		moviesDto.add(modelMapper.map(movie, MovieDTO.class));
	}
	return moviesDto;
	}
	
	public List<MovieDTO> getFilmByActor(String name) {
		List<Movie> movies=filmDao.getMovieByActor(name);
		List<MovieDTO> films=new ArrayList<>();
		for(Movie movie:movies) {
			films.add(modelMapper.map(movie, MovieDTO.class));
		}
		return films;
	}

	
	@Transactional
	public void insertFilm(MovieDTO f) {
		ModelMapper modelMapper = new ModelMapper();
		Movie m=modelMapper.map(f,Movie.class);
		filmDao.insertMovie(m);
	}
	
	public List<PersonaggioDTO> getPersonaggibyFilm(Integer movie_id){
		List<PersonaggioDTO> personaggi=new ArrayList<>();
		List<MovieCast> movieCasts=personDao.getPersonaggibyMovie(movie_id);
		
		for(MovieCast mc:movieCasts) {
			PersonaggioDTO personaggio=new PersonaggioDTO();
			personaggio.setPersonName(mc.getPerson().getPersonName());
			personaggio.setCharacterName(mc.getCharacterName());
			personaggio.setId(mc.getPerson().getId());
			personaggi.add(personaggio);
		}
			
		return personaggi;
	}
	
	public List<PersonaggioDTO> getPersonaggibyFilm_(Integer movie_id){
		List<PersonaggioDTO> personaggi=new ArrayList<>();
		List<PersonaggioEntity> entities=personDao.getPersonaggibyMovie_(movie_id);
		for(PersonaggioEntity entity:entities) {
			PersonaggioDTO p=new PersonaggioDTO(entity.getId(), entity.getPersonName(), entity.getCharacterName());
			personaggi.add(p);
		}
		return personaggi;
	}
	
	public NazioneDTO getCountryByCode(String code){
		
		Country countries=countyDao.getCountryByIsoCode(code);
		NazioneDTO nazione=modelMapper.map(countries, NazioneDTO.class);
		return nazione;
	}
	
	public List<MovieDTO> getFilmByGenereAndPopolairta(String genere, Integer popolarita){
		List<MovieDTO> movieRitornati=new ArrayList<>();
		List<Movie> movies=filmDao.getMovieFromGenereAndPopolairta(genere, popolarita);
		for(Movie m:movies) {
			MovieDTO unMovie=modelMapper.map(m,MovieDTO.class);
			movieRitornati.add(unMovie);
		}
 		return movieRitornati;
	}
	
	
}
