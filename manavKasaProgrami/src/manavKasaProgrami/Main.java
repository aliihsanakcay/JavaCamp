package manavKasaProgrami;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);

		// Meyveler ve kg fiyatlari
		double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.0;
		
		System.out.print("Armut Ka� Kilo? : ");
		int armutKg = inp.nextInt();
		
		System.out.print("Elma Ka� Kilo? : ");
		int elmaKg = inp.nextInt();
		
		System.out.print("Domates Ka� Kilo? : ");
		int domatesKg = inp.nextInt();
		
		System.out.print("Muz Ka� Kilo? : ");
		int muzKg = inp.nextInt();
		
		System.out.print("Patl�can Ka� Kilo? : ");
		int patlicanKg = inp.nextInt();
		
		//toplam tutar
		double total = armut * armutKg + elma * elmaKg + domates * domatesKg + muz * muzKg + patlican * patlicanKg;
		
		System.out.println("Toplam Tutar: " + total + " TL");
		
		inp.close();
	}

}
