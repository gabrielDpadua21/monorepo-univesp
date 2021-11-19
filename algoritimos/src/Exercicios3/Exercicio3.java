package Exercicios3;

import java.util.Scanner;

public class Exercicio3 {
	
	static void compara(int n1, int n2) {
		if(n1 == n2) {
			System.out.println("Sao iguais");
		} else if(n1 < n2) {
			System.out.println("n1 < n2");
		} else {
			System.out.println("n1 > n2");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite dois numeros: ");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		
		compara(n1, n2);
		
	}

}
