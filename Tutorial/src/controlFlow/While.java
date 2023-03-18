package controlFlow;

/*
 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/while.html
 * 
 * */

public class While {

	public static void main(String[] args) {
		
		/*
		 * While
		 * Es una estructura de repeticion que se ejecuta mientras una expresión sea
		 * evaluada a true, por lo que se puede no ejecutarse
		 * 
		 * while (Expresion) {
		 * 		Sentencia;
		 * }
		 *
		 * Es necesario controlar que la Expresión en algun momento cambie de estado true a false
		 * para que deje de ejecutarse, de lo contrario se ejecutará infinitas veces
		 * 
		 * */

		int i = 0;
		while (i < 5) { // Si se evalua i > 5, el while no se ejecuta
			System.out.println(i);
			++i; // Esto cambia eventualmente el valor de la condición
		}

		/*
		 * do-while
		 * Esta estructura de repecición difiere solo en que el bloque de codigo del while se ejecuta 
		 * al menos 1 vez
		 * 
		 * */
		
		do {
			System.out.println(i);
			++i;
		} while (i > 5); // El while solo se ejecuta 1 vez
	}

}
