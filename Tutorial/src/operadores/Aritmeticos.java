package operadores;

/*
 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html
 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op1.html
 * 
 * */

public class Aritmeticos {

	public static void main(String[] args) {

		/* Operador de Asignacion simple =
		 * 	se asignan los valores del lado derecho de simbolo igual, al lado izquierdo
		 * */
		
		 int entero1 = 10; //Se asigna el valor 2 a la variable entero
		 System.out.println("entero1 vale: "+ entero1);
		 
		 /*
		  * Operadores Aritmeticcos
		  * Son:
		  * 	Suma: +
		  * 	Resta: -
		  * 	Multiplicación: *
		  * 	Division: /
		  * 	Residuo: % este operador devuelve el residuo de una división
		  *   
		  *   El simbolo se suma (+) puede ser usado para concatenar Strings
		  * */
		 System.out.println("/**********************"
					 		+ "Operadores Aritmeticos"
					 		+ "*********************/");
		 // Suma
		 int entero2 = 3;
		 int resultado = entero1 + entero2;
		 System.out.println(entero1 + " + " + entero2 +" = "+ resultado);
		 
		 // Resta
		 resultado = entero1 - entero2;
		 System.out.println(entero1 + " - " + entero2 +" = "+ resultado);
		 
		 // Multiplicacion
		 resultado = entero1 * entero2;
		 System.out.println(entero1 + " * " + entero2 +" = "+ resultado);
		 
		 // Division
		 resultado = entero1 / entero2;
		 System.out.println(entero1 + " / " + entero2 +" = "+ resultado);
		 
		 // Residuo
		 resultado = entero1 % entero2;
		 System.out.println(entero1 + " % " + entero2 +" = "+ resultado);
		 
		 /*
		  * Asignación combinada
		  * Sepuede combinar los operadores aritmeticos con el operador de asignación de la siguiente manera
		  * 	<Operador>=
		  * 
		  * */
		 System.out.println("/**********************"
					 		+ "Asignación combinada"
					 		+ "*********************/");

		 // Suma
		 resultado = 100;
		 resultado += entero1;
		 System.out.println(resultado +" += "+ entero1 +" = "+ resultado);
		 
		 // Resta
		 resultado -= entero1;
		 System.out.println(resultado +" -= "+ entero1 +" = "+ resultado);
		 
		 // Multiplicacion
		 resultado *= entero1;
		 System.out.println(resultado +" *= "+ entero1 +" = "+ resultado);
		 
		 // Division
		 resultado /= entero1;
		 System.out.println(resultado +" /= "+ entero1 +" = "+ resultado);
		 
		 // Residuo
		 resultado %= entero1;
		 System.out.println(resultado +" %= "+ entero1 +" = "+ resultado);
		 
		 /*
		  * Operadores Unarios
		  * Positivo: + indica que un numero es positivo
		  * Negativo: - indica que un numero es negativo
		  * Incremento: ++ Incrementa el valor de un numero en 1 evitando la expresión x += 1 o x = x + 1
		  * Decremento: -- Disminuye el valor de un el numero en 1 evitando la expresión x -= 1 o x = x - 1
		  * Negación: ! Invierte el valor de un valor o una expresión booleana !true = false
		  * 
		  * Los operadores de incremento y decremento, pueden usarse de dos formas, en forma de prefijos o en forma de sufijos al operadon ejemplo
		  * i++ o ++i
		  * En ambos casos, el resultado es que la variable i va a ser incrementada en 1, la diferencia es que:
		  * 	+ Con ++i, primero se incrementa la variable y luego se evalua el resuldato
		  * 	+ Con i++, primero se evalua el valor de la variable i luego se procede a incrementar su valor
		  * Esto puede ser interesante o de cuidado en expresiones complejas o en bucles
		  * */
		 
		 // Positivo
		 int i = +2;
		 System.out.println("Positivo: "+ i);
		 
		 // Negativo
		 i = -2;
		 System.out.println("Positivo: "+ i);
		 
		 int[] nuevoArray = {1,2,3,4,5,6,7,8,9};
		 
		 // Incremento Sufijo
		 i = 0;
		 System.out.println("Posicion con i++: "+ nuevoArray[i++]);

		 // Incremento Prefijo
		 i = 0;
		 System.out.println("Posicion con ++i: "+ nuevoArray[++i]);
		 
		 // Negación
		 boolean negacion = true;
		 System.out.println("!negacion = "+ !negacion);
		 
	}

}
