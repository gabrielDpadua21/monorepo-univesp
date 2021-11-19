package Exercicios7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio5 {
	
	static String changeCase(String word, char op) {
		String changed;
		
		if(op == 'a') 
			changed = word.toUpperCase();
		else 
			changed = word.toLowerCase();
		
		return changed;
		
	}
	
	static File gravaArq(String nome, String word) {
		if(nome == null)
			return null;
	
		File arq = new File(nome);
		
		try {
	
			FileWriter writer = new FileWriter(arq,false);
			
			writer.write(word);
			
			writer.close();
		} catch(IOException ioe) {
			return null;
		}
		
		return arq;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word = "frajola";
		
		try {
			File arq = gravaArq("word", word);
			Scanner sc = new Scanner(arq);
			File copia;
			while(sc.hasNext()) {
				String upper = changeCase(sc.nextLine(), 'a');
				
				copia = gravaArq("copia", upper);
				
				Scanner sc2 = new Scanner(copia);
				
				while(sc2.hasNext()) {
					System.out.println(sc2.nextLine());
				}
			}
			
			sc.close();
		} catch(FileNotFoundException fnfe) {
			System.out.println(fnfe.getMessage());
		}
		
		
		
	}

}
