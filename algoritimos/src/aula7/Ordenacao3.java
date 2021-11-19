package aula7;

public class Ordenacao3 {
	
	static int posicaoMenor(int[] arr, int inicio) {
		int posMenor = -1;
		
		if(arr != null && inicio >=0 && inicio < arr.length) {
			posMenor = inicio;
			
			for(int i = inicio+1; i < arr.length; i++) {
				if(arr[i] < arr[posMenor]) 
					posMenor = i;
			}
		}
		
		return posMenor;
	}
	
	static void SelectionSort(int[] array) {
		int aux;
		
		for(int i = 0; i < array.length - 1; i++) {
			int posMenor = posicaoMenor(array, i);
			
			if(array[posMenor] < array[i]) {
				aux = array[i];
				array[i] = array[posMenor];
				array[posMenor] = aux;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {10, 2, 4, 2, 4, 6, 1, 8, 11};
		
		SelectionSort(array);
		
		for(int val: array) {
			System.out.print(val + " ");
		}
		
	}

}
