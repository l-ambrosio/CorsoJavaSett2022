package srl.neotech.corso;

import java.util.Random;

public class Startup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Giocatore g1=new Giocatore();
		Giocatore g2=new Giocatore();
		
		Random rnd=new Random();
		
		
		
		
			int m=rnd.nextInt(2-0)+0;
				switch (m) {
				case 0:
					g1.setMossa("carta");
					g2.setMossa("forbice");
					System.out.println("vince il giocatore 2");
					break;
				case 1:
					g1.setMossa("sasso");
					g2.setMossa("forbice");
					System.out.println("vince il giocatore 1");
					break;
				case 2:
					g1.setMossa("carta");
					g2.setMossa("sasso");
					System.out.println("vince il giocatore 1");
					break;
		
					
			}
		}

	}

