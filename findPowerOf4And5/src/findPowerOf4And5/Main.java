package findPowerOf4And5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("S�n�r say�s�n� giriniz : ");
		int n = input.nextInt();

		System.out.println("4'�n katlar�: ");
		for (int i = 1; i <= n; i *= 4) {
			System.out.println(i);
		}
		
		System.out.println("5'in katlar�: ");
		for (int i = 1; i <= n; i *= 5) {
			System.out.println(i);
		}
		
		input.close();
	}
}