package exponentCalculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("�ss� al�nacak say� : ");
		int n = input.nextInt();
		System.out.print("�s olacak say� : ");
		int k = input.nextInt();
		int total = 1;
		
		for (int i = 0; i < k; i++) {
			total *= n;
		}
		
		System.out.println("Sonu� : " + total);		
		
		input.close();
	}

}
