package Exercicios5;

public class RetanguloTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Retangulo r1 = new Retangulo(2, 3);
		
		double area = r1.Area();
		double perimetro = r1.Perimetro();
		
		System.out.println("Area: " + area);
		System.out.println("Perimetro: " + perimetro);

	}

}
