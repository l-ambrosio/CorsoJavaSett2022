package srl.neotech.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import srl.neotech.dao.repository.GeoRepository;
import srl.neotech.model.Comune;
import srl.neotech.model.ComuneAutocomplete;
import srl.neotech.model.Elemento;
import srl.neotech.model.Provincia;
import srl.neotech.model.Regione;

@Component
public class GeoDAO {
	
	@Autowired
	GeoRepository geoRepository;
	
	public List<Provincia> getListaProvince(Integer id_regione) {
		return geoRepository.getListaProvince(id_regione);
	}
	
	public List<Regione> getListaRegioni() {
		return geoRepository.getListaRegioni();
	}
	
	public List<Comune> getListaComuni(String id_provincia) {
		return geoRepository.getListaComuni(id_provincia);
	}

	
	public List<ComuneAutocomplete> getComuneAutoComplete(String txt){
		return geoRepository.getComunemAutoComplete(txt);
	}
	
	public Comune getMeteo(String istat) {
		return geoRepository.getMeteo(istat);
	}
	
}
