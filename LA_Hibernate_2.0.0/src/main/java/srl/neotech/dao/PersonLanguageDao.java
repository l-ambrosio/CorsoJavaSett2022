package srl.neotech.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import srl.neotech.entity.LanguageEntity;
import srl.neotech.repository.PersonLanguageRepository;

@Component
public class PersonLanguageDao {
	
	@Autowired
	PersonLanguageRepository personLanguageRepository;
	
	public List<LanguageEntity> getPersonLanguage (String lang) {
		return personLanguageRepository.getPersonLanguage(lang);
	}

}
