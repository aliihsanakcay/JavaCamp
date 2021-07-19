package calculator;

import java.util.Scanner;

public class Main {

	static void sum(int a, int b) {
		int result = a+b;
		System.out.println("Toplam : " + result);
	}
	
	static void minus(int a, int b) {
		int result = a-b;
		System.out.println("��karma : " + result);
	}	

	static void multiple(int a, int b) {
		int result = a*b;
		System.out.println("�arpma : " + result);
	}

	static void divided(int a, int b) {
		if(b==0) {
			System.out.println("�kinci say� 0'dan farkl� olmal�.");
			return;
		}
		int result = a/b;
		System.out.println("B�lme : " + result);
	}
	
	static void power(int a, int b) {
		int result = 1;
		for (int i = 0; i < b; i++) {
			result *= a;
		}
		System.out.println("�s Hesab� : " + result);
	}

	static void mod(int a, int b) {
		int result = a%b;
		System.out.println("Mod ��lemi : " + result);
	}

	static void rectangle(int a, int b) {
		System.out.println("Dikd�rtgenin �evresi : " + (2*(a+b)));
		System.out.println("Dikd�rtgenin Alan� : " + (a*b));
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int select;
		
		String menu = "1- Toplama ��lemi\n"
				+ "2- ��karma ��lemi\n"
				+ "3- �arpma ��lemi\n"
				+ "4- B�lme ��lemi\n"
				+ "5- �sl� Say� Hesaplama\n"
				+ "6- Mod Alma\n"
				+ "7- Dikd�rtgen Alan ve �evre Hesab�\n"
				+ "0- ��k�� Yap";
		
		while(true) {
			System.out.println(menu);
			System.out.print("Bir i�lem se�iniz: ");
			select = input.nextInt();
			
			if(select ==0) {
				break;
			}
			
			System.out.print("�lk say� : ");
			int a = input.nextInt();
			System.out.print("�kinci say� : ");
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
				System.out.println("Ge�ersiz bir i�lem girdiniz, tekrar deneyiniz.");
				break;
			}
			
		}
		
		input.close();
	}

}
