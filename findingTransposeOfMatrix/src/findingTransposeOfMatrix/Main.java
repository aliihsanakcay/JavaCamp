package findingTransposeOfMatrix;

public class Main {

	public static void main(String[] args) {
		int[][] matris = {
				{1, 2, 3},
				{4, 5, 6}, 
				{6, 9, 8}
		};
		
		System.out.println("Matris : ");
		for (int[] row : matris) {
			for (int col : row) {
				System.out.print(col + "\t");
			}
			System.out.println();
		}
		
		System.out.println("Transpoze : ");
		int[][] transpoze = new int[matris[0].length][matris.length];
		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris[i].length; j++) {
				transpoze[j][i] = matris[i][j];
			}
		}

		for (int[] row : transpoze) {
			for (int col : row) {
				System.out.print(col + "\t");
			}
			System.out.println();
		}
		
	}

}
