package srl.neotech.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import srl.neotech.entity.ProductionCompany;

public interface ProductionBudgetRepository extends JpaRepository<ProductionCompany, Integer> {
	
	@Query(value = "SELECT production_company.company_id, production_company.company_name, movie.title, movie.budget \n"
			+ "FROM production_company\n"
			+ "JOIN movie_company ON production_company.company_id= movie_company.company_id\n"
			+ "JOIN movie ON movie_company.movie_id = movie.movie_id\n"
			+ "WHERE movie.budget > :budget", nativeQuery = true)
	
	public List<ProductionCompany> getProductionBudget (Integer budget);
}
