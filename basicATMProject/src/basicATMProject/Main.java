package basicATMProject;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String userName, password;
		int right = 3;
		int balance = 1500;
		int select;
		
		while (right > 0) {
			System.out.print("Kullan�c� Ad�n�z :");
			userName = input.nextLine();
			System.out.print("Parolan�z : ");
			password = input.nextLine();

			if (userName.equals("aliihsan") && password.equals("12345")) {
				System.out.println("Merhaba, X Bankas�na Ho�geldiniz!");
				do {
					System.out.println("1-Para yat�rma\n" + "2-Para �ekme\n" + "3-Bakiye Sorgula\n" + "4-��k�� Yap");
					System.out.print("L�tfen yapmak istedi�iniz i�lemi se�iniz : ");
					select = input.nextInt();
					int price;
					switch (select) {
					case 1:
						System.out.print("Para miktar� : ");
						price = input.nextInt();
						balance += price;
						break;

					case 2:
						System.out.print("Para miktar� : ");
						price = input.nextInt();
						if (price > balance) {
							System.out.println("Bakiye yetersiz.");
						} else {
							balance -= price;
						}
						break;

					case 3:
						System.out.println("Bakiyeniz : " + balance);
						break;

					case 4:
						System.out.println("Tekrar g�r��mek �zere.");
						break;

					default:
						System.out.println("L�tfen ge�erli bir say� giriniz.");
						break;
					}
				} while (select != 4);
				break;
			} else {
				right--;
				System.out.println("Hatal� kullan�c� ad� veya �ifre. Tekrar deneyiniz.");
				if (right == 0) {
					System.out.println("Hesab�n�z bloke olmu�tur l�tfen banka ile ileti�ime ge�iniz.");
				} else {
					System.out.println("Kalan Hakk�n�z : " + right);
				}
			}

		}

		input.close();
	}

}
