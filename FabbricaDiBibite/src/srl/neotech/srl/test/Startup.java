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
		System.out.println(numCisterna);
	}	
		
	}

}
