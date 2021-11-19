package Exercicios4;

public class Exercicio13 {
	
	// polinomio
	// x = 2
	// p(x) = a0 + a1 * x ^ 1 + a2 * x ^ 2
	// p(x) = 2 + 4 * 2 + 2 * 4
	// p(x) = 2 + 8 + 8
	
	static double potencia(double x, int y) {
		return Math.pow(x, y);
	}
	
	static double calculoPolinomio(double x, double[] valores) {
		
		double px = valores[0];
		
		for(int i = 1; i < valores.length; i++) {
			px += valores[i] * potencia(x, i);
		}
		
		return px;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x = 2.0;
		double[] valores = {2, 4, 2};
		
		double resultado = calculoPolinomio(x, valores);
		
		System.out.println("P(X) = " + resultado);
		
	}

}
