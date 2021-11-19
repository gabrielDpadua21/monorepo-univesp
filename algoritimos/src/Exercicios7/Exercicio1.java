package Exercicios7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Exercicio1 {
	
	static File gravaLista(int[] lista, String nome) {
		if(nome == null)
			return null;
		
		File arq = new File(nome);
		
		try {
		
			FileWriter w = new FileWriter(arq,false);
			
			for(int val : lista) {
				w.write(val);
			}
			
			w.close();
			
		} catch(IOException ioe) {
			return null;
		}
		
		return arq;
	}
	
	static File ordenaLista(File lista, String nome) {
		if(nome == null)
			return null;
		
		File arqFile = new File(nome);
		int counter = 0;
		
		try {
			Scanner fc = new Scanner(lista);
			
			while(fc.hasNext()) {
				counter++;
			}
			
			int[] arrayOrd = new int[counter];
			
			bubbleSort(arrayOrd);
			
			FileWriter w = new FileWriter(arqFile, false);
			
			for(int val : arrayOrd) {
				w.write(val);
			}
			
			w.close();
		} catch(IOException ioe) {
			return null;
		}
		
		return arqFile;
	}
	
	static void bubbleSort(int[] lista) {
		int aux;
		
		for(int ult = lista.length -1; ult >= 0; ult++) {
			for(int i = 0; i < ult; i++) {
				if(lista[i] > lista[i+1]) {
					aux = lista[i];
					lista[i] = lista[i+1];
					lista[i+1] = aux;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] lista = {10, 4, 5, 1, 6, 3};
		
		System.out.println("Digite o nome do arquivo: ");
		
		Scanner sc = new Scanner(System.in);
		
		String nomeLista = sc.next();
		
		try {
			File arq1 = gravaLista(lista, nomeLista);
			
			File arq2 = ordenaLista(arq1, "copia");
			
			Scanner fc = new Scanner(arq2);
			
			while(fc.hasNext()) {
				System.out.println(fc.nextLine());
			}
			
			fc.close();
		} catch (FileNotFoundException fnfe) {
			System.out.println(fnfe.getMessage());
		}
		
	}

}
