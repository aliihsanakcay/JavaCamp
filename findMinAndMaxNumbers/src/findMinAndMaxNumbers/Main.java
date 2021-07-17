package findMinAndMaxNumbers;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Kaç tane sayý gireceksiniz: ");
		int numberOfNumbers = input.nextInt();

		int minNumber = 0, maxNumber = 0;

		for (int i = 0; i < numberOfNumbers; i++) {
			System.out.print((i+1) + ". sayýyý giriniz: ");
			int n = input.nextInt();
			if(minNumber>n) {
				minNumber = n;
			}
			if(maxNumber<n) {
				maxNumber = n;
			}
		}
		
		System.out.println("En büyük sayý: " + maxNumber);
		System.out.println("En küçük sayý: " + minNumber);

		input.close();
	}

}
