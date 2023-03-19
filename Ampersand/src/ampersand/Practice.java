package ampersand;

import java.util.Random;
import java.util.Scanner;

public class Practice {
	
	private char[] operadoresPermitidos = {'+', '-', '*', '/'};
	private Random randomObj = new Random();
	
	public static void main(String[] args) {
		Practice obj = new Practice();
		Scanner scanner = new Scanner(System.in);

		int entrada = 0;
		int decena = obj.nonZeroRandom(10);
		int centena = obj.nonZeroRandom(100);

		obj.msgNuevaOperacion();
		char operador = scanner.next().charAt(0);
		int resultado = obj.operacion(operador, centena, decena);

		if (obj.opPermitido(operador)) {

			do {

				obj.imprimirOperacion(operador, centena, decena);
				entrada = scanner.nextInt();

				if (resultado != entrada) {
					obj.imprimirOperacionFallida(operador, centena, decena, resultado);
				}

				decena = obj.nonZeroRandom(10);
				centena = obj.nonZeroRandom(100);
				resultado = obj.operacion(operador, centena, decena);

			} while (entrada != -1);

		} else {
			System.out.println("Operador " + operador + " No soportado. ");
		}

		scanner.close();
	}

	public int nonZeroRandom(int radix) {
		int rnd = randomObj.nextInt(radix);
		while (rnd == 0) {
			rnd = randomObj.nextInt(radix);
		}
		return rnd;
	}
	
	public boolean opPermitido(char op) {
		for(char c : operadoresPermitidos) {
			if(c == op) {
				return true;
			}
		}
		return false;
	}

	public void imprimirOperacion(char op, int numA, int numB) {
		System.out.println(numA + " " + op + " " + numB + " =");
	}

	public void imprimirOperacionFallida(char op, int numA, int numB, int res) {
		System.err.print(" >>> Error: " + numA + " " + op + " " + numB + " = " + res + "\r\n");
	}

	public void msgNuevaOperacion() {
		System.out.println("Introduzca cualquiera de las siguiente operadores");
		System.out.println("Introduzca + para sumar");
		System.out.println("Introduzca - para restar");
		System.out.println("Introduzca * para multiplicar");
		System.out.println("Introduzca / para dividir");
	}

	public int operacion(char op, int numA, int numB) {
		int resultado = 0;
		if (op == '+') {
			resultado = numA + numB;
		} else if (op == '-') {
			resultado = numA - numB;
		} else if (op == '*') {
			resultado = numA * numB;
		} else {
			resultado = numA / numB;
		}
		return resultado;
	}
}
