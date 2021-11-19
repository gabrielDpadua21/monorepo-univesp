package Exercicios5;

public class Simples {

	public void inicializaArray(int[] array, int v) {
		for(int i = 0; i < array.length; i++) {
			array[i] = v;
		}
	}
	
	public boolean estaArray(int[] array, int v) {
		for(int i = 0; i < array.length; i++) {
			if(v == array[i]) {
				return true;
			}
		}
		
		return false;
	}
	
	
}
