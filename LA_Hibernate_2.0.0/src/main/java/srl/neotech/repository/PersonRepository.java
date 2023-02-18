package srl.neotech.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import srl.neotech.entity.Person;
import srl.neotech.entity.PersonaggioEntity;

public interface PersonRepository extends JpaRepository<Person, Integer>{
	
	@Query(nativeQuery=true, value="select p.person_id as id,p.person_name as personName,mc.character_name as characterName from person p \n"
			+ "join movie_cast mc on p.person_id=mc.person_id \n"
			+ "join movie m on mc.movie_id=m.movie_id and\n"
			+ "m.movie_id=:movie_id")
	public List<PersonaggioEntity> getPersonByMovie_(Integer movie_id);
}