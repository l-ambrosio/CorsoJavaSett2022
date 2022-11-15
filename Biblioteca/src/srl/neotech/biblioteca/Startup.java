package srl.neotech.biblioteca;

import java.util.Random;

import com.github.javafaker.Faker;


public class Startup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Faker faker=new Faker();
		
		String titolo=faker.name().fullName();
		String autore=faker.name().firstName();
		
		
		Biblioteca biblioteca=new Biblioteca();
		Random rnd=new Random();
		
		for(int i=1;i<100;i++) {
		Libro unLibroDaAggiungere=new Libro();
		int numCasuale=rnd.nextInt(1,4);
		if(numCasuale==1) unLibroDaAggiungere.setSezione(SezioneLibri.FANTASY.toString());
		if(numCasuale==2) unLibroDaAggiungere.setSezione(SezioneLibri.HORROR.toString());
		if(numCasuale==3) unLibroDaAggiungere.setSezione(SezioneLibri.ROMANZO.toString());
		if(numCasuale==4) unLibroDaAggiungere.setSezione(SezioneLibri.GIALLO.toString());
		
		unLibroDaAggiungere.setIdLibro(i);
		unLibroDaAggiungere.setScaffale(i);
		unLibroDaAggiungere.setAutore(autore);
		unLibroDaAggiungere.setTitolo(titolo);
		
		biblioteca.getLibri().add(unLibroDaAggiungere);
		biblioteca.getLibri().remove(numCasuale);
		
		}
		
		for(Libro l:biblioteca.getLibri()) {
			System.out.println(l);

		}
		
		for(int i=0;i<100;i++) {
		Associato unAssociatoDaAggiungere=new Associato();
		int numCasuale=rnd.nextInt(1,2);
		if(numCasuale==1) unAssociatoDaAggiungere.setStato(StatoAssociato.ATTIVO.toString());
		if(numCasuale==2) unAssociatoDaAggiungere.setStato(StatoAssociato.DISATTIVO.toString());	
		
		unAssociatoDaAggiungere.setIdAssociato(i);
		unAssociatoDaAggiungere.setNominativo(autore);
		
		biblioteca.getAssociati().add(unAssociatoDaAggiungere);
		biblioteca.getAssociati().remove(numCasuale);

		unAssociatoDaAggiungere.libriPresi.add(numCasuale);
		
		}
		
		for(Associato a:biblioteca.getAssociati()) {
			System.out.println(a);
			
		}
		
	}

}
