package notOrtalamasi2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		System.out.print("Matematik notunuz: ");
		int matematik = inp.nextInt();

		System.out.print("Türkçe notunuz: ");
		int turkce = inp.nextInt();

		System.out.print("Fizik notunuz: ");
		int fizik = inp.nextInt();

		System.out.print("Kimya notunuz: ");
		int kimya = inp.nextInt();

		System.out.print("Müzik notunuz: ");
		int muzik = inp.nextInt();

		double average = (double) (matematik + fizik + kimya + turkce + muzik) / 5.0;

		if (average <= 55) {
			System.out.println("Sýnýfta kaldýnýz, seneye tekrar görüþmek üzere!");

		} else {
			System.out.println("Tebrikler, sýnýfý geçtiniz!");
		}
		System.out.println("Ortalamanýz: " + String.format("%.2f", average));

		inp.close();
	}

}
