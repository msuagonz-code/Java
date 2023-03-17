package esb;

/*
 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/expressions.html
 * 
 * */

public class Sentencias {

	public static void main(String[] args) {
		
		/*
		 * Sentencias
		 * Una sentencia es linea de codigo que termina en con el simbolo ; y 
		 * está compuesta por una o varias expresiones 
		 * 
		 * */
		
		// Esta es una sentencia
		Sentencias obj = new Sentencias();
		
		// Esta es otra sentencia
		System.out.println(obj.suma(2, 4));

	}
	
	public String suma( int a, int b) {
		
		return String.valueOf(a + b);
		
	}

}
