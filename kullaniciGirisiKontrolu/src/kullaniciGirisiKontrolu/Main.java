package kullaniciGirisiKontrolu;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		String userName, password;

		System.out.print("Kallan�c� Ad�n�z: ");
		userName = inp.next();

		System.out.print("�ifreniz: ");
		password = inp.next();

		if (userName.equals("patika") && password.equals("java123")) {
			System.out.println("Giri� yapt�n�z!");
		} else {
			System.out.println("Bilgileriniz yanl��!");
		}

		inp.close();
	}

}
