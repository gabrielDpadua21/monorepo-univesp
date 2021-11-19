package Exercicios6;

public class Pessoa2Teste {

	public static void main(Exercicio7[] args) {
		// TODO Auto-generated method stub
		
		// Frajola
		// Thor
		// Lucifer
		
		// Ordem crecente
		// Thor
		// Lucifer
		// Frajola
		Pessoa2 p1 = new Pessoa2("Frajola", 12, 8, 2015);
		Pessoa2 p2 = new Pessoa2("Thor", 15, 3, 2014);
		Pessoa2 p3 = new Pessoa2("Lucifer", 11, 3, 2015);
		
		Pessoa2[] pessoas = new Pessoa2[3];
		pessoas[0] = p1;
		pessoas[1] = p2;
		pessoas[2] = p3;
		
		p1.ordenaPessoas(pessoas);
		
		for(Pessoa2 pessoa: pessoas ) {
			System.out.println(pessoa.nome);
		}

	}

}
