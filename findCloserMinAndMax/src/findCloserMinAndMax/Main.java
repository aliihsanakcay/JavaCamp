package findCloserMinAndMax;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] list = {15,12,788,1,-1,-778,2,0};
		
		System.out.print("Dizi : {");
		
		for (int i : list) {
			if(i == list[list.length-1]) {
				System.out.print(i + "}");
			}else {
				System.out.print(i + ",");
			}
		}
		
		System.out.print("\nGirilen Say� : ");
		int n = input.nextInt();	
	      
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i : list) {
            if (i < min && n < i) {
                min = i;
            }
            if (i > max && n > i) {
                max = i;
            }
        }

        System.out.println("Girilen say�dan k���k en yak�n say� : " + max);
        System.out.println("Girilen say�dan b�y�k en yak�n say� : " + min);
        
        input.close();
	}

}
