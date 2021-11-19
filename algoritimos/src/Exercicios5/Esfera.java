package Exercicios5;

public class Esfera {

	private double raio;
	
	Esfera(double raio) {
		this.raio = raio;
	}
	
	public void Area() {
		double area = 4 * Math.PI * Math.pow(this.raio, 2);
		
		System.out.println("Area da esfera: " + area);
	}
	
	public void Volume() {
		double volume = 4 * Math.PI * Math.pow(this.raio, 3) / 3;
		
		System.out.println("Volume da esfera: " + volume);
	}

}
