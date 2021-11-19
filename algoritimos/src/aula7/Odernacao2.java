package aula7;

public class Odernacao2 {
	
	static void inserctionSort(int[] array) {
		
		
		for(int i = 0; i < array.length; i++) {
			int aux = array[i];
			
			int j = i;
			
			while((j > 0) && (aux < array[j - 1])) {
				array[j] = array[j - 1];
				j--;
			}
			
			array[j] = aux;
			
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {9, 8, 5, 4, 2, 7, 2};
		
		inserctionSort(array);
		
		for(int elem: array) {
			System.out.println(elem);
		}

	}

}
