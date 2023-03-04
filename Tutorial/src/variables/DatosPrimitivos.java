package variables;

public class DatosPrimitivos {

	public static void main(String[] args) {
		/*
		 * Tipos de datos Primitivos en Java
		 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
		 * */

		// Enteros
		int velocidadLuz = 299792; // Entero
		long añoLuz = velocidadLuz * 365 * 86400; // Entero Largo
		short diasLustro = 365 * 5; // Entero Corto
		byte diasMes = 31; //Byte

		System.out.println("velocidad de la Luz Entero: "+ velocidadLuz);
		System.out.println("velocidad de la Luz Long: "+ añoLuz);
		System.out.println("Hay "+ diasLustro + " días en 5 años");
		System.out.println("El mes tiene "+ diasMes + " días");
		
		/* asignar un numero de tipo Long es necesario colocar la letra L al final del numero si el numero 
		 * es superior al rango de un entero ejemplo
		 * */
		
		long longNumber;
		longNumber = 5999999999L; // Esto compila porque 5999999999 se sale del rango de los enteros, pero tiene el sufijo L
		// longNumber = 5999999999; // Esto no compila porque 5999999999 se sale del rango de los enteros
		
		System.out.println("Este número es un Long "+ longNumber );


		// Coma Flotante, Punto Flotante, Enteros
		// Nota: Por defaul JAva designa los números de punto flotante como double, por lo que
		// para poder asignar un numero de tipo 1.5 se debe agregar una f al final del número
		// de este modo se indica que dicho número debe ser tratado especificamente como float y no como double
		float presicionSimple = 1.5f;
		double presicionDoble = 1.5654654; // No es necesario la f
		System.out.println("Este es un float: "+ presicionSimple);
		System.out.println("Este es un double: "+ presicionDoble);

		// Lógico
		boolean booleano = true;
		System.out.println("Este es booleano: "+ booleano);

		// Caracter, los caracteres en Java son Unicode
		char letra = 'a'; // Tipo especial de entero
		System.out.println("Esta es una letra: "+ letra);
		
		// A los valores de tipo caracter se les puede aplicar operadores Aritmeticos
		System.out.println("Esta es otra Letra: "+ ++letra);
		System.out.println("Esta es otra Letra: "+ --letra);
			
		/*
		 * Char tambien puede imprimir almacenar los siguientes caracteres: 
		 * \b (backspace)
		 * \t (tab)
		 * \n (line feed)
		 * \f (form feed)
		 * \r (carriage return)
		 * \" (double quote)
		 * \' (single quote)
		 * \\ (backslash) 
		 * */
		
		letra = '\'';
		System.out.println("Esta es una comilla simple: "+ letra);
		
		// Los numeros representan el valor de una letra dentro del sistema Unicode 65,535 es máximo valor admitido
		System.out.println("Valor char minimo: "+(Character.MIN_VALUE+0));
		System.out.println("Valor char maximo: "+(Character.MAX_VALUE+0));
		
		letra = 97;
		System.out.println("Esta es la misma Letra: "+ letra);
	}

}
