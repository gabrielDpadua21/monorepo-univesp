package Exercicios6;

public class Exercicio4 {
	
	static Pessoa buscaPessoa(Pessoa[] pessoas, String nome, int idade) {
		
		for(Pessoa pessoa: pessoas ) {
			if(pessoa.nome.equals(nome) && pessoa.idade == idade) {
				return pessoa;
			}
		}
		
		return null;
		
	}

	public static void main(Exercicio7[] args) {
		// TODO Auto-generated method stub
		
		String[] nomes = {"Frajola", "Thor", "Lucifer", "Leon", "Tom"};
		Pessoa[] pessoas = new Pessoa[5];
		
		for(int i = 0; i < 5; i++) {
			Pessoa p1 = new Pessoa(nomes[i], (i + 5));
			pessoas[i] = p1;
		}
		
		Pessoa buscado = buscaPessoa(pessoas, "Thor", 6);
		
		if(buscado != null) {
			System.out.println("Pessoa: " + buscado.nome + " de idade: " + buscado.idade + " encontrada");
		} else {
			System.out.println("Pessoa não encontrada");
		}

	}

}
