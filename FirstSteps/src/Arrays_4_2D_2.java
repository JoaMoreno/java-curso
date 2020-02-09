
public class Arrays_4_2D_2 {

	public static void main(String[] args) {

		int[][] matrix = { 
				{ 10, 15, 18, 19, 21 },
				{ 15, 65, 26, 48, 41 },
				{ 32, 45, 87, 15, 32 },
				{ 41, 52, 63, 85, 74 } };

		// for each
		for (int[] fila : matrix) {
			
			for (int z : fila) {
				
				System.out.print(z+" ");
				
			}
		
			System.out.println();
			
		}
	}

}
