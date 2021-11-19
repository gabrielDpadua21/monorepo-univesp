package aula4;

public class ArrayStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char x = '\u00f6';
		char meu_char = 'a';
		int y = 256;
		char[] nome = {'t', 'h', 'o', 'r'};
		
		System.out.println(meu_char);
		System.out.println(x);
		
		// conversao de tipo - de inteiro para char
		System.out.println((char)y);
		
		for(int i = 65; i < 122; i++) {
			System.out.println(i + " : " + (char)i);
		}
		
		System.out.println(nome);
	}

}
