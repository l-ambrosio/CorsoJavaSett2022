package srl.neotech.test.date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Startup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//CREARE
		System.out.println(System.currentTimeMillis());
		Date d=new Date(System.currentTimeMillis());
		
		//GESTIRE
		GregorianCalendar gc=new GregorianCalendar();
		gc.setTime(d);
		printDate(gc);
		
		gc.add(GregorianCalendar.MONTH, 7);
		printDate(gc);
		gc.add(GregorianCalendar.YEAR, -23);
		printDate(gc);
		
		GregorianCalendar gc2=new GregorianCalendar();
		gc2.set(2013, 5, 21);
		//CONFRONTA LE DUE DATE
		System.out.println(gc.before(gc2));
		
		//FORMATTAZIONE
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/YY hh:mm:ss");
		System.out.println(sdf.format(d));
		
		
		
	}
		
	private static void printDate(GregorianCalendar gc) {
		System.out.println(gc.get(GregorianCalendar.YEAR));
		System.out.println(gc.get(GregorianCalendar.MONTH));
		System.out.println(gc.get(GregorianCalendar.DAY_OF_MONTH));
		System.out.println(gc.get(GregorianCalendar.DAY_OF_YEAR));
		System.out.println("-----------------");
	}

}
