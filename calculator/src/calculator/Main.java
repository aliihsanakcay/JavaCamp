package calculator;

import java.util.Scanner;

public class Main {

	static void sum(int a, int b) {
		int result = a+b;
		System.out.println("Toplam : " + result);
	}
	
	static void minus(int a, int b) {
		int result = a-b;
		System.out.println("Çýkarma : " + result);
	}	

	static void multiple(int a, int b) {
		int result = a*b;
		System.out.println("Çarpma : " + result);
	}

	static void divided(int a, int b) {
		if(b==0) {
			System.out.println("Ýkinci sayý 0'dan farklý olmalý.");
			return;
		}
		int result = a/b;
		System.out.println("Bölme : " + result);
	}
	
	static void power(int a, int b) {
		int result = 1;
		for (int i = 0; i < b; i++) {
			result *= a;
		}
		System.out.println("Üs Hesabý : " + result);
	}

	static void mod(int a, int b) {
		int result = a%b;
		System.out.println("Mod Ýþlemi : " + result);
	}

	static void rectangle(int a, int b) {
		System.out.println("Dikdörtgenin Çevresi : " + (2*(a+b)));
		System.out.println("Dikdörtgenin Alaný : " + (a*b));
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int select;
		
		String menu = "1- Toplama Ýþlemi\n"
				+ "2- Çýkarma Ýþlemi\n"
				+ "3- Çarpma Ýþlemi\n"
				+ "4- Bölme Ýþlemi\n"
				+ "5- Üslü Sayý Hesaplama\n"
				+ "6- Mod Alma\n"
				+ "7- Dikdörtgen Alan ve Çevre Hesabý\n"
				+ "0- Çýkýþ Yap";
		
		while(true) {
			System.out.println(menu);
			System.out.print("Bir iþlem seçiniz: ");
			select = input.nextInt();
			
			if(select ==0) {
				break;
			}
			
			System.out.print("Ýlk sayý : ");
			int a = input.nextInt();
			System.out.print("Ýkinci sayý : ");
			int b = input.nextInt();
			
			switch (select) {
			case 1:
				sum(a, b);
				break;

			case 2:
				minus(a, b);
				break;

			case 3:
				multiple(a, b);
				break;

			case 4:
				divided(a, b);
				break;

			case 5:
				power(a, b);
				break;

			case 6:
				mod(a, b);
				break;

			case 7:
				rectangle(a, b);
				break;

			default:
				System.out.println("Geçersiz bir iþlem girdiniz, tekrar deneyiniz.");
				break;
			}
			
		}
		
		input.close();
	}

}
