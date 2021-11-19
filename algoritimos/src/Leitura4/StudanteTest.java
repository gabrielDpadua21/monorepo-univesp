package Leitura4;

import javax.swing.JOptionPane;;

public class StudanteTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student1 s1 = new Student1("Gabriel", 100.0);
		
		JOptionPane.showMessageDialog(null, "Welcome " + s1.getName());
		JOptionPane.showMessageDialog(null, "You note is: " +s1.getLetterGrade());

	}

}
