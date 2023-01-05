package srl.neotech.model;

import java.awt.GraphicsDevice.WindowTranslucency;
import java.math.BigDecimal;
import java.util.ArrayList;


import org.springframework.stereotype.Component;

@Component
public class Autosalone {
	
	private ArrayList<Automobile> automobili=new ArrayList<Automobile>();
	
	
	public Autosalone() {
		
		Automobile primaAuto=new Automobile();
		primaAuto.setId("1");
		primaAuto.setTarga("BR556TY");
		primaAuto.setColore(EColore.BLU);
		primaAuto.setAlimentazione(EAlimentazione.IBRIDO);
		primaAuto.setAnnoCostruzione("2021");
		primaAuto.setCostruttore(ECostruttore.BUGATTI);
		primaAuto.setModello("Veyron");
		primaAuto.setCosto(new BigDecimal("450670.50"));
		
		Accessorio cerchiLega=new Accessorio();
		cerchiLega.setClasse(EClasseAccessorio.ESTERNI);
		cerchiLega.setTipologia(ETipologiaAccessorio.CERCHI);
		cerchiLega.setCosto(new BigDecimal("3700.34"));
		
		primaAuto.getAccessori().add(cerchiLega);
		automobili.add(primaAuto);
		
		
		Automobile secondaAuto=new Automobile();
		secondaAuto.setId("2");
		secondaAuto.setTarga("DP466GT");
		secondaAuto.setColore(EColore.ROSSO);
		secondaAuto.setAlimentazione(EAlimentazione.BENZINA);
		secondaAuto.setAnnoCostruzione("2020");
		secondaAuto.setCostruttore(ECostruttore.FERRARI);
		secondaAuto.setModello("Roma");
		secondaAuto.setCosto(new BigDecimal("200670.50"));
	
		Accessorio telecamere=new Accessorio();
		telecamere.setClasse(EClasseAccessorio.ESTERNI);
		telecamere.setTipologia(ETipologiaAccessorio.TELLECAMERE);
		telecamere.setCosto(new BigDecimal("5500.34"));
		
		secondaAuto.getAccessori().add(telecamere);
		automobili.add(secondaAuto);
		
		
		Automobile terzaAuto=new Automobile();
		terzaAuto.setId("3");
		terzaAuto.setTarga("EF723RT");
		terzaAuto.setColore(EColore.NERO);
		terzaAuto.setAlimentazione(EAlimentazione.DIESEL);
		terzaAuto.setAnnoCostruzione("2020");
		terzaAuto.setCostruttore(ECostruttore.PORSCHE);
		terzaAuto.setModello("Macan");
		terzaAuto.setCosto(new BigDecimal("100670.50"));
		
		Accessorio carPlay=new Accessorio();
		carPlay.setClasse(EClasseAccessorio.SICUREZZA);
		carPlay.setTipologia(ETipologiaAccessorio.CARPLAY);
		carPlay.setCosto(new BigDecimal("2000.99"));
		
		terzaAuto.getAccessori().add(carPlay);
		automobili.add(terzaAuto);
		
		
		Automobile quartaAuto=new Automobile();
		quartaAuto.setId("4");
		quartaAuto.setTarga("GT589NP");
		quartaAuto.setColore(EColore.BIANCO);
		quartaAuto.setAlimentazione(EAlimentazione.DIESEL);
		quartaAuto.setAnnoCostruzione("2020");
		quartaAuto.setCostruttore(ECostruttore.LAMBORGHINI);
		quartaAuto.setModello("Huracan");
		quartaAuto.setCosto(new BigDecimal("22030.20"));
		
		Accessorio interni=new Accessorio();
		interni.setClasse(EClasseAccessorio.INTERNI);
		interni.setTipologia(ETipologiaAccessorio.INTERNI);
		interni.setCosto(new BigDecimal("10500.00"));
		
		terzaAuto.getAccessori().add(interni);
		automobili.add(quartaAuto);
		
		Automobile quintaAuto=new Automobile();
		quintaAuto.setId("5");
		quintaAuto.setTarga("FD463ZL");
		quintaAuto.setColore(EColore.NERO);
		quintaAuto.setAlimentazione(EAlimentazione.IBRIDO);
		quintaAuto.setAnnoCostruzione("2020");
		quintaAuto.setCostruttore(ECostruttore.MASERATI);
		quintaAuto.setModello("Levante");
		quintaAuto.setCosto(new BigDecimal("305000.45"));
		
		Accessorio tettuccio=new Accessorio();
		tettuccio.setClasse(EClasseAccessorio.INTERNI);
		tettuccio.setTipologia(ETipologiaAccessorio.TETTUCCIO);
		tettuccio.setCosto(new BigDecimal("3400.25"));
		
		terzaAuto.getAccessori().add(tettuccio);
		automobili.add(quintaAuto);
		
	}

	
	public ArrayList<Automobile> getAutomobili() {
		return automobili;
	}

	public void setAutomobili(ArrayList<Automobile> automobili) {
		this.automobili = automobili;
	}
	
	
}

