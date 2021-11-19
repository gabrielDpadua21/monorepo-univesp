package aula7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SalvarArquivos {
	
	static File gravaArq(String nome, int[] lista) {
		if(nome == null)
			return null;
	
		File arq = new File(nome);
		
		try {
	
			FileWriter writer = new FileWriter(arq,false);
			
			for(int val : lista) {
				writer.write("Numero na lista: " + val);
			}
			
			writer.close();
		} catch(IOException ioe) {
			return null;
		}
		
		return arq;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] lista = {1, 2, 4, 5, 6};
		
		try {
			File arq = gravaArq("list", lista);
			Scanner sc = new Scanner(arq);
			while(sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
			
			sc.close();
		} catch(FileNotFoundException fnfe) {
			System.out.println(fnfe.getMessage());
		}

	}

}
