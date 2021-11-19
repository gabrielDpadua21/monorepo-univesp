package Exercicios7;

public class Exercicio6 {
	
	// CIFRA DE CESAR...
	static String cripto(String word, int key, boolean op) {
		char[] aux = new char[word.length()];
		
		for(int i = 0; i < word.length(); i++) {
			if(op) {
				int valor = (int)word.charAt(i) + key;
				aux[i] = (char)valor;
			} else {
				int valor = (int)word.charAt(i) - key;
				aux[i] = (char)valor;
			}
		}
		
		String cifra = new String(aux);
		
		return cifra;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word = "Os nazistas estao chegando";
		
		String wordCripto = cripto(word, 4, true);
		
		System.out.println(wordCripto);
		
		String Descript = cripto(wordCripto, 4, false);
		
		System.out.println(Descript);

	}

}
