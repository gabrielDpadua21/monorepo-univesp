package aula2;

// CONSTANTES
// lib Math

public class AreaPiscina {
	public static void main(String[] args) {
		
		double raio = 2;
		double areap;
		// declaracao de constante...
		final double pi = 3.14159;
		
		areap = Math.pow(raio, 2) * pi;
		
		System.out.println("Area da piscina: " + areap);
	}
}
