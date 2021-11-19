package aula6;

public class Projeto2 {
	
	Residencia[] condominio;
	int ultimo = -1;
	
	boolean adicionaResidencia(Residencia r) {
		if(this.ultimo < this.condominio.length - 1) {
			ultimo++;
			this.condominio[ultimo] = r;
			return true;
		} else {
			return false;
		}
	}
	
	Projeto2(int tam) {
		condominio = new Residencia[tam];
	}

}
