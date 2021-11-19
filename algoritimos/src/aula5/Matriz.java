package aula5;

public class Matriz {
	
	static double[][] calculaDesconto(double[][] valores, double[][] descontos) {
		if(valores.length != descontos.length || valores[0].length != descontos[0].length) {
			return null;
		} else {
			
			double[][] valoresDescontos = new double[valores.length][valores[0].length];
			
			for(int i = 0; i < valores.length; i++) {
				for(int j = 0; j < valores[0].length; j++) {
					valoresDescontos[i][j] = valores[i][j] - (valores[i][j] * descontos[i][j] / 100);
				}
			}
			
			return valoresDescontos;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[][] nomes = {
				{'f', 'r', 'a', 'j', 'o', 'l', 'a'}, 
				{'t', 'h', 'o', 'r'}
		};
		
		double[][] valores = {
				{1000.0, 2000.0, 2500.0, 3000.0},
				{2330.0, 1200.0, 123.30, 2300.0},
				{234.0, 2345.0, 2342.1, 2342.0},
				{1234.0, 1200.0, 3400.0, 2300}
		};
		
		double[][] descontos = {
				{2.0, 34.0, 23.0, 12.0},
				{12.0, 13.0, 15.0, 12.3},
				{34.0, 23.0, 54.0, 23.0},
				{54.0, 23.0, 12.0, 5.0}
		};
		
		// outra forma de inicializar uma matriz
		char[][] gatos = new char[4][9];
		double[][] valoresDescontos = calculaDesconto(valores, descontos);
		
		System.out.println(nomes[0]);
		System.out.println(nomes[1]);
		
		if(valoresDescontos != null) {
			for(int i = 0; i < valoresDescontos.length; i++) {
				for(int j = 0; j < valoresDescontos[0].length; j++) {
					System.out.print(valoresDescontos[i][j] + "\t");
				}
				
				System.out.println("");
			}
		} else {
			System.out.println("Valores inválidos");
		}
		
		
	}

}
