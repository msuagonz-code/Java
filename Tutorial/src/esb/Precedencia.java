package esb;

public class Precedencia {

	public static void main(String[] args) {
		/*
		 * Cuando una Sentencia en Java utiliza varias operaciones, la lectura de estas sentencias
		 * puede ser confusa, Java ejecuta las operaciones de acuerdo al nivel de precedencia de los
		 * operadores en la expresión dada
		 * 
		 * Aquí pueden conseguir una tabla con la presendencia de los operadores 
		 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html
		 * 
		 * No obstante es una buena practica, utilizar el paréntesis para evitar ambigüedades y de esta forma
		 * hacer el código más claro y fácil de mantener
		 * 
		 * */
		
		// Los siguientes ejemplos representan esta problemática
		
		int entero = 2 + 3 * 4 - 8 / 2; // Operación Ambigua
		
		System.out.println(entero);
		
		entero = 2 + (3 * 4) - (8 / 2); // Operación No Ambigua
		
		System.out.println(entero);
		
		entero = 2 + 3 * (4 - 8) / 2; // Operación No Ambigua
		
		System.out.println(entero);
		
		entero = (2 + 3) * 4 - 8 / 2; // Operación No Ambigua
		
		System.out.println(entero);
		
	}

}
