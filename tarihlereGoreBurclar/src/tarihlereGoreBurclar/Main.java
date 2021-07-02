package tarihlereGoreBurclar;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		System.out.print("Do�du�unuz ay: ");
		int month = inp.nextInt();

		System.out.print("Do�du�unuz g�n: ");
		int day = inp.nextInt();
		
		String burc = "";
		boolean isError = false;
		
		if (month == 1) {
			if(day >= 1 && day <= 31) {
				if (day<22) {
					burc = "O�lak";
				} else {
					burc = "Kova";
				}
			}else {
				isError = true;
			}
		} else if (month == 2) {
			if(day >= 1 && day <= 28) {
				if (day<20) {
					burc = "Kova";
				} else {
					burc = "Bal�k";
				}
			}else {
				isError = true;
			}
		} else if (month == 3) {
			if(day >= 1 && day <= 31) {
				if (day<21) {
					burc = "Bal�k";
				} else {
					burc = "Ko�";
				}
			}else {
				isError = true;
			}
		} else if (month == 4) {
			if(day >= 1 && day <= 30) {
				if (day<21) {
					burc = "Ko�";
				} else {
					burc = "Bo�a";
				}
			}else {
				isError = true;
			}
		} else if (month == 5) {
			if(day >= 1 && day <= 31) {
				if (day<22) {
					burc = "Bo�a";
				} else {
					burc = "�kizler";
				}
			}else {
				isError = true;
			}
		} else if (month == 6) {
			if(day >= 1 && day <= 30) {
				if (day<23) {
					burc = "�kizler";
				} else {
					burc = "Yenge�";
				}
			}else {
				isError = true;
			}
		} else if (month == 7) {
			if(day >= 1 && day <= 31) {
				if (day<23) {
					burc = "Yenge�";
				} else {
					burc = "Aslan";
				}
			}else {
				isError = true;
			}
		} else if (month == 8) {
			if(day >= 1 && day <= 31) {
				if (day<23) {
					burc = "Aslan";
				} else {
					burc = "Ba�ak";
				}
			}else {
				isError = true;
			}
		} else if (month == 9) {
			if(day >= 1 && day <= 30) {
				if (day<23) {
					burc = "Ba�ak";
				} else {
					burc = "Terazi";
				}
			}else {
				isError = true;
			}
		} else if (month == 10) {
			if(day >= 1 && day <= 31) {
				if (day<23) {
					burc = "Terazi";
				} else {
					burc = "Akrep";
				}
			}else {
				isError = true;
			}
		} else if (month == 11) {
			if(day >= 1 && day <= 30) {
				if (day<22) {
					burc = "Akrep";
				} else {
					burc = "Yay";
				}
			}else {
				isError = true;
			}
		} else if (month == 12) {
			if(day >= 1 && day <= 31) {
				if (day<22) {
					burc = "Yay";
				} else {
					burc = "O�lak";
				}
			}else {
				isError = true;
			}
		} else {
			isError = true;
		}
		
		if (isError) {
			System.out.println("Hatal� giri� yapt�n�z, tekrar deneyiniz.");
		} else {
			System.out.println("Merhaba, burcunuz: " + burc);
		}
		
		inp.close();
	}

}
