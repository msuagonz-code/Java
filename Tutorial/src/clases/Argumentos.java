package clases;

/*
 * https://docs.oracle.com/javase/tutorial/java/javaOO/arguments.html
 * */

public class Argumentos {
	
	public String mensaje = "Hola Universo";

	public static void main(String[] args) {
		/*
		 * Argumentos vs Parametros
		 * Se les dice parametros, a la lista de variables que componen la firma de un metodo.
		 * 
		 * Se les dice argumentos, a los valores que se le pasa al metodo cuando es invocado
		 * */
		int argumento = 5;
		metodo(argumento);
		
		/* Tipos de Parametros 
		 * Los metodos, pueden recibir cualquier tipo de dato primitivo, o de referencia, como objetos y arrays
		 * */
		
		int[] array = {9,8,7,6};
		metodo(array);
		
		Argumentos obj = new Argumentos();
		metodo(obj);
		
		/* Numero Arbitrario de parametros (varargs)
		 * Cuando no sabes la cantidad de parametros que va a recibir un metodo, se usa varargs, usando la elipsis es decir
		 * tres puntos (...), en el ultimo parámetero de la lista, se coloca la elipsis en el tipo de valor del parametro
		 * esto crea un array con el tipo de parametro declarado por ejemplo:
		 * 
		 * public static void metodo(int primero, int... segundo)
		 * 
		 * int... crea un array del tamaño de los parametros, lo que diferencia esto de un parametro array es que el parametro
		 * con elipsis es opcional
		 * 
		 * */

		String arg1 = "Primer Arg";
		metodo(arg1, 1,2,3,4,5);
		metodo(arg1);
	}

	public static void metodo(int parametro) {
		System.out.println("yo soy un parametro "+ parametro);
	}
	
	public static void metodo(int[] parametroArray) {
		for(int valor : parametroArray){
			System.out.println("Soy el valor "+ valor + " del array");
		}
	}
	
	public static void metodo(Argumentos parametroObjeto) {
		System.out.println(parametroObjeto.mensaje);
	}
	
	public static void metodo(String primero, int... segundo) {
		
		System.out.println("Soy el valor "+ primero + " del metodo");
		
		for(int valor : segundo){
			System.out.println("Soy el valor "+ valor + " del array Segundo");
		}
		
	}
	
}
