package Exercicios3;

import java.util.Scanner;

public class Exercicio6 {
	
	static void mediana(int v1, int v2, int v3) {
		
		System.out.print("Mediana: ");
		
		if(v2 < v3 && v2 > v1 || v2 < v1 && v2 > v3) {
			System.out.print(v2);
		} else if(v1 > v2 && v1 < v3 || v1 > v3 && v1 < v2) {
			System.out.print(v1);
		} else {
			System.out.print(v3);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite 2 numeros: ");
		int v1 = input.nextInt();
		int v2 = input.nextInt();
		int v3 = input.nextInt();
		
		mediana(v1, v2, v3);
	}

}
