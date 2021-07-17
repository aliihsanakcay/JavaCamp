package combinationCalculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("n sayýsý: ");
		int n = input.nextInt();

		System.out.print("r sayýsý: ");
		int r = input.nextInt();

		if (n > r && r > 0 && n > 0) {

			long dividend = 1, divisor = 1;

			for (int i = n; i > r; i--) {
				dividend *= i;
			}

			for (int i = 1; i <= n - r; i++) {
				divisor *= i;
			}

			long combination = (dividend / divisor);

			System.out.println("C(n,r) = " + combination);
		} else {
			System.out.println("n, r'den büyük olmalýdýr. n ve r pozitif bir sayý olmalýdýr.");
		}

		input.close();
	}

}
