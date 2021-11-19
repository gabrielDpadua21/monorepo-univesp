package aula4;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array1 = {1, 2, 3, 4};
		int[] array2 = new int[4];
		
		// COPIA O ENDERECO DO ARRAY1 PARA O ARRAY2 NAO OS ELEMENTOS...
		//array2 = array1;
		
		//COPIA CADA UM DO ELEMENTOS DO ARRAY1 PARA ARRAY2 ATRAVES DA ITERACAO...
		for(int i = 0; i < array1.length; i++) {
			array2[i] = array1[i];
		}
		
		array1[3] = 9;
		
		for(int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
		
		System.out.println("");
		
		// foreach ...
		for(int val : array2) {
			System.out.print(val + " ");
		}

	}

}
