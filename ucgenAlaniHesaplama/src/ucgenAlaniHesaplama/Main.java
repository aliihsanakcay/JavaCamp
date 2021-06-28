package ucgenAlaniHesaplama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		int a, b, c;

		System.out.print("1. kenarý giriniz: ");
		a = inp.nextInt();
		
		System.out.print("2. kenarý giriniz: ");
		b = inp.nextInt();
		
		System.out.print("3. kenarý giriniz: ");
		c = inp.nextInt();
		
		int u = (a + b + c) / 2; 
		
		double alanUcgen = (double)Math.sqrt(u * (u - a) * (u - b) * (u - c)); 
		
		System.out.println("Üçgenin alaný: " + String.format("%.2f", alanUcgen));
		
		inp.close();
		
	}

}
