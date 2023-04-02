package clases;

/*
 * https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html
 * */

public class Metodos {

	public static void main(String[] args) {

		metodo(5);
		
	}
	
	/* 
	 * Declaración de metodos
	 * Generalmente la declaración de metodos tienen los siguientes componentes
	 * declarados en orden:
	 * 	+ Modificadores.
	 * 	+ Tipos de retorno.
	 * 	+ Nombre del metodo.
	 * 	+ Parametros listados entre parentesis ().
	 * 	+ Lista de excepciones.
	 * 	+ El cuerpo del metodo entre llaves {}.
	 * 
	 * Los nombres de metodos siguen la misma convención que la declaración de propiedades o variables 
	 * Ejemplo:
	 */
	public static void metodo(int parametro) {
		System.out.println(parametro);
	}

	/* 
	 * Sobrecarga de metodos
	 * 	Firma de Metodos:
	 * 		+ La firma de un metodo es la combinación del nombre del metodo y la lista de parametros
	 * 
	 * El compilador de Java es capaz de diferenciar entre los metodos debido a su firma, gracias a esto varios metodos
	 * pueden llamarse del mismo modo siempre y cuando su lista de parametros sea distinta, bien sea que 
	 * tengan diferente cantidad de parametros, o que los parametros sean de diferentes tipos.
	 * 
	 * El compilador de java no tiene en cuenta el tipo de retorno de los metodos para diferenciarlos, solamente tiene en 
	 * cuenta el tipo y cantidad de parametros, por lo que no puede declarar un metodo con la misma firma incluso si estos
	 * tienen diferente valor de retorno.
	 * 
	 * Ejemplo:
	 * */	
	public static void metodo(String parametro) {
		System.out.println(parametro);
	}

	public static void metodo(float parametro) {
		System.out.println(parametro);
	}
	
	public static void metodo(char parametro) {
		System.out.println(parametro);
	}
}
