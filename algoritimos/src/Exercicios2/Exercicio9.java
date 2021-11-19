package Exercicios2;

import java.util.Scanner;

public class Exercicio9 {
	
	public static void operacoes(int a, int b) {
		System.out.println("Soma: "+ (a + b));
		System.out.println("Produto: " + (a * b));
		System.out.println("Diferenca: " + (a - b));
		System.out.println("Quociente : " + (a / b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite 2 numero: ");
		int a = input.nextInt();
		int b = input.nextInt();
		
		operacoes(a, b);
	}

}
