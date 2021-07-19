package recursivePrimeNumber;

import java.util.Scanner;

public class Main {
	
	static boolean isPrimeNumber(int number, int divide) {
		if(number == 1) {
			return false;
		}
		
		if(divide > (number/2)) {
			return true;
		}
		
		if(divide != 1 && number%divide == 0) {
			return false;
		}
		
		return isPrimeNumber(number, divide + 1);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Sayý Giriniz : ");
		int number = input.nextInt();
		
		boolean isPrimeNumber = isPrimeNumber(number, 1);
		
		if (isPrimeNumber) {
			System.out.println(number + " sayýsý ASALDIR !");
		} else {
			System.out.println(number + " sayýsý ASAL deðildir !");
		}
		
		input.close();
	}

}
