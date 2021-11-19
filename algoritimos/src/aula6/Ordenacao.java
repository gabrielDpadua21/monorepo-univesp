package aula6;

public class Ordenacao {
	
	static void bubble(int[] array) {
		int aux;
		
		for(int ult = array.length-1; ult > 0; ult--) {
			for(int i = 0; i < ult; i++) {
				if(array[i] > array[i +1]) {
					aux = array[i];
					array[i] = array[i+1];
					array[i+1] = aux;
				}
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] v = {12, 14, 1, 2, 3, 6, 4, 3, 1, 8};
		
		bubble(v);
		
		for(int val: v) {
			System.out.print(val + " ");
		}
	}

}
