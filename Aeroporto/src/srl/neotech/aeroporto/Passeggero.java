package srl.neotech.aeroporto;

public class Passeggero {
	
	private Integer idUnivoco;
	private Character MF;
	private Boolean hasFiore;
	private Integer eta;
	private Boolean hasBagagli;
	

	public Integer getIdUnivoco() {
		return idUnivoco;
	}
	
	public void setIdUnivoco(Integer idUnivoco) {
		this.idUnivoco = idUnivoco;
	}

	public Character getMF() {
		return MF;
	}

	public void setMF(Character mF) {
		MF = mF;
	}

	public Boolean getHasFiore() {
		return hasFiore;
	}

	public void setHasFiore(Boolean hasFiore) {
		this.hasFiore = hasFiore;
	}

	public Integer getEta() {
		return eta;
	}

	public void setEta(Integer eta) {
		this.eta = eta;
	}

	public Boolean getHasBagagli() {
		return hasBagagli;
	}

	public void setHasBagagli(Boolean hasBagagli) {
		this.hasBagagli = hasBagagli;
	}

	@Override
	public String toString() {
		return "Passeggero [idUnivoco=" + idUnivoco + ", MF=" + MF + ", hasFiore=" + hasFiore + ", eta=" + eta
				+ ", hasBagagli=" + hasBagagli + "]";
	}
	

}
