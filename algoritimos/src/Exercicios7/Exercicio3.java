package Exercicios7;

import java.util.Scanner;

public class Exercicio3 {
	
	static void ordena(int[] array, String direc) {
		int aux;
		
		for(int ult = array.length - 1; ult >=0; ult--) {
			for(int i = 0; i < ult; i++) {
				if(direc == "asc") {
					if(array[i] > array[i+1]) {
						aux = array[i];
						array[i] = array[i+1];
						array[i+1] = aux;
					}
				} else {
					if(array[i] < array[i+1]) {
						aux = array[i];
						array[i] = array[i+1];
						array[i+1] = aux;
					}
				}
			}
		}
		
	}
	
	static void imprime(int[] array) {
		
		System.out.println("*********************");
		
		for(int val : array) {
			System.out.print(val + " ");
		}
		
		System.out.println(" ");
	}
	
	static void geraArrayDesc(int tamanho) {
		int[] array = new int[tamanho];
		
		for(int i = 0; i < tamanho; i++) {
			array[i] = (int)Math.round(Math.random() * 100);
		}
		
		ordena(array, "desc");
		
		imprime(array);
	}
	
	static void geraArrayAsc(int tamanho) {
		int[] array = new int[tamanho];
		
		for(int i = 0; i < tamanho; i++) {
			array[i] = (int)Math.round(Math.random() * 100);
		}
		
		ordena(array, "asc");
		
		imprime(array);
	}
	
	static void geraArrayAle(int tamanho) {
		int[] array = new int[tamanho];
		
		for(int i = 0; i < tamanho; i++) {
			array[i] = (int)Math.round(Math.random() * 100);
		}
			
		imprime(array);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o tamanho dos arrays: ");
		
		int tam = sc.nextInt();
		
		geraArrayDesc(tam);
		geraArrayAsc(tam);
		geraArrayAle(tam);

	}

}
