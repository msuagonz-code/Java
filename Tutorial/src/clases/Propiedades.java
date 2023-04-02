package clases;

/*
 * https://docs.oracle.com/javase/tutorial/java/javaOO/variables.html
 * 
 * */

public class Propiedades {

	public static void main(String[] args) {
		/*
		 * Existen varios tipos de de variables
		 * 	+ Propiedades: Son variables miembros de clases.
		 * 	+ Locales: Son variables declaradas dentro de metodos o bloques de codigo
		 * 	+ Parametros: Variables en declaración de metodos.
		 * 
		 * Modificadores de Acceso
		 * 	+ Publico: Las propiedades son accesibles desde cualquier clase
		 * 	+ Privado: Las propiedades son accesibles solo desde la propia clase
		 *
		 * Tipo
		 * Todas las variables deben tener un tipo
		 * bien sea, cualquiera de los 8 tipos primitivos, o los tipos por referencia como
		 * String, object, array etc..
		 * 
		 * Nombres
		 * 	Vease:
		 * 		+ https://docs.oracle.com/javase/tutorial/java/nutsandbolts/variables.html#naming
		 * 
		 * 	Ejemplos: src.variables.Declaracion.java
		 * */
	}
	
	
	public class subclase{
		
		public int entero; // entero es una propiedad que puede ser accedido por cualquier clase
		private float decimal; // decimal es una propiedad que solo puede ser accedido por la clase subclase
		
		public int metodoSubclase( int parametro ) {
			// La variable declarada en el metodo, es un parametro
			int calculo = parametro + 1; // Esta es una variable Local
			return calculo;
		}
		
		public float getDecimal() {
			// Este metodo permite retornar el valor de una variable privada desde cualquier otra clase
			return this.decimal;
		}
	}

}
