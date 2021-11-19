package Exercicios5;

public class Exercicio4 {
	
	static float[][] matrizTransposta(float[][] matriz) {
		
		float[][] transposta = new float[matriz[0].length][matriz.length];
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[0].length; j++) {
				transposta[j][i] = matriz[i][j];
			}
		}
		
		return transposta;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float[][] matriz = {
				{1, 2, 3},
				{2, 3, 1}
		};
		
		float[][] transposta = matrizTransposta(matriz);
		
		for(int i = 0; i < transposta.length; i++) {
			for(int j = 0; j < transposta[0].length; j++) {
				System.out.print(transposta[i][j] + " ");
			}
			
			System.out.println("");
		}
		
	}

}
