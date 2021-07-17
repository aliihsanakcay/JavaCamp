package calculateEBOBAndEKOK;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("1. sayýyý giriniz: ");
		int n1 = input.nextInt();
		System.out.print("2. sayýyý giriniz: ");
		int n2 = input.nextInt();

		int ebob = 1;
		int i=n1 < n2 ? n1 : n2;
		while (i <= n1 && i <= n2) {
			if (n1 % i == 0 && n2 % i == 0) {
				ebob = i;
				break;
			}
			i--;
		}
		
		int ekok = (n1 * n2) / ebob;

		System.out.println(n1 + " ve " + n2 + " sayýlarýnýn EBOB'u : " + ebob);
		System.out.println(n1 + " ve " + n2 + " sayýlarýnýn EKOK'u : " + ekok);

		input.close();
	}

}
