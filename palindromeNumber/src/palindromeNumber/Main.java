package palindromeNumber;

import java.util.Scanner;

public class Main {

	public static boolean isPalindrome(int number) {
		int reverseNumber = 0, tempNumber = number, digitNumber;

		while (tempNumber != 0) {
			digitNumber = tempNumber % 10;
			reverseNumber = (reverseNumber * 10) + digitNumber;
			tempNumber /= 10;
		}
		return (reverseNumber == number ? true : false);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Bir sayı giriniz: ");
		int n = input.nextInt();
		if (isPalindrome(n)) {
			System.out.println(n + " sayısı palindromdur.");
		}else {
			System.out.println(n + " sayısı palindrom değildir.");
		}
		
		input.close();
	}

}
