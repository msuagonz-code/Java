package controlFlow;
import java.lang.reflect.Method;

/*
 *https://docs.oracle.com/javase/tutorial/java/nutsandbolts/branch.html
 * 
 * */

public class Return {

	public static void main(String[] args) {
		Return obj = new Return();
		/*
		 * Return
		 * La sentencia return, sale del meto actual, return se puede usar de dos formas
		 * 
		 * + Devolviendo un valor al salir del metodo actual
		 * + Sin devolver valor alguno al salir del metodo actual
		 * 
		 * No obstante, no es una buena práctica devolver un return sin valor
		 *  
		 * */

		int a = 2, b = 3;
		int suma = obj.suma(a, b);
		
		System.out.println("La funcion suma devuelve: " + suma);

		obj.imprime("Esta funcion no retorna valor");
	}

	public int suma( int a, int b) {
		return a + b;		
	}
	
	public void imprime(String mensaje) {
		System.out.println(mensaje);
		return;
	}
}
