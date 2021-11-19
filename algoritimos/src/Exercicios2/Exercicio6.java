package Exercicios2;

public class Exercicio6 {
	
	public static float conversorDolar(float taxa, float valorReal) {
		return valorReal / taxa;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1 dolar ------ 3.85 reais
		// x dolar ------ 100 reais
		// valorDolar = valorReal / taxa
		
		
		float real = 100;
		
		float dolar = conversorDolar(3.88F, real);
		
		System.out.println("Valor em dolar e: " + dolar);
		
	}

}
