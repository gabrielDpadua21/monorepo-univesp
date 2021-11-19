package Exercicios5;

public class CompletoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Complexo c1 = new Complexo();
		Complexo c2 = new Complexo();
		Complexo soma = new Complexo();
		Complexo sub = new Complexo();
		
		c1.re = 6;
		c1.im = 5;
		c2.re = 2;
		c2.im = 1;
		
		soma = soma.soma(c1, c2);
		sub = sub.sub(c1, c2);
		
		System.out.println(soma.re + "  " + soma.im);
		System.out.println(sub.re + "  " + sub.im);

	}

}
