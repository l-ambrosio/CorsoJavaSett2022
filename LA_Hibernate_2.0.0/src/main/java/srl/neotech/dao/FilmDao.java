package srl.neotech.dao;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import srl.neotech.entity.Movie;
import srl.neotech.entity.MovieCast;
import srl.neotech.entity.Person;
import srl.neotech.repository.CountryRepository;
import srl.neotech.repository.MovieRepository;

@Component
public class FilmDao {

	@Autowired
	EntityManager entityManager;
	
	@Autowired
	MovieRepository movieRepository;

	@Autowired
	CountryRepository countryRepository;
	
	public Movie getMovie(Integer movie_id) {
	
	//find by PK	
	Movie m=entityManager.find(Movie.class, movie_id); 	
	return m;	
	}
	
	
	public List<Movie> getMovieByBudget(Integer budget){
		 
		 //premessa..
		 CriteriaBuilder cb = entityManager.getCriteriaBuilder();
	     CriteriaQuery<Movie> cq = cb.createQuery(Movie.class);
	     Root<Movie> movie = cq.from(Movie.class);
	     
	     //impostazione delle where..
	     Predicate budgetrPredicate = cb.greaterThan(movie.get("budget"), budget);
	     Predicate popularitypredicate = cb.greaterThan(movie.get("popularity"), 30);
	     
	     //impostazioni delle join
	     Join<Movie, MovieCast> cast = movie.join("movieCasts");
	     Join<MovieCast,Person> person = cast.join("person");
	     
	     //predicato della join e unione finale dei predicati
	     Predicate namepredicate = cb.equal(person.get("personName"), "Brad Pitt");
	     Predicate finalPredicate=cb.and(budgetrPredicate,popularitypredicate,namepredicate);
	     
	     cq.where(finalPredicate);
	     TypedQuery<Movie> query = entityManager.createQuery(cq);
	     
	     return query.getResultList();
	     
	}
	
	
 
   
   
	public List<Movie> getMovieByActor(String name) {
		
		return movieRepository.getFilmByActor(name);
		
		}
	
	
	public void insertMovie(Movie movie) {
		
	//insert
	entityManager.persist(movie); 
	}
	
	
	public List<Movie> getMovieFromGenereAndPopolairta(String genere, Integer popolarita) {
		Pageable page = PageRequest.of(0, 5);
		BigDecimal b=new BigDecimal(popolarita);
		return movieRepository.getMovieByGenreandPopularity(genere, b,page);
	}
}
