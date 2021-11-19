package Exercicios2;

import java.util.Scanner;

public class Exercicio5 {
	
	static double custoMetal = 2.5;
	static double custoPlastico = 1.5;
	
	public static double areaQuadrado(double lado) {
		return Math.pow(lado, 2);
	}
	
	public static double areaTrianguloReto(double cateto) {
		return cateto * cateto / 2;
	}
	
	public static double areaParalelogramo(double base, double altura) {
		return base * altura;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Calculador de areas");
	
		 double quadrado = areaQuadrado(2.5);
		 double triangulo = areaTrianguloReto(4);
		 double paralelogramo = areaParalelogramo(4, 2.5);
		 
		 System.out.println("Area do quadrado 2.5cm x 2.5cm: " +quadrado);
		
		 System.out.println("Area do trangulo 4cm x 4cm: " +triangulo);
		 
		 System.out.println("Area do paralelogramo 4cm X 2.5cm: " +paralelogramo);
		 
		 // Resposta E - II
		 
		 System.out.println("Custo de tangram 16m X 16m de metal");
		 double valorTangram1 = custoMetal * areaQuadrado(16);
		 
		 System.out.println("Valor: "+ valorTangram1);
		 
		 // Reposta E - III
		 
		 System.out.println("Valores de pecas de reposicao:");
		 
		 double valorTriangulo1 = custoPlastico * areaTrianguloReto(5) * 3;
		 double valorParalelogramo1 = custoPlastico * areaParalelogramo(7.1, 2.7) * 2;
		 double valorQuadrado1 = custoMetal * areaQuadrado(4);
		 double valorTriangulo2 = custoMetal * areaTrianguloReto(4);
		 double valorTotal = valorTriangulo1 + valorParalelogramo1 + valorQuadrado1 + valorTriangulo2;
		 
		 System.out.println("Valor dos trangulos de plastico: " + valorTriangulo1);
		 System.out.println("Valor dos parelelogramos de plastico: " +valorParalelogramo1);
		 System.out.println("Valor do quadrado de metal: " + valorQuadrado1);
		 System.out.println("Valor do triangulo de metal: " +valorTriangulo2);
		 System.out.println("Valor total: " +valorTotal);
		 
		 // Resposta F
		 
		 Scanner input = new Scanner(System.in);
		 
		 System.out.println("Digite o valor do custo por area de borracha: ");
		 double custoBorracha = input.nextDouble();
		 
		 double valorTangranBorracha = custoBorracha * areaQuadrado(10.5);
		 
		 System.out.println("Valor do tangran de borracha: " + valorTangranBorracha);
		 
	}

}
