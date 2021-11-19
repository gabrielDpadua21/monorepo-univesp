package aula2;

// OPERADORES ARITIMETICOS E VARIÁVEIS
// + - * / 

public class CasaRet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		// CONVERSAO DE DOUBLE PARA FLOAT - ERRO JAVA
		//float x = 1.8F;
		
		//double x = 0;
		//double y = 0;
		
		// Exemplo - NOT A NUMBER
		//System.out.println(x/y);
		
		// Variaveis do tipo REAL
		float lateral = 11; // Lateral da casa
		float cquarto = 7; // Largura do quarto
		float areaSala; // Area do sala
		float areaQuarto; // Area do quarto
		float areaBanheiro; // Area do banheiro
		float areaTotal; // Area total
		
		areaSala = lateral * lateral;
		areaQuarto = (lateral / 2) * cquarto;
		areaBanheiro = areaQuarto;
		areaTotal = areaSala + areaQuarto + areaBanheiro;
		
		
		System.out.println("Area da sala: " + areaSala);
		System.out.println("A area do quarto: "+ areaQuarto);
		System.out.println("A area do banheiro: " + areaBanheiro);
		System.out.println("A area total: " + areaTotal);
	}

}
