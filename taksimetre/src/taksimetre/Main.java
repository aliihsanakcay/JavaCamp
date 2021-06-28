package taksimetre;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		double perKm = 2.20, minPrice = 20.0;
		int startPrice = 10, km = 0;

		System.out.print("Mesafeyi km cinsinden giriniz: ");
		km = inp.nextInt();

		double totalPrice = (double) startPrice + (double) km * perKm;

		totalPrice = totalPrice > 20.0 ? totalPrice : minPrice;

		System.out.print("Ödenecek toplam tutar: " + String.format("%.2f", totalPrice));

		inp.close();

	}
}
