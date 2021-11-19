package Exercicios3;

import java.util.Scanner;

public class Exercicio10 {
	
	// Formulas
	// Celsius <-> Fire c/5 = (f-32) / 9
	// Celsius <-> kelvin k = c + 273
	// Kelvin <-> fire (k-273)/5 = (f-32) / 9
		
	static final int celsiusFire = 1;
	static final int fireCelsius = 2;
	static final int celsiusKelvin = 3;
	static final int kelvinCelsius = 4;
	static final int fireKelvin = 5;
	static final int kelvinFire = 6;
	
	public static double conversorTemperatura(double temp, int conv) {
		switch(conv) {
			case celsiusFire:
				return temp * 9 / 5 + 32;
			case fireCelsius:
				return (temp - 32) * 5 / 9;
			case celsiusKelvin:
				return temp + 273;
			case kelvinCelsius:
				return temp - 273;
			case fireKelvin:
				return (temp - 32) * 5 / 9 + 273;
			case kelvinFire:
				return (temp - 273) * 9 / 5 + 32;
			default:
				double x = 0;
				double y = 0;
				return y / y;
 		}
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a temperatura e o codigo de conversao: ");
		double temp = input.nextDouble();
		int conv = input.nextInt();
		
		double resultado = conversorTemperatura(temp, conv);
		
		System.out.println("Temperatura: " + resultado);
		
	}

}
