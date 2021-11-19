package Exercicios3;

import java.util.Scanner;

public class Exercicio11 {
	
	public static boolean isPrime(int val) {
		if(val <= 0) {
			System.out.println("Numero invalido < 0");
			return false;
		}
		
		if(val == 1) {
			return false;
		}
		
		int div = 2;
		
		while(div < val) {
			if(val % div == 0) {
				return false;
			}
			
			div++;
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int num = input.nextInt();
		
		boolean numero = isPrime(num);
		
		if(numero) {
			System.out.println("é primo");
		} else {
			System.out.println("Não e primo");
		}

	}

}
