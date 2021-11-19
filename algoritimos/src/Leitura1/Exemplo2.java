package Leitura1;

import java.util.Scanner;

public class Exemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// CLASSE JAVA PARA ENTRADA DE DADOS...
		Scanner input = new Scanner(System.in);
		
		int number1;
		int number2;
		int sun;
		
		System.out.println("Primeiro numero:");
		// ENTRADA DE NUMERO INTEIRO
		number1 = input.nextInt();
		
		System.out.println("Segundo numero:");
		// ENTRADA DE NUMERO INTEIRO
		number2 = input.nextInt();
		
		sun = number1 + number2;
		
		System.out.println("Soma:");
		System.out.println(sun);
		
	}

}
