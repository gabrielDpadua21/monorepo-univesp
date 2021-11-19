package Exercicios6;

public class Pessoa {

	String nome;
	int idade;
	Pessoa conjugue;
	
	Pessoa(String nome, int idade, Pessoa conjugue) {
		this.nome = nome;
		this.idade = idade;
		this.conjugue = conjugue;
	}
	
	Pessoa(String nome, int idadeAtual) {
		this(nome, idadeAtual, null);
	}
	
}
