package srl.neotech.srl.test;

import java.util.ArrayList;
import java.util.List;

public class Cantina {
	
	List<Cisterna> cisterne=new ArrayList<Cisterna>();
	
	private Integer livelloMinimoDiGas=45;
	
	


	public Integer getLivelloMinimoDiGas() {
		return livelloMinimoDiGas;
	}

	public void setLivelloMinimoDiGas(Integer livelloMinimoDiGas) {
		this.livelloMinimoDiGas = livelloMinimoDiGas;
	}

	public List<Cisterna> getCisterne() {
		return cisterne;
	}

	public void setCisterne(List<Cisterna> cisterne) {
		this.cisterne = cisterne;
	}
	

}
