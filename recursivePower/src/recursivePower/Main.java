package recursivePower;

import java.util.Scanner;

public class Main {
	
	static int power(int base, int exponent) {
		if(exponent == 0) {
			return 1;
		}
		
		return base * power(base, exponent - 1);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Taban de�eri giriniz : ");
		int base = input.nextInt();
		System.out.print("�s de�erini giriniz : ");
		int exponent = input.nextInt();
		
		int result = power(base, exponent);
		System.out.println("Sonu� : " + result);
		
		input.close();
	}

}
