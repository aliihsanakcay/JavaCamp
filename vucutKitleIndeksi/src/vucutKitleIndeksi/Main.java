package vucutKitleIndeksi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
		double height = inp.nextDouble();
		
		System.out.print("Lütfen kilonuzu (kg cinsinde) giriniz: ");
		int weight = inp.nextInt();
		
		// vki => vucut kitle indeksi
		double vki = (double) weight / (height * height);
		
		System.out.println("Vücut Kitle Ýndeksiniz: " + String.format("%.3f", vki));
		
		inp.close();
		
	}

}
