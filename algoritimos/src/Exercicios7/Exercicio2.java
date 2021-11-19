package Exercicios7;

import java.util.Scanner;

public class Exercicio2 {
	
	static void printMatriz(int[][] matriz) {
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			
			System.out.println("");
		}
	}
	
	static int[][] somaMatriz(int[][] matriz1, int[][] matriz2) {
		
		if(matriz1.length != matriz2.length || matriz1[0].length != matriz2[0].length) 
			return null;
		
		int[][] matrizSoma = new int[matriz1.length][matriz1[0].length];
		
		for(int i = 0; i < matriz1.length; i++) {
			for(int j = 0; j < matriz1[0].length; j++) {
				matrizSoma[i][j] = matriz1[i][j] + matriz1[i][j];
			}
		}
		
		return matrizSoma;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o tamanho da primeira matriz: ");
		int i = sc.nextInt();
		int j = sc.nextInt();
		
		System.out.println("Matriz: " + i + " X " + j);
		
		int[][] matriz1 = new int[i][j];
		
		for(int iaux = 0; iaux < i; iaux++) {
			System.out.println("Digite as linhas da matriz 1: ");
			for(int jaux = 0; jaux < j; jaux++) {
				matriz1[iaux][jaux] = sc.nextInt();
			}
		}
		
		printMatriz(matriz1);
		
		System.out.println("Digite o tamanho da segunda matriz: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		System.out.println("Matriz: " + i + " X " + j);
		
		int[][] matriz2 = new int[x][y];
		
		for(int iaux = 0; iaux < x; iaux++) {
			System.out.println("Digite as linhas da matriz 2: ");
			for(int jaux = 0; jaux < y; jaux++) {
				matriz2[iaux][jaux] = sc.nextInt();
			}
		}
		
		printMatriz(matriz2);
		
		int[][] soma = somaMatriz(matriz1, matriz2);
		
		printMatriz(soma);

	}

}
