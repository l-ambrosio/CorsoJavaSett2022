package srl.neotech.aeroporto;

import java.util.ArrayList;
import java.util.List;


public class Startup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		List<Aereo> aereiInPartenza=new ArrayList<Aereo>();
		List<Aereo> aereiInAvvicinamento=new ArrayList<Aereo>();
		
		Aeroporto aeroporto=new Aeroporto();
		Aereo a=new Aereo();
		Passeggero pass=new Passeggero();
		
		for(int i=0;i<100;i++) {
			Aereo unAereoInPartenza=new Aereo();
			aereiInPartenza.add(unAereoInPartenza);
			
		}
		
		System.out.println("Gli aerei in partenza sono: "+aereiInPartenza.size());
		

		for(int i=0;i<200;i++) {
			Aereo unAereoInAvvicinamento=new Aereo();
			aereiInAvvicinamento.add(unAereoInAvvicinamento);
		}
		
		System.out.println("Gli aerei in avvicinamento sono: "+aereiInAvvicinamento.size());
		
		for(int i=0;i<1000;i++) {
			Passeggero p=new Passeggero();
			aeroporto.getPasseggeri().add(p);
		}
		
		System.out.println("I passeggeri pronti per il check in sono: "+aeroporto.getPasseggeri().size());
		
		aeroporto.atterraggio(a);
		aeroporto.decollo(a);
		aeroporto.checkIn(a, pass);
	
	}

}
