package srl.neotech.aeroporto;

public class Excelsior extends Passeggero {

	private Boolean hasChampagne;

	
	public Boolean getHasChampagne() {
		return hasChampagne;
	}

	public void setHasChampagne(Boolean hasChampagne) {
		this.hasChampagne = hasChampagne;
	}

	@Override
	public String toString() {
		return "Excelsior [hasChampagne=" + hasChampagne + "]";
	}
	
	
}
