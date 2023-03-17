package controlFlow;

/*
 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/if.html
 * 
 * */

public class IfElse {

	public static void main(String[] args) {
		
		/* IF
		 * La sentencia IF, es la más básica de las estructuras de control de flujo.
		 * Le indica al programa que ejecute un bloque de codigo solo si se una condición dada
		 * es evaluada a true
		 *  
		 * if(condicion){
		 * 	Codigo;
		 * }
		 * 
		 * */
		
		if( true ) {
			System.out.println("Estoy dentro de un IF");
		}
		
		/* IF...ELSE
		 * Esta estructura provee una alternativa en caso de que la condición evaluada en el if sea falsa.
		 * 
		 * if(condicion){
		 * 	Codigo;
		 * }else{
		 * 	Codigo
		 * }
		 * 
		 * */

		if( false ) {
			// Este codigo no se ejecuta porque !condicion resulta falso
		}else {
			System.err.println("Estoy dentro de un ELSE");
		}

	}

}
