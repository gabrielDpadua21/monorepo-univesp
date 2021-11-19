package Exercicios3;

import java.util.Scanner;

public class Exercicio2 {
	
	static double modulo(double n) {
		if(n < 0) {
			return -n;
		}
		
		return n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um numero para saber seu modulo: ");
		double number = input.nextDouble();
		
		double mod = modulo(number);
		
		System.out.println(mod);
		
	}

}
