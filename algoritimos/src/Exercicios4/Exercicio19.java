package Exercicios4;

public class Exercicio19 {
	
	static void inverteVec(int[] vet) {
		int[] vetAux = new int[vet.length];
		int ind = 0;
		
		for(int i = vet.length -1; i >=0; i--) {
			vetAux[ind] = vet[i];
			ind++;
		}
		
		for(int i = 0; i < vet.length; i++) {
			vet[i] = vetAux[i];
		}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vec = {1, 2, 3, 4, 5};      // cria vetor para teste
	    
		for (int i : vec) {          // imprime vetor de testes
	       System.out.print(i + " ");
	    }
	      
		System.out.println(""); // pula uma linha
		inverteVec(vec);
		
		for (int i : vec) {          // imprime vetor de testes
	       System.out.print(i + " ");
	    }
	}

}
