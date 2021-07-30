package findingFrequencyOfElementsInArray;

public class Main {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 20, 10, 10, 20, 5, 20 };

		int[][] temp = new int[arr.length][arr.length];
		int startIndex = 0;
		boolean isFind = false;

		System.out.print("Dizi : [");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.print(arr[i] + "]");
			} else {
				System.out.print(arr[i] + ", ");
			}
		}

		System.out.println("\nTekrar Sayýlarý");

		for (int i = 0; i < arr.length; i++) {
			isFind = false;
			for (int j = 0; j < temp.length; j++) {
				if (temp[j][0] == arr[i] && temp[j][1] != 0) {
					temp[j][1]++;
					isFind = true;
					break;
				}
			}
			if (!isFind) {
				temp[startIndex][0] = arr[i];
				temp[startIndex][1]++;
				startIndex++;
			}
		}
		
		for (int[] i : temp) {
			if( i[1] == 0) {
				break;
			}
			System.out.println(i[0] +" sayýsý " + i[1] + " kere tekrar edildi.");
		}
	}

}
