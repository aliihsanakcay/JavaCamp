package findPerfectNumber;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Bir say� giriniz: ");
		int n = input.nextInt();

		int total = 0;

		for (int i = 1; i < n; i++) {
			total += (n % i == 0 ? i : 0);
		}

		if (n == total) {
			System.out.println(n + " M�kemmel say�d�r.");
		} else {
			System.out.println(n + " M�kemmel say� de�ildir.");
		}

		input.close();
	}

}
