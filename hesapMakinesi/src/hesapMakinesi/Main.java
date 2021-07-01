package hesapMakinesi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		
		int n1, n2, select;
		
		System.out.print("�lk say�y� giriniz: ");
		n1 = inp.nextInt();
		System.out.print("�kinci say�y� giriniz: ");
		n2 = inp.nextInt();
		
		System.out.println("1-Toplama\n2-��karma\n3-�arpma\n4-B�lme");
		System.out.print("Se�iminiz: ");
		select = inp.nextInt();
		
		switch (select) {
		case 1:
			System.out.println("Toplam: " + (n1 + n2));
			break;
		case 2:
			System.out.println("��karma: " + (n1 - n2));
			break;
		case 3:
			System.out.println("�arpma: " + (n1 * n2));
			break;
		case 4:
			if(n2!=0) {
				System.out.println("B�lme: " + (n1 / n2));
			}else {
				System.out.println("Bir say� 0'a b�l�nemez!");
			}
			break;
		default:
			System.out.println("Yanl�� se�im yapt�n�z. Tekrar deeyiniz.");
			break;
		}
		
		inp.close();
	}

}
