package variables;

/* 
 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/variables.html
 * <Tipo> <Nombre>; esta es una declaración de variable <Tipo> 
 * <Nombre> = <Valor>; esta es una declaración de variable con asignación de valor
 * 
 * */

public class Declaracion {

	int propiedad = 0; //Esta variable es una propiedad de la clase porque no está declarada dentro de un bloque {}
	
	/* Las variables de clase son propiedades comunes entre los objetos, que pueden almacenar sus estados, es decir:
	 * 	+ Al instanciar un objeto se crea un nuevo espacio de memoria para almacenar el valor de esa propiedad
	 * 	+ Todos los objetos del tipo de clase, tienen una propiedad con el mismo nombre
	 * Para acceder a ellas es necesario instanciar el objeto con la palabra new, ejemplo:
	 *  Declaracion obj = new Declaracion; <- Primero se instancia el objeto
	 *  obj.propiedad; <- Luego se Accede a la propiedad
	 * */
	
	static int propiedad_compartida; // Esta es una propiedad compartida entre clases
	
	/* static se utiliza para declarar que una variable o un metodo es compartido entre clases
	 * 	+ Solo se puede declarar una propiedad o metodo static a nivel de clase y no entre bloques {}
	 * 	+ No es necesario inicalizar el valor
	 * 	+ Se puede modificar el valor de la propiedad
	 * 	+ Al usar static se crea un espacio único de memoria donde se almacena el valor, y este valor es compartido por el resto de instancias del objeto
	 * 	+ Al usar static, el metodo o la constante pueden ser accedidos sin necesidad de instanciar un objeto con la palabra new, ejemplo Declaracion.propiedad_compartida
	 * */
	
	final int propiedad_final = 1; // esta es una constante
	
	/* final se utiliza para declarar que una propiedad es constante
	 * 	+ Se puede declarar dentro de bloques {}
	 * 	+ Es necesario inicializar el valor al hacer la declaración
	 * 	+ No admite ser modificada
	 * 	+ No es compartida entre clases
	 * */
	
	static final int CONSTANTE_COMPARTIDA = 2;
	
	/* Al combinarse todo, obtenemos una propiedad constante compartida entre clases
	 * */

	public static void main(String[] args) {

		Declaracion obj = new Declaracion();
		
		int variable = 0; // Esta es una Variable Local
		
		propiedad_compartida = 0; // modificamos la propiedad compartida
		
		System.out.println("Esto es una variable: " + variable);
		System.out.println("Esto es una propiedad: " + obj.propiedad);
		System.out.println("Esto es una propiedad compartida: " + propiedad_compartida);
		System.out.println("Esto es una propiedad final: " + obj.propiedad_final);
		System.out.println("Esto es una propiedad compartida: " + CONSTANTE_COMPARTIDA);
	}

}
