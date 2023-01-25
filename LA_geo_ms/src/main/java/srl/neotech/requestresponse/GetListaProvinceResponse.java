package srl.neotech.requestresponse;

import java.util.ArrayList;

import srl.neotech.model.Provincia;

public class GetListaProvinceResponse extends ResponseBase{
	
	private ArrayList<Provincia> province=new ArrayList<Provincia>();

	public ArrayList<Provincia> getProvince() {
		return province;
	}

	public void setProvince(ArrayList<Provincia> province) {
		this.province = province;
	}
	

}
