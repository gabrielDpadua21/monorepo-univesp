package aula5;

public class Projeto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Casa casa1 = new Casa();
		Casa casa2 = new Casa(2000.0);
		Piscina p1 = new Piscina();
		Piscina p2 = new Piscina();
		
	
		double areaTotal1 = casa1.areaCasa(5, 2) + p1.areaPiscina(4);
		double areaTotal2 = casa2.areaCasa(10, 3.4) + p2.areaPiscina(5);
		
		System.out.println("Area Total 1: " + areaTotal1);
		System.out.println("Valor casa 1: " + casa1.valor(casa1.areaCasa(5, 2)));
		
		System.out.println("Area Total 2: " + areaTotal2);
		System.out.println("Valor casa 2: " + casa2.valor(casa2.areaCasa(10, 3.4)));
	}

}
