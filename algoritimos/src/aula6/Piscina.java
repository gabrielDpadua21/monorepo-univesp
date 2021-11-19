package aula6;

public class Piscina {
	
	final int alvenaria = 0;
	final int vinil = 1;
	final int fibra = 2;
	final int plastico = 3;
	
	// preco armazena uma referencia ao endereco do array...
	double[] precos;
	double raio;
	
	// construtores multiplos...
	
	// construtor padrao...
	Piscina() {
		this(new double[] {1500, 1100, 750, 500});
		this.raio = 10;
	}
	
	// contrutor reload precos
	Piscina(double[] precos) {
		this.precos = precos;
		this.raio = 10;
	}
	
	// contrutor chama o construtor padrao e sobrescreve o raio
	Piscina(double raio) {
		this();
		this.raio = raio;
	}
	
	// construtor com 2 parametros...
	Piscina(double[] precos, double raio) {
		this.precos = precos;
		this.raio = raio;
	}
	
	//Calcula area da piscina...
	double areaPiscina() {
		// OPERADOR TERNARIO ...
		return this.raio >= 0 ? (Math.PI * Math.pow(this.raio, 2)) : -1;
	}
	
	// Calcula o valor da piscina...
	double valorPiscina(double area, int material) {
		if(material < alvenaria || material > plastico || area < 0) {
			return -1;
		}
		
		return area * precos[material];
	}
	
	// calcula media do preco da piscina...
	void mediaPrecoPiscina(double[] precos) {
		double media = 0;
		
		for(double valor: precos) {
			media += valor;
		}
		
		media = media / precos.length;
		
		System.out.println(media);
	}

}
