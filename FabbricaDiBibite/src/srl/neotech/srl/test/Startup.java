package srl.neotech.srl.test;

import java.util.ArrayList;
import java.util.Random;

public class Startup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ArrayList <Cisterna> cisterna=new ArrayList<Cisterna>();
	
	for(int i=0;i<100;i++) {
		Random rnd=new Random();
		int numCisterna=rnd.nextInt(100-1)+1;
		Cisterna c=new Cisterna();
		
		if(numCisterna>=0&&numCisterna<30) {
			c.setTipoCisterna("alluminio");
			c.setLivelloGas(20);
			c.setQuantita(50);
			c.setEvapPerDay(10);
		}
		if(numCisterna>=31&&numCisterna<=50) {
			c.setTipoCisterna("rame");
			c.setLivelloGas(10);
			c.setQuantita(40);
			c.setEvapPerDay(20);
		}
		if(numCisterna>=51&&numCisterna<100) {
			c.setTipoCisterna("acciaio");
			c.setLivelloGas(30);
			c.setQuantita(60);
			c.setEvapPerDay(5);
		}
		
		System.out.println("n"+numCisterna+" Tipo Cisterna: "+c.getTipoCisterna()+" Gas evaporato: "+c.getEvapPerDay()+" Livello Gas: "+c.getLivelloGas()+" Litri: "+c.getQuantita());
	}	
		
	}

}
