package Exercicios2;

public class Exercicio7 {
	
	public static double quedaLivre(double altura) {
		final double g = 9.8;
		
		return Math.sqrt(2 * altura / 100 / g);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double altura = 4500; // em cm
		
		double tempo = quedaLivre(altura);
		
		System.out.println("O tempo de queda foi: " + tempo);

	}

}
