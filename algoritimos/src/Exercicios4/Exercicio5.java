package Exercicios4;

public class Exercicio5 {
	
	static void metodoFor(int n) {
		if(n < 0) {
			System.out.println("Pametro inválido");
		} else {
			for(int i = 0; i < n; i++) {
				System.out.print("*");
			}
		}
		
		System.out.println("");
	}
	
	static void metodoWhile(int n) {
		while(n >= 0) {
			System.out.print("*");
			n--;
		}
		
		System.out.println("");
	}
	
	static void metodoDo(int n) {
		if(n < 0) {
			System.out.println("Parametro inválido");
		} else {
			do {
				System.out.print("*");
				n--;
			}while(n >= 0);
		}
		
		System.out.println("");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		metodoFor(-3);
		metodoWhile(-1);
		metodoDo(-1);
	}

}
