package Exercicios3;

import java.util.Scanner;

public class Exercicio8 {
	
	static final int soma = 1;
	static final int subtracao = 2;
	static final int multiplicacao = 3;
	static final int divisao = 4;
	static final int potencia = 5;
	
	public static void calculadora(double n1, double n2, int op) {
		switch(op) {
			case soma: 
				System.out.println(n1 + n2);
				break;
			case subtracao:
				System.out.println(n1 - n2);
				break;
			case multiplicacao:
				System.out.println(n1 * n2);
				break;
			case divisao:
				System.out.println(n1 / n2);
				break;
			case potencia:
				System.out.println(Math.pow(n1, n2));
			default:
				System.out.println("Operacao invalida...");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite 2 numero para realizar e o numero da operacao: ");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtracao");
		System.out.println("3 - Multiplicao");
		System.out.println("4 - Divisao");
		System.out.println("5 - Potencia");
		
		double a = input.nextDouble();
		double b = input.nextDouble();
		int op = input.nextInt();
		
		calculadora(a, b, op);
		
	}

}
