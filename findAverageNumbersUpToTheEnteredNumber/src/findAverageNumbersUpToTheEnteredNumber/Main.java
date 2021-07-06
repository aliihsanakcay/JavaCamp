package findAverageNumbersUpToTheEnteredNumber;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Sayý giriniz : ");
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
				"0'dan " + number + " sayýsýna kadar olan sayýlardan 3 ve 4'e tam bölünen sayýlarýn ortalamasý : "
						+ String.format("%.1f", (double) (total / numberOfNumbers)));

		input.close();
	}

}
