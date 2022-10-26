package srl.neotech.corso.allocazione;

public class Startup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Giocatore g1=new Giocatore();
	Giocatore g2=new Giocatore();
	TavoloDaGioco tavolo=new TavoloDaGioco();
	
	g1.setAnni(28);
	g1.setLivelloAbilita(6);
	g1.setNome("Valerio");
	g2.setAnni(30);
	g2.setLivelloAbilita(8);
	g2.setNome("Michele");
	tavolo.setCelle(64);
	tavolo.calcoloColore();
	tavolo.calcoloPezzoOccupato();
	
	System.out.println("Giocatore 1 nome: "+g1.getNome()+"anni: "+g1.getAnni()+" livello abilità:"+g1.getLivelloAbilita());
	System.out.println("Giocatore 2 nome: "+g2.getNome()+"anni: "+g2.getAnni()+" livello abilità:"+g2.getLivelloAbilita());
	
	
	System.out.println("Il tavolo ha: "+tavolo.getCelle()+" celle");
		

	}

}
	

