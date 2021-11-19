package aula6;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String gato1 = "frajola";
		String gato2 = "thor";
		
		System.out.println(gato1);
		System.out.println(gato2);
		
		System.out.println(gato1 == gato2);
		
		gato2 = "frajola";
		
		System.out.println(gato1 == gato2);
		
		
		System.out.println(gato1.compareTo(gato2));
		System.out.println(gato1.equals(gato2));
	}

}
