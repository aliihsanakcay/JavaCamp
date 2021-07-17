package makeDiamondWithStars;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Basamak sayýsýný giriniz : ");
		int n = input.nextInt();

		for (int i = 1; i <= n/2+1; i++) {
			for (int j = 0; j < n/2+1 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i - 1; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < n/2+1 - i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		for (int i = n/2; i > 0; i--) {
			for (int j = 0; j < n/2+1- i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i - 1; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < n/2+1 - i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}

		input.close();
	}
}
