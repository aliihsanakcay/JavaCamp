package findArmstrongNumber;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Say� giriniz: ");
		int n = input.nextInt();
		
		int numberOfDigits = 0, tempNumber = n;
		
		while (tempNumber!=0) {
			tempNumber /= 10;
			numberOfDigits++;
		}
		
		tempNumber = n;
		int total = 0;
		while (tempNumber!=0) {
			int digitValue = tempNumber%10;
			int subTotal = 1;
			for (int i = 0; i < numberOfDigits; i++) {
				subTotal *= digitValue;
			}
			total += subTotal;
			
			tempNumber /= 10;
		}
		
		if(total == n) {
			System.out.println(n + " say�s� bir Armstrong say�d�r.");
		}else {
			System.out.println(n + " say�s� bir Armstrong say� de�ildir.");
		}
		
		input.close();
	}
}
