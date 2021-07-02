package ucSayiyiKucuktenBuyugeSiralama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		System.out.print("1. sayý: ");
		int a = inp.nextInt();

		System.out.print("2. sayý: ");
		int b = inp.nextInt();

		System.out.print("3. sayý: ");
		int c = inp.nextInt();

		if (a < b && a < c) {
			if (b < c) {
				System.out.println(a + " < " + b + " < " + c);
			} else {
				System.out.println(a + " < " + c + " < " + b);
			}
		} else if (b < a && b < c) {
			if (a < c) {
				System.out.println(b + " < " + a + " < " + c);
			} else {
				System.out.println(b + " < " + c + " < " + a);
			}
		} else {
			if (a < b) {
				System.out.println(c + " < " + a + " < " + b);
			} else {
				System.out.println(c + " < " + b + " < " + a);
			}
		}

		inp.close();
	}

}
