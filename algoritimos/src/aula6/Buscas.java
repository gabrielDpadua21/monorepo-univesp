package aula6;

public class Buscas {
	
	
	// pior caso n ^ i
	// não necessita do arranjo ordenado...
	static int buscaSeq(int[] array, int el) {
		for(int i = 0; i < array.length; i++)
			if(array[i] == el) return i;
		
		return -1;
	}
	
	static int buscaSeqOrdenado(int[] array, int el) {
		for(int i = 0; i < array.length; i++) {
			if(array[i] == el) return i;
			if(array[i] > el) break;
		}
		
		return -1;
	}
	
	// Complexidade
	// pior caso log(n) + 1;
	// requisitos -> precisa do arranjo ordenado
	// sempre ganha da busca sequencia com valores >= 3
	static int buscaBin(int[] arr, int el) {
		int fim = arr.length - 1;
		int ini = 0;
		
		while(ini <= fim) {
			int meio = (fim + ini) / 2;
			
			if(arr[meio] < el) {
				ini = meio + 1;
			} else {
				if(arr[meio] > el) {
					fim = meio - 1;
				} else {
					return meio;
				}
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {1, 2, 3, 4, 5, 6};
		
		System.out.println(buscaSeq(array, 1));
		System.out.println(buscaSeq(array, 12));
		
		System.out.println(buscaBin(array, 5));
		
	}

}
