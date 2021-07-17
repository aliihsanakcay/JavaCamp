package findPrimeNumbersBetween1And100;

public class Main {

	public static void main(String[] args) {
		boolean isPrimeNumber = true;		
		for (int i = 2; i < 100; i++) {
			isPrimeNumber = true;
			for (int j = 1; j < i; j++) {
				if(i%j == 0 && j!=1 && j<i) {
					isPrimeNumber = false;
					break;							
				}
			}
			if (isPrimeNumber) {
				System.out.print(i + " ");
			}
		}
	}
}
