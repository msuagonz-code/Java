package esb;

/*
 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/expressions.html
 * 
 * */

public class Expresiones {

	public static void main(String[] args) {
		
		/* https://es.wikipedia.org/wiki/Expresi%C3%B3n_(inform%C3%A1tica)
		 * 
		 * Una expresion es una construcción hecha de variables, operadores o invocación de metodos
		 * que son utilizados de acuerdo con la sintaxis del leenguaje que se evalúa y da como resultado
		 * un valor único
		 * 
		 * el tipo del valor de retorno de una expresion depende de los elementos usados en la expresión
		 * */
		
		// Esto es una expresión
		int var = 2;
		
		
		/*
		 * A pesar de que el valor de retorno de las expresiones depende de los valores devueltos en las operaciones
		 * es tambien es muy común referirse a ellas de acuerdo a los operadores que se emplean
		 * 
		 * Aritmeticas
		 * Logicas
		 * Binarias
		 * 
		 * etc., así se puede referir a una expresión por sus operaciones o por el valor de vuelto
		 * 
		 * */
		
		var = var + 4; // Esta expresión Aritmetica
		var = var << 2; // Esta es una expresión binaria a pesar de que su valor de retorno es entero
		boolean bol = true && false; // Esta es una expresión lógica
		
	}

}
