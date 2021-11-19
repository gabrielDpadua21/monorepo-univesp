package Exercicios6;

public class Exercicio6 {
	
	static boolean palindromo(String word) {
		char[] charWord = new char[word.length()];
		int index = 0;
		
		for(int i = word.length() - 1; i >= 0; i--) {
			charWord[index] = word.charAt(i);
			index++;
		}
		
		String revert = new String(charWord);
		
		return word.equals(revert);
	}

	public static void main(Exercicio7[] args) {
		// TODO Auto-generated method stub

		String word1 = "ovo";
		String word2 = "novo";
		
		boolean word1Result = palindromo(word1);
		boolean wordResult2 = palindromo(word2);
		
		System.out.println("Result: " + word1Result);
		System.out.println("Result2: " + wordResult2);
		
	}

}
