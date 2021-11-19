package Exercicios5;

public class Ola {
	
	public String comprimentar = "Ola";
	
	public Ola() {};
	
	public Ola(int comprimento) {
		switch(comprimento) {
			case 2:
				this.comprimentar = "Oi";
				break;
			case 3:
				this.comprimentar = "Hello";
				break;
			default:
				this.comprimentar = "Olá";
				break;
		}
	}
	
	public void Comprimentar() {
		System.out.println(this.comprimentar);
	}

}
