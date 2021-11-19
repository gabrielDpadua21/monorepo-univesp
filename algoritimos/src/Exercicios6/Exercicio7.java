package Exercicios6;

public class Exercicio7 {
	
	static String copy(String word) {
		String wordCopy = new String(word);
		
		return wordCopy;
	}

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		
		String gato1 = "frajola";
		String gato2 = gato1;

		String copy = copy(gato1);
		
		System.out.println(gato1);
		System.out.println(copy);
		System.out.println(gato2);
		
		gato1 = "thor";
		
		System.out.println(gato1);
		System.out.println(copy);
		System.out.println(gato2);

	}

}
