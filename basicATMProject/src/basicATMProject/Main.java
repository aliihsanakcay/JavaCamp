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
			System.out.print("Kullanýcý Adýnýz :");
			userName = input.nextLine();
			System.out.print("Parolanýz : ");
			password = input.nextLine();

			if (userName.equals("aliihsan") && password.equals("12345")) {
				System.out.println("Merhaba, X Bankasýna Hoþgeldiniz!");
				do {
					System.out.println("1-Para yatýrma\n" + "2-Para Çekme\n" + "3-Bakiye Sorgula\n" + "4-Çýkýþ Yap");
					System.out.print("Lütfen yapmak istediðiniz iþlemi seçiniz : ");
					select = input.nextInt();
					int price;
					switch (select) {
					case 1:
						System.out.print("Para miktarý : ");
						price = input.nextInt();
						balance += price;
						break;

					case 2:
						System.out.print("Para miktarý : ");
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
						System.out.println("Tekrar görüþmek üzere.");
						break;

					default:
						System.out.println("Lütfen geçerli bir sayý giriniz.");
						break;
					}
				} while (select != 4);
				break;
			} else {
				right--;
				System.out.println("Hatalý kullanýcý adý veya þifre. Tekrar deneyiniz.");
				if (right == 0) {
					System.out.println("Hesabýnýz bloke olmuþtur lütfen banka ile iletiþime geçiniz.");
				} else {
					System.out.println("Kalan Hakkýnýz : " + right);
				}
			}

		}

		input.close();
	}

}
