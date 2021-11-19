package Exercicios4;

public class Exercicio17 {
	
	static void recorrenciaArrays2(int[] array1, int[] array2) {
		
		for(int i = 0; i < array1.length; i++) {
			int contador = 0;
			for(int j = 0; j < array2.length; j++) {
				if(array1[i] == array2[j]) {
					contador++;
				}
			}
			
			System.out.println("O numero: " + array1[i] + " aparece " + contador + " veses no array2");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {1, 2, 3, 1, 4, 5, 2, 7, 3, 8, 5, 2};
		int[] array2 = {2, 3, 4, 1, 2, 8, 7, 1, 2, 8, 2, 4, 6, 8, 2, 3, 4, 5, 1};
		
		recorrenciaArrays2(array1, array2);
	}

}
