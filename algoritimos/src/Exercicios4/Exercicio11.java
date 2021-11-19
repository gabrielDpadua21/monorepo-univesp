package Exercicios4;

public class Exercicio11 {
	
	static double Potencia(double x, int y) {
		double result = 1;
		
		for(int i = 1; i <= y; i++) {
			result *= x;
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double resultado = Potencia(2, 5);
		
		System.out.println(resultado);
		
	}

}
