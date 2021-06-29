package daireAlanCevre;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		
		final double pi = 3.14;
		
		System.out.print("Dairenin yar��ap�n� giriniz: ");
		// r ==> radius of circle
		int r = inp.nextInt();
		
		System.out.print("Daire diliminin merkez a��s�n�n �l��s� giriniz: ");
		int angle = inp.nextInt();
		
		double area = (pi * (r * r) * angle) / 360.0 ;
		
		System.out.println("Daire diliminin alan�: " + String.format("%.3f", area));
		
	}
}
