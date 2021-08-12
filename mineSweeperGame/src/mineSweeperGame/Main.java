package mineSweeperGame;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Matris boyutlar�n� giriniz.");
		System.out.print("Sat�r say�s� : ");
		int row = input.nextInt();
		System.out.print("S�tun say�s�n� giriniz : ");
		int column = input.nextInt();
		
		MineSweeper mineSweeper = new MineSweeper();
		mineSweeper.run(row, column);
		
		input.close();
	}

}
