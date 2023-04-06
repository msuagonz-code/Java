package clases;

/*
 * https://docs.oracle.com/javase/tutorial/java/javaOO/constructors.html
 * */

public class Constructores {

	public static void main(String[] args) {

		subClase obj = new subClase();
		
		sinConstructor obj2 = new sinConstructor();

	}
	
	/*
	 * Los Constructores son un tipo de metodo especial, que llevan por nombre
	 * el mismo nombre que la clase y no tienen valor de retorno, se utilizan al
	 * inicializar las variables de un nuevo objeto con la palabra reservada new 
	 * */
	
	static class subClase {
		public subClase() {
			System.out.println("Yo soy un constructor");
		}
	}
	
	/*
	 * Es importante tener en cuenta que si no se define ningún constructor en una clase
	 * Java proporciona un constructor predeterminado sin argumentos que inicializa las
	 * variables de instancia a sus valores predeterminados. Sin embargo, si se define un
	 * constructor personalizado en una clase, el constructor predeterminado ya no está disponible 
	 * y debe proporcionarse explícitamente si se desea utilizar.
	 * 
	 * */

	// Ejemplo de clase sin constructor explicito
	static class sinConstructor {

	}
}
