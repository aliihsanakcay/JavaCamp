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

		System.out.print("T�rk�e notunuz: ");
		int turkce = inp.nextInt();

		System.out.print("Tarih notunuz: ");
		int tarih = inp.nextInt();

		System.out.print("M�zik notunuz: ");
		int muzik = inp.nextInt();
		
		int toplam = matematik + fizik + kimya + turkce + tarih + muzik; 
		
		double ortalama = (double) toplam / 6.0;
		
		System.out.println("Ortalaman�z: " + String.format("%.2f", ortalama));
		
		System.out.println(ortalama>60 ? "S�n�f� Ge�ti" : "S�n�fta Kald�"); 
		
		inp.close();
	}

}
