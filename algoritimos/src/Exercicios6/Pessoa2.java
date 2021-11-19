package Exercicios6;

public class Pessoa2 {

	String nome;
	int dia;
	int mes;
	int ano;
	Pessoa conjugue;
	
	Pessoa2(String nome, int dia, int mes, int ano, Pessoa conjugue) {
		this.nome = nome;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.conjugue = conjugue;
	}
	
	Pessoa2(String nome, int dia, int mes, int ano) {
		this(nome, dia, mes, ano, null);
	}
	
	static int ComparaNascimento(Pessoa2 p1, Pessoa2 p2) {
		if(p1.dia == p2.dia && p1.mes == p2.mes && p1.ano == p2.ano) {
			return -1;
		} else {
			
			if(p1.ano > p2.ano) {
				return 1;
			} else if(p1.ano == p2.ano && p1.mes > p2.mes) {
				return 1;
			} else if(p1.ano == p2.ano && p1.mes == p2.mes && p1.dia > p2.dia) {
				return 1;
			} else {
				return 0;
			}
			
		}
	}
	
	static void ordenaPessoas(Pessoa2[] pessoas) {
		Pessoa2 aux;
		
		for(int ult = pessoas.length -1; ult > 0; ult--) {
			for(int i = 0; i < ult; i++) {
				if(ComparaNascimento(pessoas[i], pessoas[i+1]) == 1) {
					aux = pessoas[i];
					pessoas[i] = pessoas[i+1];
					pessoas[i+1] = aux;
				}
			}
		}
		
	}
	
}
