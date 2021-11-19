package Exercicios5;

public class Exercicio3 {
	
	static int[][] somaMatriz(int[][] matriz1, int[][] matriz2) {
		if(matriz1.length != matriz2.length || matriz1[0].length != matriz2.length) {
			return null;
		}
		
		
		int[][] soma = new int[matriz1.length][matriz1[0].length];
		
		for(int i = 0; i < matriz1.length; i++) {
			for(int j = 0; j < matriz1[0].length; j++) {
				soma[i][j] = matriz1[i][j] + matriz2[i][j];
			}
		}
		
		return soma;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matriz1 = {
				{1, 2},
				{3, 4}
		};
		
		int[][] matriz2 = {
				{4, 3},
				{2, 1}
		};
		
		int[][] soma = somaMatriz(matriz1, matriz2);
		
		if(soma != null) {
			for(int i = 0; i < soma.length; i++) {
				for(int j = 0; j < soma[0].length; j++) {
					System.out.print(soma[i][j] + " ");
				}
				
				System.out.println("");
			}
		} else {
			System.out.println("Matriz inválida");
		}
		
		
		
	}

}
