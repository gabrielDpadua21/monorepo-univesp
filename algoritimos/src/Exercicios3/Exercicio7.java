package Exercicios3;

public class Exercicio7 {
	
	public static void conjecturaDeCollatz(int n) {
		System.out.println("Imprimindo sequencia iniciando em: " +n);
		
		while(n > 1) {
			if(n % 2 == 0)
				n = n / 2;
			else 
			  n = 3 * n + 1;
			
			System.out.println(n);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		conjecturaDeCollatz(10);
	}

}
