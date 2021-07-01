package kullaniciGirisiKontrolu;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		String userName, password;

		System.out.print("Kallanýcý Adýnýz: ");
		userName = inp.next();

		System.out.print("Þifreniz: ");
		password = inp.next();

		if (userName.equals("patika") && password.equals("java123")) {
			System.out.println("Giriþ yaptýnýz!");
		} else {
			System.out.println("Bilgileriniz yanlýþ!");
		}

		inp.close();
	}

}
