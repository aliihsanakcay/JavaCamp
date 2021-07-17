package findMinAndMaxNumbers;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Ka� tane say� gireceksiniz: ");
		int numberOfNumbers = input.nextInt();

		int minNumber = 0, maxNumber = 0;

		for (int i = 0; i < numberOfNumbers; i++) {
			System.out.print((i+1) + ". say�y� giriniz: ");
			int n = input.nextInt();
			if(minNumber>n) {
				minNumber = n;
			}
			if(maxNumber<n) {
				maxNumber = n;
			}
		}
		
		System.out.println("En b�y�k say�: " + maxNumber);
		System.out.println("En k���k say�: " + minNumber);

		input.close();
	}

}
