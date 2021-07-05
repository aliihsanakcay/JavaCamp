package flightTicketCalculation;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		int age, distance, tripType;
		double flightTicketPrice = 0.0;
		double perKmPrice = 0.10;
		boolean isError = false;

		System.out.print("Mesafeyi km türünden giriniz : ");
		distance = inp.nextInt();

		System.out.print("Yaþýnýzý giriniz : ");
		age = inp.nextInt();

		System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiþ Dönüþ ): ");
		tripType = inp.nextInt();

		if (distance > 0 && age > 0) {
			flightTicketPrice = perKmPrice * (double) distance;

			if (age < 12) {
				flightTicketPrice = flightTicketPrice - flightTicketPrice * 0.50;
			} else if (age < 24) {
				flightTicketPrice = flightTicketPrice - flightTicketPrice * 0.10;
			} else if (age > 65) {
				flightTicketPrice = flightTicketPrice - flightTicketPrice * 0.30;
			}

			switch (tripType) {
			case 1:
				break;
			case 2:
				flightTicketPrice = flightTicketPrice - flightTicketPrice * 0.20;
				flightTicketPrice *= 2;
				break;

			default:
				isError = true;
				break;
			}
		} else {
			isError = true;
		}

		if (isError) {
			System.out.println("\nHatalý Veri Girdiniz !");
		}else {
			System.out.println("\nToplam Tutar = " + flightTicketPrice + " TL");
		}
		
		inp.close();
	}

}
