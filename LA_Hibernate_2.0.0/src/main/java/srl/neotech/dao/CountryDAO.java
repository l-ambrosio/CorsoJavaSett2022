package srl.neotech.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import srl.neotech.entity.Country;
import srl.neotech.repository.CountryRepository;

@Component
public class CountryDAO {

	@Autowired
	CountryRepository countryRepository;
	
	 public Optional<Country> getCountryById(Integer id) {
		   return countryRepository.findById(id);
	   }
		
	   public Country getCountryByIsoCode(String isoCode) {
		 Country c= countryRepository.getCountryByIsoCode(isoCode);  
		 System.out.println("1");
		 return c;
	   }
}

















