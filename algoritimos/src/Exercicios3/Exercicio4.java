package Exercicios3;

import java.util.Scanner;

public class Exercicio4 {
	
	static void compare(int a, int b, int c) {
		int maior;
		int menor;
		
		if(a > b && a > c) {
			maior = a;
		} else if(b > a && b > c) {
			maior = b;
		} else {
			maior = c;
		}
		
		if(a < b && a < c) {
			menor = a;
		} else if(b < a && b < c) {
			menor = b;
		} else {
			menor = c;
		}
		
		System.out.println("Maior: " +maior);
		System.out.println("Menor: " +menor);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Digite 3 numeros: ");
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		compare(a, b, c);
		
		
	}

}
