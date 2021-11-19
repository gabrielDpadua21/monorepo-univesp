package Exercicios7;

public class Exercicio4 {
	
	static void bubbleSorte(int[] array) {
		int aux;
		int iteracoes = 0;
		int trocas = 0;
		
		for(int ult = array.length -1; ult >= 0; ult--) {
			for(int i = 0; i < ult; i++) {
				iteracoes++;
				
				if(array[i] > array[i + 1]) {
					aux = array[i];
					array[i] = array[i+1];
					array[i+1] = aux;
					trocas++;
				}
			}
		}
		
		System.out.println("Bubble sort: ");
		System.out.println("iteracoes: " + iteracoes);
		System.out.println("Trocas: " + trocas);
		System.out.println("*****************************");
		
	}
	
	
	static void inserctionSort(int[] array) {
		int iteracoes = 0;
		int trocas = 0;
		
		for(int i = 0; i < array.length; i++) {
			int aux = array[i];
			int j = i;
			
			iteracoes++;
			
			while((j > 0) && (aux < array[j - 1])) {
				iteracoes++;
				trocas++;
				array[j] = array[j-1];
				j--;
			}
			
			array[j] = aux;
		}
		
		System.out.println("Inserction sort: ");
		System.out.println("iteracoes: " + iteracoes);
		System.out.println("Trocas: " + trocas);
		System.out.println("*****************************");
	}
	
	static void selectionSort(int[] array) {
		int aux;
		int iteracoes = 0;
		int trocas = 0;
		
		for(int i = 0; i < array.length - 1; i++) {
			int posMenor = posicaoMenor(array, i);
			
			iteracoes++;
			
			if(array[posMenor] < array[i]) {
				trocas++;
				aux = array[i];
				array[i] = array[posMenor];
				array[posMenor] = aux;
			}
		}
		
		System.out.println("Selection sort: ");
		System.out.println("iteracoes: " + iteracoes);
		System.out.println("Trocas: " + trocas);
		System.out.println("*****************************");
		
	}
	
	static int posicaoMenor(int[] array, int inicio) {
		int posMenor = -1;
		int interacoes = 0;
		
		if(array != null && inicio >= 0 && inicio < array.length) {
			posMenor = inicio;
			
			for(int i = inicio+1; i < array.length; i++) {
				interacoes++;
				if(array[i] < array[posMenor])
					posMenor = i;
			}
		}
		
		System.out.println("interacoes pos menor: " + interacoes);
		
		return posMenor;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array1 = {10, 3, 5, 2, 7, 1, 8, 11, 23};
		int[] array2 = {10, 3, 5, 2, 7, 1, 8, 11, 23};
		int[] array3 = {10, 3, 5, 2, 7, 1, 8, 11, 23};
		
		bubbleSorte(array1);
		selectionSort(array2);
		inserctionSort(array3);

	}

}
