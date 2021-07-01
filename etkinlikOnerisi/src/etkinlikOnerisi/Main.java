package etkinlikOnerisi;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner inp =new Scanner(System.in);
		
		System.out.println("Sýcaklýk giriniz: ");
		int heat = inp.nextInt();
		
		if (heat < 5) {
			System.out.println("Kayak yapabilirsiniz.");
			
		} else if (heat >= 5 && heat <= 25 ) {
			if (heat <= 15) {
				System.out.println("Sinemaya gidebilirsiniz.");
			}
			if(heat >= 10) {
				System.out.println("Pikniðe gidebilirsiniz.");
			}
		} else {
			System.out.println("Yüzmeye gidebilirsiniz.");
		}
		
		inp.close();
	}
}
