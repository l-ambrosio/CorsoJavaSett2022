package srl.neotech.services;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import srl.neotech.dao.GeoDAO;
import srl.neotech.model.Comune;
import srl.neotech.model.ComuneAutocomplete;
import srl.neotech.model.MeteoGiornaliero;
import srl.neotech.model.OpenMeteoRoot;
import srl.neotech.model.Provincia;
import srl.neotech.model.Regione;


@Service
public class GeoService {
	
	@Autowired
	GeoDAO geoDao;
	
	public List<Regione> getListaRegioni() {
		List<Regione> listaRegioni= geoDao.getListaRegioni();
		return listaRegioni;
	}

	public List<Comune> getListaComuni(String idProvincia) {
		return geoDao.getListaComuni(idProvincia);
	}

	public List<Provincia> getListaProvince(Integer idRegione){
		return geoDao.getListaProvince(idRegione);
	}
	
	
	public List<ComuneAutocomplete> getComuneAutoComplete(String txt){
		return geoDao.getComuneAutoComplete(txt);
	}
	
	
	public List<MeteoGiornaliero> getMeteo(String istat) {
		
		Comune comune=geoDao.getMeteo(istat);
		
		WebClient webClient=WebClient.create("https://api.open-meteo.com/v1/forecast?latitude="+comune.getLat()+"&longitude="+comune.getLang()+"&timezone=CET&daily=weathercode,temperature_2m_min,temperature_2m_max,rain_sum");
		
		OpenMeteoRoot root=webClient.get()
		.retrieve()
		.bodyToMono(OpenMeteoRoot.class).block();

		System.out.println("giorni:"+root.getDaily().getTime()+" whethercode:"+root.getDaily().getWeathercode());
		List<MeteoGiornaliero> giorni=new ArrayList<>();
		for(int i=0;i<root.getDaily().getTime().size();i++) {
			MeteoGiornaliero giornoMeteo=new MeteoGiornaliero();
			giornoMeteo.setData(root.getDaily().getTime().get(i));
			giornoMeteo.setCodiceMeteo(root.getDaily().getWeathercode().get(i).toString());
			giornoMeteo.setTempMin(root.getDaily().getTemperature_2m_min().get(i).toString());
			giornoMeteo.setTempMax(root.getDaily().getTemperature_2m_max().get(i).toString());
			giornoMeteo.setPrecipitazione(root.getDaily().getRain_sum().get(i).toString());
			giorni.add(giornoMeteo);
		}

		System.out.println(giorni);
		return giorni;
	}
	
}
