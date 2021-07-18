package fibonacciSeries;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Fibonacci serisinin eleman sayýsý: ");
		int n = input.nextInt();

		int n1 = 0, n2 = 1;

		System.out.print(n + " Elemanlý Fibonacci Serisi : ");
		for (int i = 0; i < n; i++) {
			if (i == 0) {
				System.out.print(n1 + " ");
				continue;
			} else if (i == 1) {
				System.out.print(n2 + " ");
				continue;
			}

			System.out.print((n1 + n2) + " ");

			if (n1 < n2) {
				n1 = n1 + n2;
			} else {
				n2 = n1 + n2;
			}
		}
		input.close();
	}
}
