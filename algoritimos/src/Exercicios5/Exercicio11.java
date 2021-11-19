package Exercicios5;

public class Exercicio11 {
	
	static void matrizAleatoria() {
		double[][] matrix = new double[10][10];
		
		for(int i = 0; i <matrix.length ; i++) {
			for(int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = Math.round(Math.random() * 10);
				System.out.print(matrix[i][j] + " ");
			}
			
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		matrizAleatoria();
		
	}

}
