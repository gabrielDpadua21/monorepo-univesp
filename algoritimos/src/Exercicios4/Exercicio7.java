package Exercicios4;

public class Exercicio7 {
	
	static int indiceDoMaior(float[] valores) {
		double maior = valores[0];
		int index = 0;
		
		for(int i = 0; i < valores.length; i++) {
			if(valores[i] > maior) {
				maior = valores[i];
				index = i;
			}
		}
		
		System.out.println("O indice do maior é: " +index);
		return index;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float[] valores = {11.2F, 10.4F, -1.3F, 3.5F, 3.3F};
		
		int indice = indiceDoMaior(valores);

	}

}
