package sortArrayElements;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Dizinin boyutu n : ");
		int n = input.nextInt();
		System.out.println("Dizinin elemanlar�n� giriniz : ");
		
		int[] arr = new int[n]; 
		
		for (int i = 0; i < n; i++) {
			System.out.print((i+1) + ". Eleman� : ");
			arr[i] = input.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.print("S�ralama : ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		
		input.close();
	}

}
