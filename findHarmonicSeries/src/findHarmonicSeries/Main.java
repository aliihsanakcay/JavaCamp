package findHarmonicSeries;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("N say�s�n� giriniz: ");
		int n = input.nextInt();

		double result = 0;

		for (double i = 1; i <= n; i++) {
			result += 1 / i;
		}

		System.out.println("Sonu� : " + String.format("%.3f", result));

		input.close();
	}
}
