package srl.neotech.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import srl.neotech.entity.MovieCast;
import srl.neotech.entity.MovieCastId;

public interface MovieCastRepository extends JpaRepository<MovieCast, MovieCastId> {

	@Query("select mc from MovieCast mc where mc.movie.id=:movie_id")
	public List<MovieCast> getPersonByMovie(Integer movie_id);
	
	

}
