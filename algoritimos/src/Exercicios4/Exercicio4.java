package Exercicios4;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o numero de linhas e colunas:");
		int n = input.nextInt();
		int m = input.nextInt();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				System.out.print("*");
			}
			
			System.out.println("");
		}
	}

}
