package Exercicios5;

public class Retangulo {
	
	private double altura;
	private double comprimento;
	
	Retangulo() {};
	
	Retangulo(double altura, double comprimento) {
		this.altura = altura;
		this.comprimento = comprimento;
	}
	
	public double Area() {
		return this.altura * this.comprimento;
	}
	
	public double Perimetro() {
		return (this.altura + this.comprimento) * 2;
	}

}
