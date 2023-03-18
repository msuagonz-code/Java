package controlFlow;

/*
 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html
 * */

public class Switch {

	public static void main(String[] args) {
		/*
		 * Switch Es una estructura de control, parecida al if donde se compara un valor
		 * de entrada con un caso especifico, al dar positivo se ejecuta el bloque de
		 * codigo correspondiente
		 * 
		 * switch(valorEntrada){
		 * 
		 * 		case valor: 
		 * 			Sentencia;
		 * 				break;
		 * 		case valor:
		 * 			Sentencia;
		 * 				break;
		 * 		case valor:
		 * 			Sentencia;
		 * 				break;
		 * 		default: 
		 * 			Sentencia;
		 * 				break;
		 * }
		 * 
		 * Switch es el equivalente a la estructura if...else if...else, que aporta
		 * multiples decisiones, el caso default se ejecuta en caso de que el resto de
		 * los casos sean falsos, es decir, se comporta igual que un else, la diferencia entre ambas
		 * es que Switch solo compara 1 unico valor
		 * 
		 * La estrutura switch puede ser usado con los datos de tipos primitivos con los
		 * tipos de datos enumerados y las clases que envuelven a los tipos de datos primitivos 
		 */

		int valorEntrada = 5;
		switch (valorEntrada) {

		case 1:
			System.out.println("Yo no me ejecuto");
			break;
		case 5:
			System.out.println("valorEntrada coincide con el caso 5");
			break;
		case 10:
			System.out.println("Yo no me ejecuto");
			break;
		default:
			System.out.println("Yo me ejecuto si valorEntrada es diferente a los casos");
			break;
		}
		
		/*
		 * break no es necesario en la sentencia switch, pero si se omite se ejecutarán todos los casos despues
		 * posteriores al caso positivo ej:
		 * 
		 * */

		switch (valorEntrada) {

		case 1:
			System.out.println("Yo no me ejecuto :(");
			
		case 5:
			System.out.println("Yo me ejecuto!");
			
		case 10:
			System.out.println("Yo tambien me ejecuto!");

		default:
			System.out.println("Yo tambien me ejecuto :)");

		}
		
		/* 
		 * además no pueden haber 2 casos iguales o se produce el siguiente error
		 * 
		 * Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
		 * 		Duplicate case
		 * 
		 * */
		
	}

}
