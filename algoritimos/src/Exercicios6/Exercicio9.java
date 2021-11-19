package Exercicios6;

public class Exercicio9 {
	
	static void ordenaStrings(String[] gatos) {
		String aux;
		
		for(int ult = gatos.length - 1; ult >= 0; ult--) {
			for(int i = 0; i < ult; i++) {
				if(gatos[i].compareTo(gatos[i+1]) > 0) {
					aux = gatos[i];
					gatos[i] = gatos[i+1];
					gatos[i+1] = aux;
				}
			}
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] gatos = {"Lucifer", "Thor", "Frajola", "Anon", "Naruto", "Luffy"};
		
		ordenaStrings(gatos);
		
		for(String gato: gatos) {
			System.out.println(gato);
		}

	}

}
