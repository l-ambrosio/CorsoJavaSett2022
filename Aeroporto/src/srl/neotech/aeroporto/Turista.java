package srl.neotech.aeroporto;

public class Turista extends Passeggero {
	
	private Boolean hasAnimale;
	

	public Boolean getHasAnimale() {
		return hasAnimale;
	}

	public void setHasAnimale(Boolean hasAnimale) {
		this.hasAnimale = hasAnimale;
	}

	@Override
	public String toString() {
		return "Turista [hasAnimale=" + hasAnimale + "]";
	}
	
	

}
