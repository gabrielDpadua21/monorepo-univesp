package aula7;

import java.util.Scanner;

public class Entradas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String meuString = "3 tokens 3,5 true";
		
		Scanner sc = new Scanner(meuString);
		
		int i = sc.nextInt();
		String n = sc.next();
		double n1 = sc.nextDouble();
		boolean n3 = sc.hasNextBoolean();
		
		System.out.println(i);
		System.out.println(n);
		System.out.println(n1);
		System.out.println(n3);
		
	}

}
