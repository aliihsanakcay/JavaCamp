package hesapMakinesi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		
		int n1, n2, select;
		
		System.out.print("Ýlk sayýyý giriniz: ");
		n1 = inp.nextInt();
		System.out.print("Ýkinci sayýyý giriniz: ");
		n2 = inp.nextInt();
		
		System.out.println("1-Toplama\n2-Çýkarma\n3-Çarpma\n4-Bölme");
		System.out.print("Seçiminiz: ");
		select = inp.nextInt();
		
		switch (select) {
		case 1:
			System.out.println("Toplam: " + (n1 + n2));
			break;
		case 2:
			System.out.println("Çýkarma: " + (n1 - n2));
			break;
		case 3:
			System.out.println("Çarpma: " + (n1 * n2));
			break;
		case 4:
			if(n2!=0) {
				System.out.println("Bölme: " + (n1 / n2));
			}else {
				System.out.println("Bir sayý 0'a bölünemez!");
			}
			break;
		default:
			System.out.println("Yanlýþ seçim yaptýnýz. Tekrar deeyiniz.");
			break;
		}
		
		inp.close();
	}

}
