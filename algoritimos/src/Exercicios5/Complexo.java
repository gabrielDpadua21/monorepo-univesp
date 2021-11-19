package Exercicios5;

public class Complexo {

	// Parte real ...
	double re;
	
	// Parte imaginaria ...
	double im;
	
	static Complexo soma(Complexo c1, Complexo c2) {
		Complexo resp = new Complexo();
		
		resp.re = c1.re + c1.re;
		resp.im = c1.im + c2.im;
		
		return resp;
	}
	
	static Complexo sub(Complexo c1, Complexo c2) {
		Complexo resp = new Complexo();
		
		resp.re = c1.re - c1.re;
		resp.im = c1.im - c2.im;
		
		return resp;
	}
	
}
