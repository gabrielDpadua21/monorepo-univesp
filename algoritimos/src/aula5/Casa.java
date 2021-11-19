package aula5;

public class Casa {

	double valorM2;
	
	// construtor padrao
	Casa() {
		this(1500.0);
	}
	
	Casa(double valorM2) {
		this.valorM2 = valorM2;
	}
	
	//Calcula area da casa...
	double areaCasa(double lateral, double cquarto) {
		double areaq;
		double areas;
		double areat;
		
		if(lateral < 0 || cquarto < 0) {
			System.out.println("Erro: parametro < 0");
			return -1;
		} else {
			areaq = lateral * cquarto / 2;
			areas = lateral * lateral;
			areat = areas + areaq * 2;
			
			return areat;
		}
	}
	
	//Calcula o valor da construcao...
	double valor(double area) {
		if(area >= 0) 
			return valorM2 * area;
		 
		return -1;
	}

}
