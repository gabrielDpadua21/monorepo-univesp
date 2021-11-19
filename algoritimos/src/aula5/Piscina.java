package aula5;

public class Piscina {
	
	final int alvenaria = 0;
	final int vinil = 1;
	final int fibra = 2;
	final int plastico = 3;
	
	// preco armazena uma referencia ao endereco do array...
	double[] precos = {1500, 1100, 750, 500};
	
	//Calcula area da piscina...
	double areaPiscina(double raio) {
		// OPERADOR TERNARIO ...
		return raio >= 0 ? (Math.PI * Math.pow(raio, 2)) : -1;
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
