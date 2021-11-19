package aula7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Arquivos {
	
	// tratamento de exptions
	static boolean gravaArq(String nome) {
		File arq = new File(nome);
		
		try {
			FileWriter writer = new FileWriter(arq,false);
			
		} catch(IOException ioe) {
			
			return false;
			
		}
		
		return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean resp;

		resp = gravaArq("teste");
		
		try {
			int n = 10 / 0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
