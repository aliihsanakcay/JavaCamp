package notOrtalamasi2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		System.out.print("Matematik notunuz: ");
		int matematik = inp.nextInt();

		System.out.print("T�rk�e notunuz: ");
		int turkce = inp.nextInt();

		System.out.print("Fizik notunuz: ");
		int fizik = inp.nextInt();

		System.out.print("Kimya notunuz: ");
		int kimya = inp.nextInt();

		System.out.print("M�zik notunuz: ");
		int muzik = inp.nextInt();

		double average = (double) (matematik + fizik + kimya + turkce + muzik) / 5.0;

		if (average <= 55) {
			System.out.println("S�n�fta kald�n�z, seneye tekrar g�r��mek �zere!");

		} else {
			System.out.println("Tebrikler, s�n�f� ge�tiniz!");
		}
		System.out.println("Ortalaman�z: " + String.format("%.2f", average));

		inp.close();
	}

}
