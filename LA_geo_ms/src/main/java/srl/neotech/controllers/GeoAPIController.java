package srl.neotech.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import srl.neotech.model.Comune;
import srl.neotech.model.ComuneAutocomplete;
import srl.neotech.model.Elemento;
import srl.neotech.model.MeteoGiornaliero;
import srl.neotech.model.Provincia;
import srl.neotech.model.Regione;
import srl.neotech.requestresponse.GetListaComuniResponse;
import srl.neotech.requestresponse.GetListaElementiResponse;
import srl.neotech.requestresponse.GetListaProvinceResponse;
import srl.neotech.requestresponse.GetListaRegioniResponse;
import srl.neotech.requestresponse.GetMeteoResponse;
import srl.neotech.requestresponse.ResponseBase;
import srl.neotech.services.GeoService;

@RestController
public class GeoAPIController {
	
	@Autowired
	GeoService geoService;
	
	
	@ResponseBody
	@GetMapping(value="/getListaProvince",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseBase getListaProvince(@RequestParam("id_regione") Integer idRegione) {
		//inizializzo la response
		ResponseBase response=new ResponseBase();
		
		try {
			List<Provincia> province= geoService.getListaProvince(idRegione);
			response.setSimpleData(province);
			response.setCode("OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response.setCode("KO");
			response.setDescr(e.getMessage());
		}
		return response;
	
	}
	
	@ResponseBody
	@GetMapping(value = "/getListaRegioni",produces = MediaType.APPLICATION_JSON_VALUE)
	public GetListaRegioniResponse getListaRegioni() {
		
		//inizializzo la response
		GetListaRegioniResponse response=new GetListaRegioniResponse();
		
		try {
			//chiamo il service
			List<Regione> listaRegioni = geoService.getListaRegioni();
			
			//preparo la response
			response.setSimpleData(listaRegioni);
			response.setCode("OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response.setCode("KO");
			response.setDescr(e.getMessage());
		}
		return response;
	}

	
	
	
	
	@ResponseBody
	@GetMapping(value = "/getListaComuni",produces = MediaType.APPLICATION_JSON_VALUE)
	public GetListaComuniResponse getListaComuni(@RequestParam("id_provincia") String idProvincia) {
		
		//inizializzo la response
		GetListaComuniResponse response=new GetListaComuniResponse();
		
		try {
			//chiamo il service
			List<Comune> listaComuni = geoService.getListaComuni(idProvincia);
			
			//preparo la response
			response.setSimpleData(listaComuni);
			response.setCode("OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response.setCode("KO");
			response.setDescr(e.getMessage());
		}
		return response;
	}
	
	
	@ResponseBody
	@GetMapping(value = "/getComuneAutocomplete",produces = MediaType.APPLICATION_JSON_VALUE)
	public GetListaComuniResponse getComuneAutocomplete(@RequestParam("text") String text) {
		
		//inizializzo la response
		GetListaComuniResponse response=new GetListaComuniResponse();
		
		try {
			//chiamo il service
			List<ComuneAutocomplete> listaComuni = geoService.getComuneAutoComplete(text);
			
			//preparo la response
			response.setSimpleData(listaComuni);
			response.setCode("OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response.setCode("KO");
			response.setDescr(e.getMessage());
		}
		return response;
	}
	
	@ResponseBody
	@GetMapping(value = "/getMeteo",produces = MediaType.APPLICATION_JSON_VALUE)
	public GetMeteoResponse getMeteo(@RequestParam("istat") String istat) {
		
		//inizializzo la response
		GetMeteoResponse response=new GetMeteoResponse();
		
		try {
			//chiamo il service
			List<MeteoGiornaliero> meteo= geoService.getMeteo(istat);
			
			//preparo la response
			response.setSimpleData(meteo);
			response.setCode("OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response.setCode("KO");
			response.setDescr(e.getMessage());
		}
		return response;
	}
	
	
}
