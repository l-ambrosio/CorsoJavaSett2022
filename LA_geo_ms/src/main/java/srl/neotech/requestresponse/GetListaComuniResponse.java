package srl.neotech.requestresponse;

import java.util.ArrayList;

import srl.neotech.model.Comune;

public class GetListaComuniResponse extends ResponseBase {

	private ArrayList<Comune> comuni=new ArrayList<Comune>();

	public ArrayList<Comune> getComuni() {
		return comuni;
	}

	public void setComuni(ArrayList<Comune> comuni) {
		this.comuni = comuni;
	}
	
}
