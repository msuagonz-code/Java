package operadores;

/*
 * Operadores de Bits
 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op3.html
 * 
 * */

public class Bits {

	public static void main(String[] args) {
		
		/*
		 * Este tema es bastante profundo y para entenderlo, hay que dedicarle mucho más tiempo
		 * de modo que solo se presentarán, los operadores y como se usan sin desarrollar sus implicaciones
		 * y usos en los sitemas digitales, criptografía, redes, compresión de archivos y un sin fin de cosas.
		 * 
		 * No obstante se sugiera la lectura del siguiente artículo
		 * 
		 * https://es.wikipedia.org/wiki/Operador_a_nivel_de_bits
		 * 
		 * */
		
		 byte binario1 = 2, binario2 = 1;
		 String resultString = "";
		 System.out.println("Binario1 original: "+ Integer.toBinaryString(binario1) );
		 System.out.println("Binario2 original: "+ Integer.toBinaryString(binario2) );
		 
		 // Unary bitwise complement
		 resultString = Integer.toBinaryString(~binario1);
		 System.out.println("Unary bitwise complement: "+ resultString);

		 // Signed left shift
		 binario1 = 0b01010101;
		 resultString = Integer.toBinaryString(binario1 << 3);
		 System.out.println("Signed left shift: "+ resultString);
		 
		 // Signed right shift
		 binario1 = 0b01010101;
		 resultString = Integer.toBinaryString(binario1 >> 3);
		 System.out.println("Signed right shift: "+ resultString);
		 
		 // Unsigned right shift
		 resultString = Integer.toBinaryString(binario1 >>> 3);
		 System.out.println("Unsigned right shift: "+ resultString);
		 
		 // Bitwise AND
		 resultString = Integer.toBinaryString(binario1 & binario2);
		 System.out.println("Bitwise AND: "+ resultString);
		 
		 // Bitwise exclusive OR
		 resultString = Integer.toBinaryString(binario1 ^ ~binario2);
		 System.out.println("Bitwise exclusive OR: "+ resultString);
		 
		 // Bitwise inclusive OR
		 resultString = Integer.toBinaryString(~binario1 | binario2);
		 System.out.println("Bitwise inclusive OR: "+ resultString);
	}

}
