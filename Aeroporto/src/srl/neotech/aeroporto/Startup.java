package srl.neotech.aeroporto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.github.javafaker.Faker;


public class Startup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Aeroporto aeroporto=new Aeroporto();
		Random rnd=new Random();
		Faker faker=new Faker();
		
		
		//AEREI IN AVVICINAMENTO
		for(int i=0;i<200;i++) {
			Aereo a=new Aereo();
			a.setDistanzaDallAereoporto(rnd.nextInt(100));
			a.setVelocita(rnd.nextInt(1,100));
			a.setIdUnivoco(i);
			a.setCompagniaAerea(faker.company().name());
			a.setOrario(rnd.nextInt(500));
			a.setStato(StatoAereo.IN_AVVICINAMENTO);
			
			Integer numPasseggeri=rnd.nextInt(200);
			ModelloAereo modello=new ModelloAereo();
			modello.setCapienzaNumPasseggeri(numPasseggeri);
			modello.setCostruttore(faker.company().name());
			modello.setCodiceModello(faker.code().isbn13());
			a.setModello(modello);
			
		
			for(int j=0;j<modello.getCapienzaNumPasseggeri();j++) {
				Passeggero p=null;
				Integer sceltaTipoPasseggero=rnd.nextInt(2);
				if(sceltaTipoPasseggero==0) p=new Excelsior();
				if(sceltaTipoPasseggero==1) p=new Business();
				if(sceltaTipoPasseggero==2) p=new Turista();
				
				p.setEta(rnd.nextInt(100));
				p.setIdUnivoco(j);
				Integer sceltaMF=rnd.nextInt(1);
				if(sceltaMF==0) p.setMF('M');
				if(sceltaMF==1) p.setMF('F');
				p.setHasBagagli(false);
				p.setHasFiore(false);
				a.getPasseggeri().add(p);
			}
			aeroporto.getAereiInAvvicinamento().add(a);
		}
		
		for(Aereo a:aeroporto.getAereiInAvvicinamento()) {
			System.out.println(a);
		}
		
		//AEREI IN PARTENZA
		for(int i=0;i<100;i++) {
			Aereo a=new Aereo();
			a.setDistanzaDallAereoporto(0);
			a.setVelocita(rnd.nextInt(1,100));
			a.setIdUnivoco(i);
			a.setCompagniaAerea(faker.company().name());
			a.setOrario(rnd.nextInt(500));
			a.setStato(StatoAereo.IN_PARTENZA);
			
			Integer numPasseggeri=rnd.nextInt(200);
			ModelloAereo modello=new ModelloAereo();
			modello.setCapienzaNumPasseggeri(numPasseggeri);
			modello.setCostruttore(faker.company().name());
			modello.setCodiceModello(faker.code().isbn13());
			a.setModello(modello);
			
			for(int j=0;j<modello.getCapienzaNumPasseggeri();j++) {
				Passeggero p=null;
				Integer sceltaTipoPasseggero=rnd.nextInt(2);
				if(sceltaTipoPasseggero==0) p=new Excelsior();
				if(sceltaTipoPasseggero==1) p=new Business();
				if(sceltaTipoPasseggero==2) p=new Turista();
				
				p.setEta(rnd.nextInt(100));
				p.setIdUnivoco(j);
				Integer sceltaMF=rnd.nextInt(1);
				if(sceltaMF==0) p.setMF('M');
				if(sceltaMF==1) p.setMF('F');
				p.setHasBagagli(false);
				p.setHasFiore(false);
				a.getPasseggeri().add(p);
			}
			aeroporto.getAereiInPartenza().add(a);
		}
		
		for(Aereo a:aeroporto.getAereiInPartenza()) {
			System.out.println(a);
	
		}
		
		//PASSEGGERI PRONTI PER IL CHECK-IN
		for(int i=0;i<1000;i++) {
			Passeggero p=null;
			Integer sceltaTipoPasseggero=rnd.nextInt(2);
			if(sceltaTipoPasseggero==0) p=new Excelsior();
			if(sceltaTipoPasseggero==1) p=new Business();
			if(sceltaTipoPasseggero==2) p=new Turista();
			
			p.setEta(rnd.nextInt(100));
			p.setIdUnivoco(i);
			Integer sceltaMF=rnd.nextInt(1);
			if(sceltaMF==0) p.setMF('M');
			if(sceltaMF==1) p.setMF('F');
			p.setHasBagagli(true);
			p.setHasFiore(false);
			aeroporto.getPasseggeriInAttesa().add(p);
		}
		
		for(Passeggero p:aeroporto.getPasseggeriInAttesa()) {
			System.out.println(p);
		}
		
		//ATTERRAGGIO AEREI
		for(Aereo a:aeroporto.getAereiInAvvicinamento()) {
			aeroporto.atterraggio(a);
		}
		
		//PARTENZA AEREI
		for(Aereo a:aeroporto.getAereiInPartenza()) {
			aeroporto.decollo(a);
		}
		
	}

}
