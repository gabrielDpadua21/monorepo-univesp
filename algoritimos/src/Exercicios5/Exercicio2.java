package Exercicios5;

public class Exercicio2 {
	
	static int diagonalMatriz(int[][] matriz) {
		if(matriz.length != matriz[0].length) {
			return -1;
		}
		
		int soma = 0;
		
		for(int i = 0; i < matriz.length; i++) {
			int j = (matriz.length - 1) - i;
			soma += matriz[i][j];
		}
		
		return soma;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matriz = {
				{2, 5, 10, 4},
				{-3, 8, 1, 5},
				{4, 0, 7, 11},
				{3, -4, 1, 2}
		};
		
		int soma = diagonalMatriz(matriz);
		
		System.out.println(soma);

	}

}
