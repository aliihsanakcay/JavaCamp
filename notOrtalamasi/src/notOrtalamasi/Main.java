package notOrtalamasi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		System.out.print("Matematik notunuz: ");
		int matematik = inp.nextInt();

		System.out.print("Fizik notunuz: ");
		int fizik = inp.nextInt();

		System.out.print("Kimya notunuz: ");
		int kimya = inp.nextInt();

		System.out.print("Türkçe notunuz: ");
		int turkce = inp.nextInt();

		System.out.print("Tarih notunuz: ");
		int tarih = inp.nextInt();

		System.out.print("Müzik notunuz: ");
		int muzik = inp.nextInt();
		
		int toplam = matematik + fizik + kimya + turkce + tarih + muzik; 
		
		double ortalama = (double) toplam / 6.0;
		
		System.out.println("Ortalamanýz: " + String.format("%.2f", ortalama));
		
		System.out.println(ortalama>60 ? "Sýnýfý Geçti" : "Sýnýfta Kaldý"); 
		
		inp.close();
	}

}
