package Exercicios4;

public class Exercicio10 {
	
	static int recorrencia(int[] valores, int x) {
		int contador = 0;
		
		for(int i = 0; i < valores.length; i++) {
			if(valores[i] == x) {
				contador++;
			}
		}
		
		return contador;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] valores = {1, 2, 1, 3, 4, 5, 6, 1, 2, 4, 5, 2, 3, 5, 6};
		int x = 3;
		
		int rec = recorrencia(valores, x);
		
		System.out.println("O numero: " + x + " aparece: " + rec + "x no array");
		
	}

}
