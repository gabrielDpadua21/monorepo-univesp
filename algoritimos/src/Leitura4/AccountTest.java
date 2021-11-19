package Leitura4;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		JOptionPane.showMessageDialog(null, "Welcome to java");
		
		Account myAccount = new Account("Frajola", 100.0);
		Account myAccount2 = new Account("Thor", -7.0);
		
	    System.out.println("Nome: " + myAccount.getName());
	    System.out.println("Saldo: " +myAccount.getBalance());
	    
	    System.out.println("Nome: " +myAccount2.getName());
	    System.out.println("Saldo: " +myAccount2.getBalance());
	    
	    String nome = JOptionPane.showInputDialog("Digite novo nome para conta");
	    
	    String dep = JOptionPane.showInputDialog("Digite o valor do deposito");
	     
	    myAccount.setName(nome);
	    myAccount.deposit(Double.parseDouble(dep));
	    
	    System.out.println("Novo nome em account: " + myAccount.getName());
	    System.out.println("Saldo: " + myAccount.getBalance());
	}

}
