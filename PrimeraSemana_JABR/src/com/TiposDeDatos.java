package com;

public class TiposDeDatos { //Apertura de clase
	
	public static void main(String[] args) { //Apertura del main
	
		//El método main es el método que nos permite
		//ejecutar nuestro programa o clase
		
		//Con dos diagonales o barras - comentario de una linea
		
		/*Comentarios
		 * de
		 * multiples
		 * lineas
		 * 
		 * 
		 */
		
		//CTRL + S para guardar los cambios en la clase
		
		//TIPOS DE DATOS
		//TIPOS DE DATOS PRIMITIVOS - NUMÉRICOS ENTEROS
		
		//Ejemplo de declaración de una variable sin valor asignado
		byte numero;
		
		numero = 127; // aqui hasta esta linea le estoy asignando valor
		// a mi variable
		
		//Ejemplo de declaración de variables, pero ya con los valores
		//asignados desde un inicio
		byte b = -128; //byte solo admite valores de -128 a 127 - 1 byte
		short s = 32767; //2 bytes  - -32768 a 32767
		int i = 2147483647; //4 bytes - -2147483648 a 2147483647
		long l = 2147483648L; //8 bytes - las variables de tipo long requieren
		//un sufijo "L", o "l"
		
		//La variable más utilizada para manejar valores enteros
		//es el tipo de dato int
		
		//TIPOS DE DATOS PRIMITIVOS
		//NUMÉRICOS EN PUNTO O COMA FLOTANTE (DECIMALES)
		float f = 3.1416123456F; //4 bytes - requieren del sufijo "F" o "f"
		double d = 3.1416123456121435454656; //8 bytes
		
		//El tipo de dato más utilizado para manejo de decimales es el double
		
		//TIPOS DE DATOS PRIMITIVOS
		//Booleanos
		//Caracter
		
		boolean evalua = true;
		boolean evalua2 = false;
		//Las variables de tipo boolean son utiles para evaluar expresiones
		//o condiciones
		
		char caracter = '$';
		//Las variables de tipo char solo admiten un caracter a la vez
		
		
		//TIPOS DE DATO ESTRUCTURADOS (TIPOS DE DATO OBJETO)
		//Son clases y las vamos a identificar porque el nombre de estos
		//tipos de dato inicia con mayúscula
		
		//TIPOS DE DATO WRAPPER O ENVOLTORIO
		//Son clases que "envuelven" a los primitivos para poder otorgarles
		//algunos métodos o comportamientos
		
		 Byte by = -128;
		 Short sh = 32000;
		 Integer in = 2000000;
		 Long largo = 400000000L;
		 
		 Boolean boo = true;
		 Character a = 'a';
		 
		 //Tipo de dato cadena de texto - String
		 //Nos permite almacenar una secuencia de caracteres
		 
		 String nombre = "Jorge Alejandro";
		 
		 String numeros = "1000";
		 
		 
		 //Dándole salida a nuestros datos en consola
		 System.out.println("Hola mundo");
		 
		 //Atajo para escribir impresiones de consola
		 //syso + ctrl + espacio
		 //sout + ctrl + espacio
		System.out.println(nombre);
		
		//Ejemplo de una suma de 2 números
		System.out.println(11+20);
		
		//Ejemplo declarar un valor x, y para realizar una operacion
		int x = 11;
		int y = 20;
		
		System.out.println(x+y);
		
		//Concatenación
		//La unión de cadenas de texto y valores numéricos
		
		System.out.println("La suma es: " + (x+y));
		
		
		
		
		
		
		
		
		
	} //Cierre del método main

} //Cierre de la clase
