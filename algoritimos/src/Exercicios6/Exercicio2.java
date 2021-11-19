package Exercicios6;

public class Exercicio2 {
	
	static boolean comparaTextos(char[] texto1, String texto2) {
		
		String aux = new String(texto1);
		
		return texto2.equals(aux);
		
	}

	public static void main(Exercicio7[] args) {
		// TODO Auto-generated method stub
		String gato1 = "frajola";
		char[] gato2 = {'r', 'r', 'a', 'j', 'o', 'l', 'a'};
		
		
		boolean result = comparaTextos(gato2, gato1);
		
		if(result)
			System.out.println("Nome iguais");
		else
			System.out.println("Nomes diferentes");
		

	}

}
