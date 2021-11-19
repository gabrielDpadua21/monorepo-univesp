package Exercicios4;

public class Exercicio8 {
	
	static double calculoNota(double[] notas) {
		double maior = notas[0];
		double menor = notas[0];
		double media = 0;
		
		for(double nota: notas) {
			if(nota > maior) {
				maior = nota;
			}
			
			if(nota < menor) {
				menor = nota;
			}
		}
		
		for(double nota: notas) {
			if(nota != maior && nota != menor) {
				media += nota;
			}
		}
		
		return media / 4;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] notas = {7.5, 4.5, 3.5, 7.0, 10.0, 4.6};
		
		double media = calculoNota(notas);
				
		System.out.println("Media de notas: " + media);

	}

}
