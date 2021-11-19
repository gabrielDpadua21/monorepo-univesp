package Exercicios5;

public class Exercicio6 {
	
	
	static double[] acumuladoSemestre(double[][] balanco) {
		double[] acumulado = new double[balanco.length];
		
		for(int i = 0; i < balanco.length; i++) {
			for(int j = 0; j < balanco[0].length; j++) {
				acumulado[i] += balanco[i][j];
			}
		}
		
		return acumulado;
	}
	
	static double[] vendeuMais(double[][] balanco) {
		
		double[] acumulado = acumuladoSemestre(balanco);
		double[] valores = new double[2];
		
		valores[0] = acumulado[0];
		
		for(int i = 0; i < balanco.length; i++) {
			if(valores[0] < acumulado[i]) {
				valores[0] = acumulado[i];
				valores[1] = i;
			}
		}
		
		
		
		return valores;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[][] balanco = {
				{20000.0, 35000.0, 2000.20, 20832.0, 10500.0, 12000.0},
				{15453.0, 5300.0, 42000.0, 135832.0, 18580.36, 85200.0},
				{14.320, 55800.0, 12356.0, 2563.0, 100000.0, 63225.0},
				{12345.0, 44823.0, 15863.25, 56483.55, 93000.0, 4852.33}
		};
		
		String[] meses = {"jan", "fev", "mar", "abr", "mai", "jun"};
		
		String[] filias = {"Aqui", "La", "Acola", "Por ai"};
		
		for(int i = 0; i < balanco.length; i++) {
			System.out.print("\t" +meses[i]);
		}
		
		System.out.println("");
		
		for(int i = 0; i < balanco.length; i++) {
			System.out.print(filias[i] + " - ");
			for(int j = 0; j < balanco.length; j++) {
				System.out.print(" " + balanco[i][j] + " ");
			}
			
			System.out.println("");
		}
		
		double[] valores = vendeuMais(balanco);
		
		System.out.println("A filia que vendeu mais no semestre foi: " + filias[(int)valores[1]]);
		System.out.println("Quantida acumulada de: " + valores[0]);

	}

}
