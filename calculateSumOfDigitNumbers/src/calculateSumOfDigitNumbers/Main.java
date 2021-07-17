package calculateSumOfDigitNumbers;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Sayý giriniz : ");
		int n = input.nextInt();

		int tempNumber = n, total = 0;

		while (tempNumber != 0) {
			total += tempNumber%10;
			tempNumber /= 10;
		}
		
		System.out.println(n + " sayýsýnýn basamaklarýnýn toplamý : " + total);

		input.close();
	}

}
