package Leitura3;

import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int number1 = input.nextInt();
		
		System.out.println("Digite outro numero: ");
		int number2 = input.nextInt();
		
		if(number1 == number2) {
			System.out.printf("%d == %d %n", number1, number2);
		}
		
		if(number1 != number2) {
			System.out.printf("%d != %d %n", number1, number2);
		}
		
		if(number1 > number2) {
			System.out.printf("%d > %d %n", number1, number2);
		}
		
		if(number1 < number2) {
			System.out.printf("%d < %d %n", number1, number2);
		}
		
		if(number1 >= number2) {
			System.out.printf("%d >= %d %n", number1, number2);
		}
		
		if(number1 <= number2) {
			System.out.printf("%d <= %d %n", number1, number2);
		}
	}

}
