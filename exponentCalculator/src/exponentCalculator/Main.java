package exponentCalculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Üssü alýnacak sayý : ");
		int n = input.nextInt();
		System.out.print("Üs olacak sayý : ");
		int k = input.nextInt();
		int total = 1;
		
		for (int i = 0; i < k; i++) {
			total *= n;
		}
		
		System.out.println("Sonuç : " + total);		
		
		input.close();
	}

}
