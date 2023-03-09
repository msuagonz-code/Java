package variables;

/*
 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html
 * 
 * */

public class Arrays {

	public static void main(String[] args) {

		/*
		 * Declaración de arrays
		 * 	+ <Tipo>[] nombreDeVariable;
		 * 
		 * La siguiente forma de declaración es posible pero no es recomendada:
		 * 	+ <Tipo> nombreDeVariable[];
		 * 
		 * Incialización de arrays
		 * 	+ <Tipo>[] nombreDeVariable = new <Type>[<Longitud>];
		 * 	+ <Tipo>[] nombreDeVariable = {valor, valor, valor, valor};
		 * Nota:
		 * 		+ Inicialización significa la reserva de memoria
		 * 		+ Antes de asignar un valor al array, es necesario inicializarlo 
		 * 
		 * Acceso a valores del array
		 * 	+ nombreDeVariable[Indice]
		 * Nota:
		 * 	+ El indice de los array comienza desde el 0, debido a esto para acceder
		 *	  a la decimo valor de un array se debe hacer referencia a al indice 9
		 *
		 * Asignación de valores al array
		 * 	+ nombreDeVariable[Indice] = valor;
		 *
		 * */
		
		// Se declara un array, y se inicializa
		char[] arrayInicializado = new char[2];
		arrayInicializado[0] = 'a';
		arrayInicializado[1] = 'b';
		
		// Se declara un array, sin inicializar
		int[] arrayNoInicializado;
		arrayNoInicializado = new int[2];
		
		// Se asigna valor a los arrays
		arrayNoInicializado[0] = 10;
		arrayNoInicializado[1] = 20;
		
		int[] arrayDeNumeros = {1,2,3,4,5,6};
		
		// Para saber el tamaño del array, exite el metodo .length que se usa de la siguiente manera en todos los arrays
		System.out.println(arrayDeNumeros[0]);

		/*
		 * Matrices
		 * Una matriz o array multidimencional, es un array que tiene varios niveles ejemplo:
		 * Nota: los espacios en este ejemplo solo están para la claridad visual
		 * 
		 * int[][] matrizDeNumeros = {
		 * 							   {1,2,3},
		 * 							   {4,5,6}
		 * 						   	 };
		 * 
		 * Las matrices son arrays que contienen arrays, gracais a esto los arrays miembros del array principal
		 * pueden variar de longitud ejemplo:
		 * 
		 *  int[][] matrizDeNumeros = {
		 * 							   {1,2,3},
		 * 							   {4,5}
		 * 						   	 };
		 * 
		 * */
		
		 int[][] matrizDeNumeros = { {1,2,3}, {4,5,6} };
		 
		 System.out.println(matrizDeNumeros[0][1]);
	}

}
