package program;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		
		double tutar, kdvTutari, kdvliTutar; 

		System.out.print("Fiyat tutarýný giriniz: ");
		tutar = inp.nextDouble();

		if (tutar > 0 && tutar <= 1000) {
			
			double kdvOrani = 0.18;
			kdvTutari = tutar * kdvOrani;
			kdvliTutar = tutar + kdvTutari;
			
			System.out.println("KDV'siz Tutar: " + tutar);
			System.out.println("KDV'li Tutarý: " + String.format("%.2f", kdvliTutar));
			System.out.println("KDV Tutarý: " + String.format("%.2f", kdvTutari));
			System.out.println("KDV Oraný: " + kdvOrani);

		} else if (tutar > 1000) {
			
			double kdvOrani = 0.08;
			kdvTutari = tutar * kdvOrani;
			kdvliTutar = tutar + kdvTutari;
			
			System.out.println("KDV'siz Tutar: " + tutar);
			System.out.println("KDV'li Tutarý: " + String.format("%.2f", kdvliTutar));
			System.out.println("KDV Tutarý: " + String.format("%.2f", kdvTutari));
			System.out.println("KDV Oraný: " + kdvOrani);

		} else {
			System.out.println("Geçersiz bir fiyat girdiniz.");
		}

		inp.close();
	}

}
