package srl.neotech;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Startup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("ciao1");
		System.out.println("ciao2");
		System.out.println("ciao3");
		
		int a=23;
		if(a<10) {
			System.out.println("<10");
			if(a<7) {
				System.out.println("è anche minore di 7");
			}
		}
		else {
			System.out.println(">=10");
		}
		
		for(int i=0;i<a;i++) {
			System.out.println(i);
		}
		
		
		Random rnd=new Random();
		int r=rnd.nextInt(1,13);
		a=78;
		while(a%r!=0) {
			r=rnd.nextInt(1,13);
			System.out.println("modulo diverso da 0"+r);
		}
		
		
		Aereo mioAereo=new Aereo();
		
		mioAereo.setCompagnia("British Airways");
		
		Aereo aereoFermo=new Aereo("Air France");
		System.out.println(aereoFermo.getCompagnia());
		
		aereoFermo.setVelocita(0);
		aereoFermo.accellera(20);
		System.out.println(aereoFermo.getVelocita());
		
		
		
		//ARRAY
		ArrayList<Aereo> aerei=new ArrayList<Aereo>(); //array dinamico
		
		aerei.add(aereoFermo);
		System.out.println(aerei.size());
		
		
		for(Aereo iesimoAereo:aerei) {
			System.out.println(iesimoAereo.getCompagnia());
		}	
		
		ArrayList<Aereo> aereiErrati=new ArrayList<>();
		for(int k=0;k<100;k++) {
			Aereo a7=new Aereo();
			aerei.add(a7);	
		}
		System.out.println(aereiErrati.size());
	
		
		//COLLECTION
		aereoFermo.setCompagnia("Qatar");
		Map<String, Aereo> mappaDiAerei=new HashMap<String, Aereo>();
		mappaDiAerei.put("ER284D", aereoFermo);
		mappaDiAerei.put("ER284F", aereoFermo);
		System.out.println(mappaDiAerei.get("ER284D").getCompagnia());
		
		Pesce p=new Pesce();
		p.mangia();
		p.nuota();
		
		
		//INTERFACCE
		IAlbero unaQuercia=new Quercia();
		IAlbero unPesco=new Pesco();
		
		unaQuercia.respira();
		unPesco.respira();
		
		unaQuercia.faiFiori();
		unPesco.faiFiori();
		
		
		
	}

}
