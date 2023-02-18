package srl.neotech.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import srl.neotech.entity.ProductionCompany;
import srl.neotech.repository.ProductionBudgetRepository;

@Component
public class ProductionBudgetDao {
	
	@Autowired
	ProductionBudgetRepository productionBudgetRepository;
	
	public List<ProductionCompany> getProductionBudget (Integer budget) {
		return productionBudgetRepository.getProductionBudget(budget);		
	}

}
