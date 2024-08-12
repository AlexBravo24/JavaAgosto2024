package com;

public class TiposDeDatos {
	
	public static void main(String[] args){
		
		
		System.out.println("Hola Mundo... "); 
		

		// CTRL + S para guardar los cambios en la clase
		// TIPOS DE DATOS PRIMITIVOS - NUMERICOS 
		// declaracion de una variable sin valor asignado 
		
		byte numUno;  // almacena numeros desde -128 a 127 
		short s = 32767; // 2 bytes -32768 a 32767
		int i = 2147483647;  // 4 bytes -2147483648 a 2147483647
		long l = 2147483648l; // 8 bytes 
		
		// en java declarar un long, usa el sufijo l o L 
		
		// TIPOS DE DATPS WRAPPER O ENVOLTORIO
		// con clases que "envuelven a los primitivos"
		// para poder otorgarles metodos o comportamientos
		Byte a = 0; 
		Short na = 0; 
		Integer in = 100; 
		Long large = 45454l; 
		Boolean boo = true; 
		
		// tipo de dato cadena de texto - String 
		String name = "Irving Rojano Fernandez"; 
		
		// atajo para print  sout + CTRL + espace 
		System.out.println(name);

		
	}

}
