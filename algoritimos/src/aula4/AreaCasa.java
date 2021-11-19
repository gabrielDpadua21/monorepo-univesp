package aula4;

public class AreaCasa {
	
	static double valorM2 = 1500;
	static final int alvenaria = 0;
	static final int vinil = 1;
	static final int fibra = 2;
	static final int plastico = 3;
	
	// preco armazena uma referencia ao endereco do array...
	static double[] precos = {1500, 1100, 750, 500};
	
	//Calcula area da casa...
	static void areaCasa(float lateral, float cquarto) {
		float areaq;
		float areas;
		float areat;
		
		if(lateral < 0 || cquarto < 0) {
			System.out.println("Erro: parametro < 0");
		} else {
			areaq = lateral * cquarto / 2;
			areas = lateral * lateral;
			areat = areas + areaq * 2;
			
			System.out.println("Area do quarto: " + areaq);
			System.out.println("Area do Banheiro: " + areaq);
			System.out.println("Area da sala: " + areas);
			System.out.println("Area total: " + areat);
		}
		
		
	}
	
	//Calcula area da piscina...
	static double areaPiscina(double raio) {
		// OPERADOR TERNARIO ...
		return raio >= 0 ? (Math.PI * Math.pow(raio, 2)) : -1;
	}
	
	//Calcula o valor da construcao...
	static double valor(double area) {
		if(area >= 0) 
			return valorM2 * area;
		 
		return -1;
	}
	
	// Calcula o valor da piscina...
	static double valorPiscina(double area, int material) {
		if(material < alvenaria || material > plastico || area < 0) {
			return -1;
		}
		
		return area * precos[material];
	}
	
	static void mediaPrecoPiscina(double[] precos) {
		double media = 0;
		
		for(double valor: precos) {
			media += valor;
		}
		
		media = media / precos.length;
		
		System.out.println(media);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double areap;
		float lateral = 1;
		float cquarto = 7;
		
		areaCasa(lateral, cquarto);
		
		// Passagem por valor ...
		areap = areaPiscina(2);
			
		double areaTotal = areap;

		double preco = valor(areaTotal);
		boolean valorOK = preco >= 0;
		
		
		System.out.print("O valor da construcao: ");
		
		if(valorOK)
			System.out.println("é " + preco);
		else
			System.out.println("Não foi obtido, valor negativo");
		
		System.out.print("Media de precos: ");
		// PASSAGEM DE PARAMETRO POR REFERENCIA ...
		mediaPrecoPiscina(precos);
		
		System.out.println("Area \t Material \t Valor");
		
		// TABELA COM LACO FOR...
		for(int area = 50; area <= 200; area+=50) {
		
			for(int tipo = alvenaria; tipo <= plastico; tipo++) {
				System.out.println(area + "\t" + tipo + "\t\t" + valorPiscina(area, tipo));
			}
			
		
		}
			
		
	}

}
