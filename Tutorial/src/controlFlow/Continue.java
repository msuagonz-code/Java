package controlFlow;

/*
 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/branch.html
 * 
 * */

public class Continue {

	public static void main(String[] args) {
		
		/* 
		 * Continue
		 * Es una sentencia cuya función es parecida a break, con diferencia es no termina
		 * la ejecución del bucle, sino que termina la iteración, para que el bucle continue
		 * bien sea en una etiqueta especificada o bien sea en la siguiente iteración evitando
		 * que el resto del codigo se ejecute
		 * 
		 * */

		int[] Array = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };

		// Continue sin etiqueta
		for (int item : Array) {
			// numeros pares
			if (item % 2 == 0) {
				// Esto evita que se ejecute el println en los numero pares
				continue;
			}
			System.out.println(item);
		}
		
		
		// Continue con etiqueta
		int[][] nuevoArray = { { 0, 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 } };
		aqui:
		for (int[] arr1 : nuevoArray) {
			for (int item : arr1) {
				if (item % 2 == 0) {
					System.err.println(item);
					continue aqui; // Llamamos a la etiqueta
				}
				System.out.println(item);
			}
		}
		
		/* 
		 * Nota: jamás he visto que se use en el mundo real
		 * Haz debug con eclipse, y mira el comportamiento del codigo anterior, no tiene desperdicio :)
		 * 
		 * */

	}

}
