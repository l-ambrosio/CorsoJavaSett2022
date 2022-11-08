package srl.neotech.srl.test;

import java.util.ArrayList;
import java.util.Random;

public class Startup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Cantina cantina=new Cantina();
	
	
	Random rnd=new Random();
	
	
	for(int i=0;i<100;i++) {
		Cisterna unaCisternaDaAggiungere=new Cisterna();
		int numCasuale=rnd.nextInt(1,4);
		if(numCasuale==1) unaCisternaDaAggiungere.setTipologia(MaterialeCisterna.ACCIAIO.toString());
		if(numCasuale==2) unaCisternaDaAggiungere.setTipologia(MaterialeCisterna.ALLUMINIO.toString());
		if(numCasuale==3) unaCisternaDaAggiungere.setTipologia(MaterialeCisterna.RAME.toString());
		
		numCasuale=rnd.nextInt(1,1001);
		unaCisternaDaAggiungere.setQuantita(numCasuale);
		
		numCasuale=rnd.nextInt(1,11);
		unaCisternaDaAggiungere.setEvapPerDay(numCasuale);
		
		numCasuale=rnd.nextInt(1,101);
		unaCisternaDaAggiungere.setLivelloGas(numCasuale);
		
		cantina.getCisterne().add(unaCisternaDaAggiungere);
	}
	
	for(Cisterna c:cantina.getCisterne()) {
		System.out.println(c);
		
		}
	
	Integer quantitaVendibile=0;
	for(Cisterna c:cantina.getCisterne()) {
		if(c.getLivelloGas()>=cantina.getLivelloMinimoDiGas()) quantitaVendibile=quantitaVendibile+c.getQuantita();
	}
		System.out.println("QUANTITA VENDIBILE: "+quantitaVendibile);
		
		
	Integer quantitaVendibileEntroSetteGiorni=0;
	for(Cisterna c:cantina.getCisterne()) {
		Integer quantitaEvaporata=c.getEvapPerDay()*7;
		if((c.getLivelloGas()-quantitaEvaporata)<cantina.getLivelloMinimoDiGas()) quantitaVendibileEntroSetteGiorni=quantitaVendibileEntroSetteGiorni+c.getQuantita();
	}
		System.out.println("QUANTITA NON VENDIBILE ENTRO 7 GIORNI: "+quantitaVendibileEntroSetteGiorni);
	
		
	Integer numeroMassimoDiGiorni=0;
	Integer i=1;
	
	for(Cisterna c:cantina.getCisterne()) {
		Integer numeroGiorniCisterna=1;
		while(c.getLivelloGas()-(c.getEvapPerDay()*numeroGiorniCisterna)<cantina.getLivelloMinimoDiGas()) {
			numeroGiorniCisterna++;
		}
		
		if(numeroGiorniCisterna>numeroMassimoDiGiorni) numeroMassimoDiGiorni=numeroGiorniCisterna;
		
	}
	
	System.out.println("GIORNI ENTRO IN CUI NON CI SARA' PIù BIBITA VENDIBILE:"+numeroMassimoDiGiorni);
	
	}	

}
