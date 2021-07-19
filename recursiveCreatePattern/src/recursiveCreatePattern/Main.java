package recursiveCreatePattern;

import java.util.Scanner;

public class Main {

	static int createPattern(int num) {
		System.out.print(num + " ");
		if (num <= 0) {
			return num;
		}
		int tempNum = createPattern(num - 5) + 5;

		System.out.print(tempNum + " ");

		return tempNum;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("N Sayısı : ");
		int n = input.nextInt();

		createPattern(n);

		input.close();
	}

}
