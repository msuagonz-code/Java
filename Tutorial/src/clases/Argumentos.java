package clases;

/*
 * https://docs.oracle.com/javase/tutorial/java/javaOO/arguments.html
 * */

public class Argumentos {

	public static void main(String[] args) {
		/*
		 * Argumentos vs Parametros
		 * Se les dice parametros, a la lista de variables declaradas, el la declaración de un metodo
		 * es decir, la lista de variables que componen la firma de un metodo.
		 * 
		 * Se les dice argumentos, a los valores que se le pasa al metodo cuando es invocado
		 * */
		int argumento = 5;
		metodo(argumento);
		
		// Parameter Types
		// Arbitrary Number of Arguments
		// Parameter Names
		// Passing Primitive Data Type Arguments
		// Passing Reference Data Type Arguments
	}

	public static void metodo(int parametro) {
		System.out.println("yo soy un parametro "+ parametro);
	}
}
