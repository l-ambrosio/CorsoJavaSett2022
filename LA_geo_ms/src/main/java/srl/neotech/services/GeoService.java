package srl.neotech.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import srl.neotech.dao.GeoDAO;
import srl.neotech.model.Comune;
import srl.neotech.model.Provincia;
import srl.neotech.model.Regione;

@Service
public class GeoService {
	
	@Autowired
	GeoDAO geoDao;
	
	public List<Regione> getListaRegioni() {
		List<Regione> listaRegioni=new ArrayList<Regione>();
		return listaRegioni;
	}

	public List<Comune> getListaComuni(Integer idProvincia) {
		return geoDao.getListaComuni(idProvincia);
	}

	public List<Provincia> getListaProvince(Integer idRegione){
		return geoDao.getListaProvince(idRegione);
	}
	
	
}
