package com;

public class TiposDeDatos {// Apertura de la clase.

	public static void main(String[] args) {// Apertura del m�todo main.
		// El m�todo main es el m�todo que nos permite 
		// ejecutar nuestro programa o clase.
		
		// Con dos diagonales o barras - Comentarios de una l�nea.
		
		/* Comentarios
		 * de 
		 * multiples 
		 * lineas.
		 * 
		 */
		
		// CTRL + S para guardar los cambios en la clase.
		
		
		
		// Tipos de datos.
		// Tipos de datos primitivos - Numericos enteros.
		
		// Ejemplo de declaraci�n de una variable sin valor asignado.
		byte numero ;
		
		numero = 127; // Aqui hasta esta linea le estoy asignando valor a mi variable.
		
		// Ejemplo de declaraci�n de variables pero ya con los valores asignados desde el inicio.
		byte b = -128; // Solo admite valores de -128 a 127 - 1 byte de memoria consume.
		short s = 32767; // Solo admite valores de -32768 a 32767 - 2 bytes de memoria consume.
		int i = 2147483647; // Solo admite valores de -2147483648 a 2147483647 - 4 bytes cde memoria consume.
		long l = 2147483648L; // Las varriables de tipo long requieren un sufijo "L" o "l" - 8 bytes
		
		// La variable mas utilizada para manejar valores enteros es el de tipo int.
		
		// Tipos de datos primitivos. 
		// Numericos en punto o coma flotante.
		float f = 3.1416F; // 4 bytes - requieren del sufijo "F" o "f"
		double d = 3.1416123456; // 8 bytes
		
		// El tipo de dato mas utilizado para el manejo de decimales es el tipo de dato double.
		
		// Tipos de datos primitivos.
		// Booleanos.
		// Caracter.
		
		boolean evalua = true;
		boolean evalua2 = false;
		// El tipo de dato boolean son utilizados para evaluar expresiones o condiciones.
		
		char caracter = '$';
		// Las variables de tipo char solo admiten un caracter a la vez.
		
		// Tipos de datos estructurados (Tipos de dato Objeto)
		// Son clases y las vamos a identificar por que el nombre de estos tipos de datos inicia con mayuscula.
		
		
		// Tipos de dato wrapper o envoltorio.
		// Son clases que "envuelven" a los primitivos para poder otorgarles algunos metodos o comportamientos.
		Byte by = -128;
		Short sh = 32000;
		Integer in = 2000000;
		Long largo = 400000000L;
		
		Boolean boo = true;
		Character a = 'a';
		
		// Tipo de dato cadena de texto - String.
		// Nos permite almacenar una secuencia de caracteres.
		
		String nombre = "Hugo Iv�n";
		
		String numeros = "1000";
		
		// Dandole salida a nuetros datos en consola.
		System.out.println("Hola mundo");
		
		// Atajo para escribir impresiones de consola.
		// syso + CTRL + espacio
		// sout + CTRL + espacio
		System.out.println(nombre);
		
		// Ejemplo para suma de dos numeros.
		System.out.println(11+20);
		
		// Ejemplo declarar un valor x, y para realizar una operaci�n.
		int x = 11;
		int y = 20;
		
		System.out.println(x+y);
		
		// Conactenaci�n
		// La uni�n de texto y valores num�ricos.
		System.out.println("La suma es: " + (x+y));
		
	}// Cierre del m�todo main.
	
	
	
}// Cierre de la clase.














