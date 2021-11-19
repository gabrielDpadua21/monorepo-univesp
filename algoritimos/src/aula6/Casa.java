package aula6;

public class Casa {

	double valorM2;
	double lateral;
	double cquarto;
	
	// construtor padrao
	Casa() {
		this(1500.0, 10, 10);
	}
	
	Casa(double valorM2, double lateral, double cquarto) {
		this.valorM2 = valorM2;
		this.lateral = lateral;
		this.cquarto = cquarto;
	}
	
	//Calcula area da casa...
	double areaCasa() {
		double areaq;
		double areas;
		double areat;
		
		if(this.lateral < 0 || this.cquarto < 0) {
			System.out.println("Erro: parametro < 0");
			return -1;
		} else {
			areaq = this.lateral * this.cquarto / 2;
			areas = this.lateral * this.lateral;
			areat = areas + areaq * 2;
			
			return areat;
		}
	}
	
	//Calcula o valor da construcao...
	double valor(double area) {
		if(area >= 0) 
			return this.valorM2 * area;
		 
		return -1;
	}

}
