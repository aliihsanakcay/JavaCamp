package leapYearCalculation;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int year;
		boolean isLeapYear = false;

		System.out.print("Yýl Giriniz : ");
		year = input.nextInt();

		if (year % 4 == 0) {
			isLeapYear = true;
		}

		if (year % 100 == 0) {
			if (year % 400 == 0) {
				isLeapYear = true;
			} else {
				isLeapYear = false;
			}
		}

		if (isLeapYear) {
			System.out.println(year + " bir artýk yýldýr !");
		} else {
			System.out.println(year + " bir artýk yýl deðildir !");
		}

		input.close();
	}

}
