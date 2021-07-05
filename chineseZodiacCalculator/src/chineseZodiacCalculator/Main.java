package chineseZodiacCalculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int age;
		String zodiacSign = "";
		boolean isError = false;

		System.out.print("Doðum Yýlýnýzý Giriniz : ");
		age = input.nextInt();

		if (age > 0) {
			if (age % 12 == 0) {
				zodiacSign = "Maymun";
			} else if (age % 12 == 1) {
				zodiacSign = "Horoz";
			} else if (age % 12 == 2) {
				zodiacSign = "Köpek";
			} else if (age % 12 == 3) {
				zodiacSign = "Domuz";
			} else if (age % 12 == 4) {
				zodiacSign = "Fare";
			} else if (age % 12 == 5) {
				zodiacSign = "Öküz";
			} else if (age % 12 == 6) {
				zodiacSign = "Kaplan";
			} else if (age % 12 == 7) {
				zodiacSign = "Tavþan";
			} else if (age % 12 == 8) {
				zodiacSign = "Ejderha";
			} else if (age % 12 == 9) {
				zodiacSign = "Yýlan";
			} else if (age % 12 == 10) {
				zodiacSign = "At";
			} else if (age % 12 == 11) {
				zodiacSign = "Koyun";
			} else {
				isError = true;
			}
		}else {
			isError = true;
		}

		if (isError) {
			System.out.println("Hatalý Veri Girdiniz !");
		} else {
			System.out.println("Çin Zodyaðý Burcunuz : " + zodiacSign);
		}

		input.close();
	}

}
