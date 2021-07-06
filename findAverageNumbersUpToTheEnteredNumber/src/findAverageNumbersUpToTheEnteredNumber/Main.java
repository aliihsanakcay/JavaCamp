package findAverageNumbersUpToTheEnteredNumber;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Say� giriniz : ");
		int number = input.nextInt();

		int total = 0;
		int numberOfNumbers = 0;
		for (int i = 0; i < number; i++) {
			if (i % 3 == 0 && i % 4 == 0) {
				total += i;
				numberOfNumbers++;
			}
		}

		System.out.println(
				"0'dan " + number + " say�s�na kadar olan say�lardan 3 ve 4'e tam b�l�nen say�lar�n ortalamas� : "
						+ String.format("%.1f", (double) (total / numberOfNumbers)));

		input.close();
	}

}
