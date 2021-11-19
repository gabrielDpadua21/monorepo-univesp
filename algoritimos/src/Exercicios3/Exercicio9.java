package Exercicios3;

import java.util.Scanner;

public class Exercicio9 {
	
	static final int verde = 1;
	static final int amarelo = 2;
	static final int azul = 3;
	static final int branco = 4;

	public static void cor(int identificador) {
		switch(identificador) {
			case verde: 
				System.out.println("Verde");
				break;
			case amarelo:
				System.out.println("Amarelo");
				break;
			case azul:
				System.out.println("Azul");
				break;
			case branco:
				System.out.println("Branco");
				break;
			default:
				System.out.println("Identificador invalido...");
				break;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o numero do indentificador: ");
		int id = input.nextInt();
		
		cor(id);

	}

}
