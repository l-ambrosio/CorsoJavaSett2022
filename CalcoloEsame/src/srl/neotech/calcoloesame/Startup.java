package srl.neotech.calcoloesame;

import java.util.Random;

public class Startup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Random rnd1=new Random();
		Random rnd2=new Random();
		

		
		for(int i=1;i<=4;i++) {
		Voti voto=new Voti();
		int votoS=rnd1.nextInt(-8, 8);
		int votoO=rnd2.nextInt(0, 24);
		
		if(votoS<=0) voto.setRisultatoTotale("lo studente è bocciato");
		if(votoS>=18&&votoO>=18) voto.setRisultatoTotale("lo studente è promosso");
		if(votoS>0&&votoO<=18&&votoS+votoO>24) voto.setRisultatoTotale("lo studente è promosso");
		if(votoS==30&&votoO==32) voto.setRisultatoTotale("30 e lode");
		if(votoS>=0&&votoO<=17) voto.setRisultatoTotale("lo studente è bocciato");
		if(votoS>=0&&votoO>=18) voto.setRisultatoTotale("lo studente è promosso");
		
		System.out.println("Il voto scritto è: "+votoS+" - Il voto orale è: "+votoO+" - Risultato: "+voto.getRisultatoTotale());
		
		}
		
	}

}
