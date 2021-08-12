package mineSweeperGame;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Matris boyutlarýný giriniz.");
		System.out.print("Satýr sayýsý : ");
		int row = input.nextInt();
		System.out.print("Sütun sayýsýný giriniz : ");
		int column = input.nextInt();
		
		MineSweeper mineSweeper = new MineSweeper();
		mineSweeper.run(row, column);
		
		input.close();
	}

}
