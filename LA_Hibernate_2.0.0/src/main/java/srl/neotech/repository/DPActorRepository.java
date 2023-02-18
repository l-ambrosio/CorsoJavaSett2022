package srl.neotech.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import srl.neotech.entity.DPActorEntity;
import srl.neotech.entity.Person;

public interface DPActorRepository extends JpaRepository <Person, Integer> {
	
	@Query(value = "select distinct person.person_name personName, department.department_name departmentName \n"
			+ "from movie \n"
			+ "join movie_cast on movie.movie_id = movie_cast.movie_id \n"
			+ "join person on movie_cast.person_id = person.person_id \n"
			+ "join movie_crew on person.person_id = movie_crew.person_id \n"
			+ "join department on movie_crew.department_id = department.department_id \n"
			+ "WHERE department.department_name = :role1 or department.department_name= :role2 ", nativeQuery = true)
	
	public List<DPActorEntity> getDPActor (String role1, String role2);

}
