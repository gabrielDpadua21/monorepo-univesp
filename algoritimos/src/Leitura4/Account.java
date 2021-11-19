package Leitura4;

public class Account {

	private String name;
	private double balance;
	
	// metodo construtor...
	public Account(String name, double balance) {
		this.name = name; // parametro do metodo contrutor
		
		if(balance > 0.0)
			this.balance = balance;
	}
	
	// metodo que adicione uma quantida a balance...
	public void deposit(double depositAmount) {
		if(depositAmount > 0.0)
			balance = balance + depositAmount;
	}
	
	// metodo que retorno o balance ...
	public double getBalance() {
		return balance;
	}
	
	public void setName(String name) {
		this.name = name; // armazena name
	}
	
	public String getName() {
		return name; // retorna o valor de name
	}
	
}
