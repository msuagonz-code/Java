package controlFlow;

/*
 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html
 * 
 * */

public class For {

	public static void main(String[] args) {
		
		/*
		 * For
		 * Es una estructura de control, repetitiva parecida al while en cuanto a que
		 * debe evaluarse una condición dada a true para que se ejecute el bloque de código
		 * 
		 * El bucle for, tiene una primera sección donde se inicializa una o más variables de control
		 * esta sección se ejecuta solo una vez al principio, luego está la siguiente sección, donde
		 * se evalua la condición para que se ejecute el bloque de codigo del For, cuando la condición
		 * es evaluada a true se ejecuta el bloque de codigo, una vez finalizada la ejecución del bloque
		 * de codigo codigo se pasa a la ultima sección que es la sección de cambio donde se procede a 
		 * incrementar o disminuir el valor de las variables de control inicializadas al principio
		 * 
		 * for (inicializacion; condicion; incremento){
		 * 			Sentencia;
		 * 			Sentencia;
		 * 			Sentencia;
		 * }
		 * 
		 * */
		
		for (int i = 0; i < 10; ++i) {
			System.out.println(i);
		}
		
		/*
		 * for tambien se puede usar como un bucle infinito de la siguiente manera
		 * 
		 * for ( ; ; ) {
		 * 			Sentencia;
		 * 			Sentencia;
		 * 			Sentencia;
		 * }
		 * 
		 * El for es especialmente útil para recorrer arrays, matrices o listas, con la
		 * siguiente estructura
		 * 
		 * for( inicializacion : array ) {
		 * 			Sentencia;
		 * 			Sentencia;
		 * 			Sentencia;
		 * }
		 * 
		 * Donde solo se inicializa una variable a la que se le asignará un miembro del array
		 * en cada iteración
		 * 
		 * */
		
		int[] nuevoArray = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

		for(int item: nuevoArray) {
			System.out.println("Valor actual del array: "+ item);
		}
	}

}
