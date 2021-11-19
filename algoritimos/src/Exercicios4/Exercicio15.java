package Exercicios4;

public class Exercicio15 {
	
	static int recorrencia2(int x, int[] valores) {
		int cont = 0;
		
		for(int val: valores) {
			if(val == x) {
				cont++;
			}
		}
		
		return cont;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 1;
		int[] valores = {1, 3, 4, 1, 2, 3, 1, 4, 1, 2, 3};
		
		int numero = recorrencia2(x, valores);
		
		System.out.println(numero);
	}

}
