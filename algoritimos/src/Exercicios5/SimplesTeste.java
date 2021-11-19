package Exercicios5;

public class SimplesTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Simples s1 = new Simples();
		int[] array = new int[4];
		
		s1.inicializaArray(array, 2);
		
		boolean teste = s1.estaArray(array, 2);
		
		if(teste) {
			System.out.println("Está presente");
		} else {
			System.out.println("Não está");
		}

	}

}
