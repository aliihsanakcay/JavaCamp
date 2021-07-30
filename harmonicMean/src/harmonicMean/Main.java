package harmonicMean;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 12};
		double sum = 0.0;
		for (int i = 0; i < numbers.length; i++) {
			sum += 1.0 / numbers[i];
		}
		
		double harmonicMean = numbers.length / sum;
		
		System.out.println(Arrays.toString(numbers) + "\nDizisinin Harmonik Ortalamasý : "+ String.format("%.3f", harmonicMean));
	}

}
