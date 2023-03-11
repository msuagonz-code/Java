package operadores;

/*
 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op2.html
 * 
 * */
public class Relacionales {

	public static void main(String[] args) {
		
		/*
		 * Operadores Relacionales
		 * 	+ Operador de Igualdad: == Diferente del operador de asignación "="
		 * 	+ Operador de Diferencia: != 
		 * 	+ Operador Mayor que: >
		 * 	+ Operador Mayor o Igual que: <
		 *  + Operador Menor que: >=
		 *  + Operador Menor o Igual que: <=
		 * El resultado de estas operaciones en un valor booleano true o false
		 * */
		
		// Operador de igualdad
		int numero1 = 5, numero2 = 1;
		boolean resultado = numero1 == numero2;
		System.out.println(numero1 +" == "+ numero2 +" = "+ resultado);

		// Operador de Diferencia
		resultado = numero1 != numero2;
		System.out.println(numero1 +" != "+ numero2 +" = "+ resultado);
		
		// Operador Mayor que
		resultado = numero1 > numero2;
		System.out.println(numero1 +" > "+ numero2 +" = "+ resultado);
		
		// Operador Mayor o Igual que
		resultado = numero1 >= numero2;
		System.out.println(numero1 +" >= "+ numero2 +" = "+ resultado);
		
		// Operador Menor que
		resultado = numero1 < numero2;
		System.out.println(numero1 +" < "+ numero2 +" = "+ resultado);
		
		// Operador Menor o Igual que
		resultado = numero1 <= numero2;
		System.out.println(numero1 +" <= "+ numero2 +" = "+ resultado);
		
		/*
		 * Operadores Condicionales
		 * 	+ Conectivo lógico y: &&
		 *  + Conectivo lógico o: ||
		 *  + Condicional Ternacio: <Condicion>?<Resultado verdadero>:<Resultado Falso>
		 *  
		 * Para que el resultado de una operación && sea true, ambos valores deben ser true, ej:
		 * true && true
		 * 
		 * Para que el resultado de una operación || sea true, solo uno de los valores debe ser true, ej:
		 * true || true
		 * 
		 * El operador ternacio evalua la condicion antes del simbolo de interrogación, en caso de ser verdadera
		 * la condición, se ejecuta el codigo que esta e entre los simbolos ? y :
		 * en caso de ser falsa la condición se ejecuta el codigo que está entre los simbolos : y ; 
		 * 
		 * */
		
		boolean valor1 = false, valor2 = true;
		boolean resultadoBooleano = valor1 && valor2;
		
		System.out.println(valor1 +" && "+ valor2 +" = "+ resultadoBooleano);
		
		resultadoBooleano = valor1 || valor2;
		System.out.println(valor1 +" || "+ valor2 +" = "+ resultadoBooleano);
		
		String resultadoString = valor1 || valor2 ? "Esto es verdadero" : "Esto es falso";
		System.out.println(resultadoString);
		
		/*
		 * Comparacion de tipo instanceof
		 * Se usa para saber si un objeto es instancia de una clase 
		 * 
		 * */
		
		Relacionales rel = new Relacionales();
		System.out.println(rel instanceof Relacionales);
	}

}
