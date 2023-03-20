package clases;

/*
 * https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html
 * https://docs.oracle.com/javase/tutorial/java/javaOO/classdecl.html
 * 
 * Nota:
 * En este apartado solo se explicará la sintaxis de la declaración de clases y no
 * el concepto teórico de lo que son las clases pueso eso es materia de estudio de la 
 * POO, y por ahora se escapa de la intención de estos ejercicios
 * 
 * */

public class Clases {

	/*
	 * Clases
	 * A continuación se listan en orden los elementos que pueden conformar una declaración de clase
	 * nota:cuando una clase está dentro de otra, se le conoce como clase anidada.
	 * 
	 * [Opcional] Modificadores de acceso: los modificadores public y private son aplicables a las clases, el modificador
	 * de acceso private solo se puede aplicar cuando una clase está anidada.
	 * 
	 * [Obligatorio] Class seguido del nombre de la clase, con la primera letra en mayuscula.
	 * 
	 * [Opcional] Extends: palabra reservada que indica que la clase actual es una subclase de la clase extendida (padre).
	 * 
	 * [opcional] Implements: palabra reservada que indica que la clase actual utiliza 1 o más interfaces, si se implementan
	 * más de una interfaz, deberan aparecer separadas por comas.
	 * 
	 * */
	
	class ClaseHija extends Clases implements Interfaz{ // Esta es una clase anidada básica
		/*
		 * ClaseHija hereda la clase Clases e implementa la interfaz de nombre Interfaz
		 * 
		 * */ 
	}

}
