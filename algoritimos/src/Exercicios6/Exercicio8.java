package Exercicios6;

public class Exercicio8 {
	
	static void ordena(int[] array) {
		int aux;
		
		for(int ult = array.length -1; ult >= 0; ult--) {
			for(int i = 0; i < ult; i++) {
				if(array[i] > array[i+1]) {
					aux = array[i];
				    array[i] = array[i+1];
					array[i+1] = aux;
				}
			}
		}
		
	}
	
	static boolean busca(int[] array, int el) {
		ordena(array);
		
		int fim = array.length -1;
		int ini = 0;
		
		while(ini <= fim) {
			int meio = (fim + ini) /2;
			
			if(array[meio] < el) {
				ini = meio + 1;
			} else {
				if(array[meio] > el) {
					fim = meio - 1;
				} else {
					return true;
				}
			}
		}
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {1, 2, 4, 1, 4, 5, 2, 6, 2, 34, 45, 1, 2, 4};
		
		boolean resp = busca(array, 35);
		
		if(resp) {
			System.out.println("Foi encontrado o valor " + 35 + " no array");
		} else {
			System.out.println("Valor não encontrado");
		}

	}

}
