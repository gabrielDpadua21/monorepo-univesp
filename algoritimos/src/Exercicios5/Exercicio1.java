package Exercicios5;

public class Exercicio1 {
	
	static int[] maiorNaMatriz(int[][] matriz) {
		int maior = matriz[0][0];
		int[] vetores = new int[3];
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[0].length; j++) {
				if(maior < matriz[i][j]) {
					maior = matriz[i][j];
					vetores[0] = i;
					vetores[1] = j;
				}
			}
		}
		
		vetores[2] = maior;
		
		return vetores;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matriz = {
				{1, 2, 3, 4, 5},
				{5, 3, 2, 4, 5},
				{3, 5, 1, 10, 5}
		};
		
		int[] valores = maiorNaMatriz(matriz);
		
		System.out.println("O maior valor na matriz: " + valores[2]);
		System.out.println("Se encontra na posicao: [" + valores[0] + "][" + valores[1] + "]");
		
	}

}
