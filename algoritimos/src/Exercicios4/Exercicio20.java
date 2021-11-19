package Exercicios4;

public class Exercicio20 {
	
	static void upperCase(char[] frase) {
		char[] fraseUpper = new char[frase.length];
		
		for(int i = 0; i < frase.length; i++) {
			int valor = (int) frase[i] - 32;
			fraseUpper[i] = (char)(valor);
		}
		
		System.out.println(frase);
		System.out.println(fraseUpper);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] frase = {'f', 'r', 'a', 'j', 'o', 'l', 'a'};
		
		upperCase(frase);
	}

}
