package srl.neotech.dao;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import srl.neotech.entity.Movie;
import srl.neotech.repository.BPActionRepository;

@Component
public class MovieActionBradDao {
	
		@Autowired
		BPActionRepository bPActionRepository;
		
		public List<Movie> getMovieActionBrad(String actor, String genre) {
			return bPActionRepository.getMovieActionBrad(actor, genre);		
		}

}