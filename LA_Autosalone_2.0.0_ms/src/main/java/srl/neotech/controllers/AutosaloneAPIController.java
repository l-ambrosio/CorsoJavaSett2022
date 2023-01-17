package srl.neotech.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import srl.neotech.model.Automobile;
import srl.neotech.model.Elemento;
import srl.neotech.requestresponse.AddAutoRequest;
import srl.neotech.requestresponse.CercaAutoRequest;
import srl.neotech.requestresponse.GetAutomobileResponse;
import srl.neotech.requestresponse.GetElementoResponse;
import srl.neotech.requestresponse.GetListaAutoResponse;
import srl.neotech.requestresponse.GetListaElementiResponse;
import srl.neotech.requestresponse.RequestAddElemento;
import srl.neotech.requestresponse.ResponseBase;
import srl.neotech.services.AutosaloneService;

@RestController
public class AutosaloneAPIController {
	
	@Autowired
	AutosaloneService autosaloneService;
	
	
	
	@ResponseBody
	@PutMapping(value = "/addAuto",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseBase addAuto(@RequestBody AddAutoRequest dati) {
		 //inizializzo la response
		ResponseBase response=new ResponseBase();
		try {
			//chiamo il service
		    autosaloneService.addAuto(dati);
		    
		    //rispondo
		    response.setCode("OK");
		}
		catch(Exception ex) {
		   response.setCode("KO");	
		}
		return response;
	}
	

	
	@ResponseBody
	@GetMapping(value = "/getAuto/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public GetAutomobileResponse getAuto(@PathVariable("id") String idAuto) {
		 //inizializzo la response
		GetAutomobileResponse response=new GetAutomobileResponse();
		try {
			//chiamo il service
			Automobile auto= autosaloneService.getAuto(idAuto);
			
			//preparo la response
			response.setAuto(auto);
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
	@GetMapping(value = "/getListaAuto",produces = MediaType.APPLICATION_JSON_VALUE)
	public GetListaAutoResponse getListaAuto() {
		 //inizializzo la response
		GetListaAutoResponse response=new GetListaAutoResponse();
		try {
			//chiamo il service
			ArrayList<Automobile> listaAuto = autosaloneService.getListaAuto();
			
			//preparo la response
			response.setListaAuto(listaAuto);
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
	@DeleteMapping(value = "/rimuoviAuto/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseBase rimuoviAuto(@PathVariable("id") String id) {
		 //inizializzo la response
		ResponseBase response=new ResponseBase();
		try {
			//chiamo il service
		autosaloneService.rimuoviAuto(id);
		
		//rispondo
		response.setCode("OK");
		}
		catch(Exception ex) {
			response.setCode("KO");
		}
		return response;
	}
	
	@ResponseBody
	@PostMapping(value = "/cercaAuto",produces = MediaType.APPLICATION_JSON_VALUE)
	public CercaAutoRequest cercaAuto(@RequestBody CercaAutoRequest autoCerca) {
		
	    //inizializzo la response
		
		CercaAutoRequest response=new CercaAutoRequest();
	    try {
	    //chiamo il service	
	    	
	    ArrayList<Automobile> auto = autosaloneService.cercaAuto(autoCerca);
	     
	    //preparo la response
        response.setAuto(auto);
	    response.setCode("OK");
	    }
	    catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response.setCode("KO");
			response.setDescr(e.getMessage());
		}
		return response;
	}
	
	
}
