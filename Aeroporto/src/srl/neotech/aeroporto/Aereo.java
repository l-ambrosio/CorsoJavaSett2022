package srl.neotech.aeroporto;

import java.util.ArrayList;
import java.util.List;

public class Aereo {
	
	private Integer idUnivoco;
	private Integer orario;
	private String compagniaAerea;
	private ModelloAereo modello;
	private List<Passeggero> passeggeri=new ArrayList<Passeggero>();
	private Integer velocita;
	private Integer distanzaDallAereoporto;
	private StatoAereo stato;
	
	
	public Integer getIdUnivoco() {
		return idUnivoco;
	}
	public void setIdUnivoco(Integer idUnivoco) {
		this.idUnivoco = idUnivoco;
	}
	public Integer getOrario() {
		return orario;
	}
	public void setOrario(Integer orario) {
		this.orario = orario;
	}
	public String getCompagniaAerea() {
		return compagniaAerea;
	}
	public void setCompagniaAerea(String compagniaAerea) {
		this.compagniaAerea = compagniaAerea;
	}
	public ModelloAereo getModello() {
		return modello;
	}
	public void setModello(ModelloAereo modello) {
		this.modello = modello;
	}
	public List<Passeggero> getPasseggeri() {
		return passeggeri;
	}
	public void setPasseggeri(List<Passeggero> passeggeri) {
		this.passeggeri = passeggeri;
	}
	public Integer getVelocita() {
		return velocita;
	}
	public void setVelocita(Integer velocita) {
		this.velocita = velocita;
	}
	public Integer getDistanzaDallAereoporto() {
		return distanzaDallAereoporto;
	}
	public void setDistanzaDallAereoporto(Integer distanzaDallAereoporto) {
		this.distanzaDallAereoporto = distanzaDallAereoporto;
	}
	public StatoAereo getStato() {
		return stato;
	}
	public void setStato(StatoAereo stato) {
		this.stato = stato;
	}
	@Override
	public String toString() {
		return "Aereo [idUnivoco=" + idUnivoco + ", orario=" + orario + ", compagniaAerea=" + compagniaAerea
				+ ", velocita=" + velocita + ", distanzaDallAereoporto=" + distanzaDallAereoporto + ", stato=" + stato + "]";
	}
	
	
	
	}
