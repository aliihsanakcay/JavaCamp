package addingMultiplesOfFour;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n, total = 0;

		do {
			System.out.print("Say� giriniz : ");
			n = input.nextInt();

			if (n % 4 == 0) {
				total += n;
			}

		} while (n % 2 != 1);
		
		System.out.println("Toplam : " + total);

		input.close();
	}

}
