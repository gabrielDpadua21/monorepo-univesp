package Exercicios4;

public class Exercicio9 {
	
	static double[] somaPolinomios(double[] a, double[] b, double x) {
		
		double[] soma = new double[a.length];
		
		for(int i = 0; i < a.length; i++) {
			if(i < 1) {
				soma[i] = a[i] + b[i];
			} else {
				soma[i] = (a[i] * Math.pow(x, i)) + (b[i] * Math.pow(x, i));
			}
		}
		
		return soma;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] a = {1, 2, 3, 4, 5, 6};
		double[] b = {1, 2, 3, 4, 5, 6};
		double x = 2;
		
		double[] resultados = somaPolinomios(a, b, x);
		
		for(double resultado: resultados) {
			System.out.print(resultado + " ");
		}

	}

}
