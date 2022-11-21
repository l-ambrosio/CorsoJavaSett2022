package srl.neotech.aeroporto;

public class Business extends Passeggero{
	
	private Boolean hasGiornale;

	
	public Boolean getHasGiornale() {
		return hasGiornale;
	}

	public void setHasGiornale(Boolean hasGiornale) {
		this.hasGiornale = hasGiornale;
	}

	@Override
	public String toString() {
		return "Business [hasGiornale=" + hasGiornale + "]";
	}
	

}
