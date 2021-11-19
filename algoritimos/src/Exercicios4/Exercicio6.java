package Exercicios4;

public class Exercicio6 {
	
	static double maiorValor(double[] valores) {
		
		double maior = valores[0];
		
		for(double val: valores) {
			if(val > maior) {
				maior = val;
			}
		}
		
		System.out.println("O maior valor e: " + maior);
		
		return maior;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] valores = {1.1, 1.2, 4.3, 0.2, 3.3, 3.5, 1.2, 4.1};
		
		double valor = maiorValor(valores);
	}

}
