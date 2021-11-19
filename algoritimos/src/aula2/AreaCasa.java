package aula2;

public class AreaCasa {
	
	//Atributo - scopo global
	static double valorM2 = 1500;

	//Calcula area da casa...
	static void areaCasa(float lateral, float cquarto) {
		float areaq;
		float areas;
		float areat;
		
		areaq = lateral * cquarto / 2;
		areas = lateral * lateral;
		areat = areas + areaq * 2;
		
		System.out.println("Area do quarto: " + areaq);
		System.out.println("Area do Banheiro: " + areaq);
		System.out.println("Area da sala: " + areas);
		System.out.println("Area total: " + areat);
	}
	
	//Calcula area da piscina...
	static double areaPiscina(double raio) {	
		return (Math.PI * Math.pow(raio, 2));
	}
	
	static double valor(double area) {	
		return valorM2 * area;
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double areap;
		float lateral = 11;
		float cquarto = 7;
		
		areaCasa(lateral, cquarto);
		
		// Passagem por valor ...
		areap = areaPiscina(3);
		
		System.out.println("Area da piscina: " +areap);

	}

}
