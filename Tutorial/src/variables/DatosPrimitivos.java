package variables;

/*
 * Tipos de datos Primitivos en Java
 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
 * */

public class DatosPrimitivos {

	public static void main(String[] args) {

		/* 
		 * Enteros
		 * 
		 * */
		int velocidadLuz = 299792; // Entero
		long añoLuz = velocidadLuz * 365 * 86400; // Entero Largo
		short diasLustro = 365 * 5; // Entero Corto
		byte diasMes = 31; //Byte

		System.out.println("velocidad de la Luz Entero: "+ velocidadLuz);
		System.out.println("velocidad de la Luz Long: "+ añoLuz);
		System.out.println("Hay "+ diasLustro + " días en 5 años");
		System.out.println("El mes tiene: "+ diasMes + " días");
		
		/* 
		 * literales Enteros
		 * 
		 * Las variables de tipo int además de recibir valores enteros, pueden recibir valores en binario y en hexadecimal
		 * + Para indicar al compilador que un valor es de tipo Binario, se debe indicar con el prefijo 0b
		 * + Para indicar al compilador que un valor es de tipo hexadecimal, se debe indicar con el prefijo 0x 
		 * */
		diasMes = 0b000011111; // Literal binario
		
		System.out.println("El mes tiene: "+ diasMes +" días 0b");
		
		diasMes = 0x1f; // Literal hexadecimal
		System.out.println("El mes tiene: "+ diasMes +" días 0x");

		
		/* Para asignar un numero de tipo Long es necesario colocar la letra L al final del numero si el numero 
		 * es superior al rango de un entero ejemplo
		 * */
		long longNumber;
		longNumber = 5999999999L; // Esto compila porque 5999999999 se sale del rango de los enteros, pero tiene el sufijo L
		// longNumber = 5999999999; // Esto no compila porque 5999999999 se sale del rango de los enteros
		
		System.out.println("Este número es un Long "+ longNumber );

		/* 
		 * Coma Flotante, Punto Flotante
		 * 
		 * Nota: Por defaul Java designa los números de punto flotante como double y tienen el literal d o D por default, 
		 * debido a esto por convención este literal se omite.
		 * 
		 * Para poder asignar un numero de tipo float se debe agregar una f o F al final del número de este modo se indica
		 * que dicho número debe ser tratado especificamente como float y no como double.
		 * 
		 * */
		
		// float presicionSimple = 1.5;
		// Esta línea da error porque se trata de asignar un numero con literal tipo d a un tipo float
		// Esta linea equivale a esto 
		// float presicionSimple = 1.5d; 

		float presicionSimpleLiteral = 1.5f;
		double presicionDoble = 1.5654654d; // No es necesario la f o la d, pero se puede usar la d
		double presicionDobleLiteral = 1.5654654f; // tambien se puede usar la f sin problema
		
		System.out.println("Este es un float: "+ presicionSimpleLiteral);
		System.out.println("Este es un double: "+ presicionDoble);
		System.out.println("Este es un double con literal: "+ presicionDobleLiteral);

		/* 
		 * Booleanos
		 * 
		 * */
		boolean booleano = true;
		System.out.println("Este es booleano: "+ booleano);

		/* 
		 * Caracter
		 * 
		 * Java usa la codificación Unicode, para asignar un caracter al tipo char es necesario usar comillas simples
		 * '', a menos que se asigne un numero entero, cuando se asigna un numero entero a un char, el numero representa
		 * la posición de la letra dentro del sistema Unicode, no representa un número
		 * 
		 * */
		char letra = 'a'; // Tipo especial de entero
		System.out.println("Esta es una letra: "+ letra);
		
		// Char admite el código del caracter unicode 
		letra ='\u0061';
		System.out.println("Esta es la misma Letra en Unicode: "+ letra);
		
		// Los numeros representan el valor de una letra dentro del sistema Unicode 65,535 es máximo valor admitido
		letra = 97;
		System.out.println("Esta es la misma Letra: "+ letra);
		System.out.println("Valor char minimo: "+(Character.MIN_VALUE+0));
		System.out.println("Valor char maximo: "+(Character.MAX_VALUE+0));
		
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
		
		/*
		 * Curiosidad:
		 * Se puede usar el caracter _ entre numeros para agrupar cifras de forma visual ejemplo:
		 * 12_34 es equivalente a 1234 existen restricciones para esto, no se puede usar _ en los siguientes casos
		 * 	+ Al principio o al final de una cifra ej: _1234; o 1234_;
		 * 	+ Adyacente a un punto decimal ej: 3_.1416;  o 3._1416;
		 * 	+ Antes de un literal F o L
		 * 	+ En posición en la que una cadena de de digitos es esperada ej: 
		 * 		+ 0b_ o 0_b para binarios
		 * 		+ 0x_ o 0_x para hexadecimales
		 * 
		 * No debe usarse, pero si quieres puedes hacerlo, nada se pierde por saber estas cosas no? ;)
		 * 
		 * */
	}

}
