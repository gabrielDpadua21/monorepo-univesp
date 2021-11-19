package Exercicios4;

public class Exercicio18 {
	
	static boolean sequenciaVet(int[] vet, int[] sub) {
		int ind = 0;
		
		for(int i = 0; i < vet.length; i++) {
			if(vet[i] == sub[ind]) {
				ind++;
			} else {
			   ind = 0;
			}
			
			if(ind == sub.length) {
				return true;
			}
		}
	
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vet = {3, 9, 5, 4};
		int[] sub = {9, 5};
		
		boolean result = sequenciaVet(vet, sub);
		
		if(result) {
			System.out.println("é sequencia");
		} else {
			System.out.println("Não e sequencia");
		}
	}

}
