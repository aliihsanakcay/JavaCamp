package etkinlikOnerisi;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner inp =new Scanner(System.in);
		
		System.out.println("S�cakl�k giriniz: ");
		int heat = inp.nextInt();
		
		if (heat < 5) {
			System.out.println("Kayak yapabilirsiniz.");
			
		} else if (heat >= 5 && heat <= 25 ) {
			if (heat <= 15) {
				System.out.println("Sinemaya gidebilirsiniz.");
			}
			if(heat >= 10) {
				System.out.println("Pikni�e gidebilirsiniz.");
			}
		} else {
			System.out.println("Y�zmeye gidebilirsiniz.");
		}
		
		inp.close();
	}
}
