package Exercicios6;

public class ProdutoTeste {
	
	//Ordenacao decrescente...
	static void ordenaProdutos(Produtos[] prods) {
		Produtos aux;
		
		for(int ult = prods.length - 1; ult >= 0; ult--) {
			for(int i = 0; i < ult; i++) {
				if(prods[i].codProduto < prods[i+1].codProduto) {
					aux = prods[i];
					prods[i] = prods[i+1];
					prods[i+1] = aux;
				}
			}
		}
		
	}
	
	//Ordenacao Crescente...
	static void ordenaProdutos2(Produtos[] prods) {
		Produtos aux;
		
		for(int ult = prods.length - 1; ult >= 0; ult--) {
			for(int i = 0; i < ult; i++) {
				if(prods[i].codProduto < prods[i+1].codProduto) {
					aux = prods[i];
					prods[i] = prods[i+1];
					prods[i+1] = aux;
				}
			}
		}
		
	}
	
	
	// Busca binaria de produtos...
	static int buscaProdutos(Produtos[] prods, int cod) {
		int fim = prods.length - 1;
		int ini = 0;
		
		//Ordenacao crescente...
		ordenaProdutos2(prods);
		
		while(ini <= fim) {
			int meio = (ini + fim) / 2;
			
			if(prods[meio].codProduto < cod) {
				ini = meio + 1;
			} else {
				if(prods[meio].codProduto > cod) {
					fim = meio - 1;
				} else {
					return meio;
				}
			}
		}
		
		return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Produtos[] prods = new Produtos[4];
		int codProd = 33;
		
		for(int i = 0; i < 4; i++) {
			Produtos p1 = new Produtos((int)(Math.random() * 50), (int)(Math.random() * 50));
			prods[i] = p1;
		}
		
		System.out.println("Não ordenados");
		
		// Não ordenado...
		for(Produtos prod: prods) {
			System.out.println("Codigo Produtos: " + prod.codProduto);
		}
		
		ordenaProdutos(prods);
		
		System.out.println("Ordenados");
		
		//Ordenado ...
		for(Produtos prod: prods) {
			System.out.println("Codigo do Produto: " + prod.codProduto);
		}
		
		int valor = buscaProdutos(prods, codProd);
		
		if(valor < 0) {
			System.out.println("Produto não encontrado");
		} else {
			System.out.println("Produto encontrado: " + prods[valor].codProduto);
		}

	}

}
