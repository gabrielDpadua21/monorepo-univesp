package aula6;

public class Projeto2Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Projeto2 proj = new Projeto2(2);
		
		Casa c = new Casa(12, 11, 10);
		Piscina p = new Piscina(10);
		Residencia r = new Residencia(c, p);
		proj.adicionaResidencia(r);
		
		c = new Casa(8, 4, 5);
		p = new Piscina(23);
		r = new Residencia(c, p);
		proj.adicionaResidencia(r);
		
		// acessa area casa dentro do classe casa instanciada
		// dentro da classe condominio instaciada no objeto projeto2
		System.out.println(proj.condominio[0].casa.areaCasa());
		System.out.println(proj.condominio[1].casa.areaCasa());
		
	}

}
