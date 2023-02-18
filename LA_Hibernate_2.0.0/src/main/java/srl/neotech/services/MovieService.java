package srl.neotech.services;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import srl.neotech.dao.CountFilmDao;
import srl.neotech.dao.DPActorDao;
import srl.neotech.dao.MovieActionBradDao;
import srl.neotech.dao.MovieBradDao;
import srl.neotech.dao.PersonLanguageDao;
import srl.neotech.dao.ProductionBudgetDao;
import srl.neotech.dto.DepartmentDTO;
import srl.neotech.dto.LanguageDTO;
import srl.neotech.dto.MovieDTO;
import srl.neotech.dto.PersonCastDTO;
import srl.neotech.dto.ProductionCompanyDTO;
import srl.neotech.entity.DPActorEntity;
import srl.neotech.entity.LanguageEntity;
import srl.neotech.entity.Movie;
import srl.neotech.entity.Person;
import srl.neotech.entity.ProductionCompany;

@Service
public class MovieService {
	
	@Autowired
	MovieBradDao movieBradDao;
	
	@Autowired
	MovieActionBradDao movieActionBradDao;
	
	@Autowired
	ProductionBudgetDao productionBudgetDao;
	
	@Autowired
	DPActorDao dPActorDao;
	
	@Autowired
	CountFilmDao countFilmDao;
	
	@Autowired
	PersonLanguageDao personLanguageDao;
	
	@Autowired
	ModelMapper modelMapper;

	public List<MovieDTO> getMovieBrad(String actor) {
		List<Movie> movies=movieBradDao.getMovieBrad(actor);
		List<MovieDTO> films=new ArrayList<>();
		for(Movie movie:movies) {
			films.add(modelMapper.map(movie, MovieDTO.class));
		}
		return films;
	}
	
	public List<MovieDTO> getMovieActionBrad(String actor, String genre) {
		List<Movie> movies=movieActionBradDao.getMovieActionBrad(actor, genre);
		List<MovieDTO> films=new ArrayList<>();
		for(Movie movie:movies) {
			films.add(modelMapper.map(movie, MovieDTO.class));
		}
		return films;
	}
	
	public List<ProductionCompanyDTO> getProductionBudget (Integer budget) {
		List<ProductionCompany> productions= productionBudgetDao.getProductionBudget(budget);	
		List<ProductionCompanyDTO> productionsDto=new ArrayList<>();
		for(ProductionCompany productionCompany:productions) {
			ProductionCompanyDTO dto = new ProductionCompanyDTO(productionCompany.getId(), productionCompany.getCompanyName());
			productionsDto.add(dto);
		}
		return productionsDto;
	}
	
	public List<DepartmentDTO> getDPActor (String role1, String role2) {
		List<DepartmentDTO> departmentsDto=new ArrayList<>();
		List<DPActorEntity> dPAEntity= dPActorDao.getDPActor(role1, role2);	
		for(DPActorEntity entity:dPAEntity) {
			DepartmentDTO dto = new DepartmentDTO(entity.getPersonName(), entity.getDepartmentName());
			departmentsDto.add(dto);
		}
		return departmentsDto;
	}
	
	public List<PersonCastDTO> getCountFilm () {
		List<PersonCastDTO> dto = new ArrayList<>();
		List<Person> entity=countFilmDao.getCountFilm();
		for(Person p:entity) {
			dto.add(modelMapper.map(p, PersonCastDTO.class));
		}
		return dto;
	}
	
	public List<LanguageDTO> getPersonLanguage (String lang) {
		List<LanguageDTO> langDTO = new ArrayList<>();
		List<LanguageEntity> langEntity = personLanguageDao.getPersonLanguage(lang);
		for(LanguageEntity entity:langEntity) {
			LanguageDTO dto = new LanguageDTO(entity.getId(), entity.getPersonName(), entity.getTitle(), entity.getLanguageName());
			langDTO.add(dto);
			}
		return langDTO;
	}
	
	
}
