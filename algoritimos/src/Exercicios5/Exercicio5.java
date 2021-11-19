package Exercicios5;

public class Exercicio5 {
	
	static int[][] matrizTransposta(int[][] matriz) {
			
			int[][] transposta = new int[matriz[0].length][matriz.length];
			
			for(int i = 0; i < matriz.length; i++) {
				for(int j = 0; j < matriz[0].length; j++) {
					transposta[j][i] = matriz[i][j];
				}
			}
			
			return transposta;
		
	}
	
	static boolean matrizSimetrica(int[][] matriz) {
		
		int[][] transposta = matrizTransposta(matriz);
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[0].length; j++) {
				if(matriz[i][j] != transposta[j][i]) {
					return false;
				}
			}
		}
		
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matriz = {
				{1, 2, 3},
				{2, 3, 1}
		};
		
		boolean verifica = matrizSimetrica(matriz);
		
		if(verifica) {
			System.out.println("Matriz simétrica");
		} else {
			System.out.println("Não simétrica");
		}
		
	}

}
