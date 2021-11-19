package Exercicios3;

import java.util.Scanner;

public class Exercicio12 {
	
	static int soma = 0;
	
	public static void soma21(int valor) {
		soma += valor;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Vamos jogar um jogo");
		int val;
		
		while(soma < 21) {
			System.out.println("Digite um numero: ");
			val = input.nextInt();
			soma21(val);
		}
		
		if(soma != 21) {
			System.out.println("Você perdeu");
		} else {
			System.out.println("Voce venceu!!!");
		}
		
	}

}
