package leapYearCalculation;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int year;
		boolean isLeapYear = false;

		System.out.print("Y�l Giriniz : ");
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
			System.out.println(year + " bir art�k y�ld�r !");
		} else {
			System.out.println(year + " bir art�k y�l de�ildir !");
		}

		input.close();
	}

}
