package mineSweeperGame;

import java.util.Scanner;

public class MineSweeper {

	char[][] mineField;
	int[][] mineFieldTemp;
	private int numberOfNonMines;
	private String lineGap;

	public MineSweeper() {
		numberOfNonMines = 0;
		lineGap = "=================================";
	}

	public void run(int row, int column) {
		
		mineField = new char[row][column];
		mineFieldTemp = new int[row][column];
		minePlacementRandomly(row, column);

		System.out.println("Mayýnlarýn Konumu : ");
		printCharArr(mineField);
		System.out.println(lineGap);
		
		System.out.println("Mayýn Tarlasý Oyununa Hoþgeldiniz !");
		printIntArr(mineFieldTemp);
		
		startGame();
	}
	
	public void startGame() {
		Scanner input = new Scanner(System.in);
		for(int i=numberOfNonMines; i>0; i--) {
			
			System.out.print("Satýr giriniz : ");
			int inputRow = input.nextInt();
			System.out.print("Sütun Giriniz : ");
			int inputColumn = input.nextInt();
			
			if(inputRow>=0 && inputRow<mineFieldTemp.length && inputColumn>=0 && inputColumn<mineFieldTemp[0].length) {
				if(mineField[inputRow][inputColumn]=='*') {
					System.out.println("Game Over!!");
					System.out.println(lineGap);
					break;
				}
				
				if(mineFieldTemp[inputRow][inputColumn] != -1) {
					i++;
					System.out.println("Önceden bu deðerleri girdiniz. Lütfen baþka deðerler giriniz. ");
					continue;
				}
				mineFieldTemp[inputRow][inputColumn] = numberOfMine(inputRow, inputColumn);
			}else {
				System.out.println("Geçerli bir sayý giriniz.");
				i++;
			}
			
			if(i == 1) {
				System.out.println("Oyunu Kazandýnýz !");
				printIntArr(mineFieldTemp);
				System.out.println(lineGap);
				break;
			}
			
			System.out.println(lineGap);
			printIntArr(mineFieldTemp);
		}
		
		input.close();
	}
	
	public int numberOfMine(int row, int column) {
		int total = 0;
		if(row-1>=0 && column-1>=0 && mineField[row-1][column-1] == '*') {
			total++;
		}
		if(row-1>=0 && mineField[row-1][column] == '*') {
			total++;
		}
		if(row-1>=0 && column+1<mineField[0].length && mineField[row-1][column+1] == '*') {
			total++;
		}
		if(column-1>=0 && mineField[row][column-1] == '*') {
			total++;
		}
		if(column+1<mineField[0].length && mineField[row][column+1] == '*') {
			total++;
		}
		if(column-1>=0 && row+1<mineField.length && mineField[row+1][column-1] == '*') {
			total++;
		}
		if(row+1<mineField.length && mineField[row+1][column] == '*') {
			total++;
		}
		if(column+1<mineField[0].length && row+1<mineField.length && mineField[row+1][column+1] == '*') {
			total++;
		}
		return total;
	}
	
	public void minePlacementRandomly(int row, int column) {
		
		for (int i = 0; i < (row * column / 4); i++) {
			int rowRandom = (int) (Math.random() * row);
			int columnRandom = (int) (Math.random() * column);
			if(mineField[rowRandom][columnRandom] == '*') {
				i--;
				continue;
			}
			mineField[rowRandom][columnRandom] = '*';
		}
		
		numberOfNonMines = row * column - (row * column / 4);
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (mineField[i][j] != '*') {
					mineField[i][j] = '-';
				}
				mineFieldTemp[i][j] = -1;
			}
		}
	}

	public void printCharArr(char[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void printIntArr(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if(arr[i][j] == -1) {
					System.out.print("- ");
					continue;
				}
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
