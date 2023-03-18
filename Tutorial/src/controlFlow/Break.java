package controlFlow;

/*
 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/branch.html
 * 
 * */

public class Break {

	public static void main(String[] args) {
		/*
		 * Break
		 * esta sentencia se puede utilizar para terminar el flujo de ejecución de una estructura
		 * for, while, do-while o switch
		 * 
		 * */
		
		int[] nuevoArray = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };

		// Ejemplo con For
		for (int item : nuevoArray) {
			if (item == 3) {
				System.out.println("yo me salgo del For! index: " + item);
				break;
			}
		}
		
		// Ejemplo con While
		int index = 0;
		while (index < 10) {
			if (nuevoArray[index] == 6) {
				System.out.println("yo me salgo del while! index: " + index);
				break;
			}
			++index;
		}

		// Ejemplo con Do-While
		index = 0;
		do {
			if (nuevoArray[index] == 6) {
				System.out.println("yo me salgo del do-while! index: " + index);
				break;
			}
			++index;
		} while (index < 10);
	}

}
