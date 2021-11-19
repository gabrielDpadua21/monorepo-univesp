package Exercicios4;

public class Exercicio16 {
	
	static void recorrenciaArrays(int[] array1, int[] array2) {
		int maior = array1[0];
		int contador = 0;
		
		for(int i = 0; i < array1.length; i++) {
			if(array1[i] > maior) {
				maior = array1[i];
			}
		}
		
		for(int i = 0; i < array2.length; i++) {
			if(maior == array2[i]) {
				contador++;
			}
		}
		
		System.out.println("O numero: " + maior + " aparece " + contador + " veses no array2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array1 = {1, 2, 3, 1, 4, 5, 2, 7, 3, 8, 5, 2};
		int[] array2 = {2, 3, 4, 1, 2, 8, 7, 1, 2, 8, 2, 4, 6, 8, 2, 3, 4, 5, 1};
		
		recorrenciaArrays(array1, array2);
 	}

}
