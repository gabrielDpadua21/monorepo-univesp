package aula6;

public class Projeto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Casa c1 = new Casa(10, 10, 10);
		Piscina p1 = new Piscina();
		
		System.out.println("Area casa: " + c1.areaCasa());
		System.out.println("Area piscina: " + p1.areaPiscina());
		System.out.println("Area total: " + (c1.areaCasa() + p1.areaPiscina()));

	}

}
