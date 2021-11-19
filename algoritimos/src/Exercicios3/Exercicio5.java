package Exercicios3;

import java.util.Scanner;

public class Exercicio5 {
	
	static void media(double v1, double v2, double v3, double v4) {
		double media = (v1 + v2 + v3 + v4) / 4;
		
		if(media > 0) {
			System.out.println("Media maior que zero");
		} else {
			System.out.println("Media menor ou igual a zero");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite 4 numeros: ");
		double v1 = input.nextDouble();
		double v2 = input.nextDouble();
		double v3 = input.nextDouble();
		double v4 = input.nextDouble();
		
		media(v1, v2, v3, v4);
		
	}

}
