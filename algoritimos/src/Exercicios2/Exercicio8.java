package Exercicios2;

public class Exercicio8 {
	
	static double multaCartaoAmarelo = 1000.20;
	static double multaCartaoVermelho = 4523.75;
	
	public static void multaPorCartoes(int numeroTime, int numeroJogador, int numeroAmarelo, int numeroVermelho) {
		System.out.println("Time: " + numeroTime);
		System.out.println("Numero do jogador: " + numeroJogador);
		System.out.println("Numero de cartoes amarelos: "+ numeroAmarelo);
		System.out.println("Numero de cartoes vermelhos: " +numeroVermelho);
		
		double multaTotal = numeroAmarelo * multaCartaoAmarelo + numeroVermelho * multaCartaoVermelho;
		
		System.out.println("Total da multa do jogador: " + multaTotal);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		multaPorCartoes(1, 1, 0, 2);
		multaPorCartoes(1, 2, 3, 1);

	}

}
