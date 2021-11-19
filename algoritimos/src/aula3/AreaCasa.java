package aula3;

public class AreaCasa {
	
	static double valorM2 = 1500;
	static final int alvenaria = 0;
	static final int vinil = 1;
	static final int fibra = 2;
	static final int plastico = 3;
	
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
		switch(material) {
			case alvenaria:
				return area * 1500;
			case vinil:
				return area * 1100;
			case fibra:
				return area * 750;
			case plastico:
				return area * 500;
			default:
				return -1;
				
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double areap;
		float lateral = 1;
		float cquarto = 7;
		int tipo;
		
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
		
		System.out.println("Area \t Material \t Valor");
		
		while(areap <= 200) {
			tipo = alvenaria;
			
			while(tipo <= plastico) {
				System.out.println(areap + "\t" + tipo + "\t\t" + valorPiscina(areap, tipo));
				tipo++;
			}
			
			areap += 50;
			
		}
			
		
	}

}
