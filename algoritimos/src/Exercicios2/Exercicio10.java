package Exercicios2;

import java.util.Scanner;

public class Exercicio10 {
	
	public static void separador(int numero) {
		int numero1 = numero / 10000;
		int numero2 = numero % 10000;
		
		System.out.print(numero / 10000 + " ");
		System.out.print((numero % 10000) / 1000 + " ");
		System.out.print((numero % 1000) / 100 + " ");
		System.out.print((numero % 100) / 10 + " ");
		System.out.print((numero % 10) + " ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um numero de 5 digitos: ");
		int numero = input.nextInt();
		
		separador(numero);
	}

}
