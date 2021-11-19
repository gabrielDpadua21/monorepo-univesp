package Exercicios5;

public class Exercicio12 {
	
	static int matrizPares(int[][] matriz) {
		int pares = 0;
		
		for(int i = 0; i < matriz.length ; i++) {
			for(int j = 0; j < matriz[0].length; j++) {
				if(matriz[i][j] % 2 == 0) {
					pares++;
				}
			}
		}
		
		return pares;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[][] matriz = {
				{1, 5},
				{3, 4}
		};
		
		int pares = matrizPares(matriz);
		
		System.out.println("Numero pares na matriz: " + pares);
		
	}

}
