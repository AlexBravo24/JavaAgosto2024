package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Java_FR_FIPS {

	public static void main(String[] args) {
		// Clase FILE y FileReader
		
		//Vamos a ntentar la lectura de un arcchivo para ello
		//declramos un String donde almacenar 
		//lo que vamos a leer de el 
		
		String linea; 
		
		//intentar realizar la comunicacion con nuestro archivo
		//try & catch (intentar y atrapar una excepcion)
		
		try { //intentar ejecutar el siguiente bloque de codigo
			File archivo = new File("C:\\Users\\iriam\\OneDrive\\Escritorio\\fichero.txt"); //Identificamos, primero identificamos nuestro archivo
			FileReader fr = new FileReader(archivo);
			//leemos la informacion del archivo con la clase BufferReader
			BufferedReader buffer = new BufferedReader(fr); 
			//lo que se esta leyendo en mi archivo se esta leyendo o cargando en mi objeto buffer
			//lo que estamos leyendo lo debo guardar en mi variable linea
			
			linea = buffer.readLine();
			//una vez que se leyo y se guardo en la variable linea 
			//lo puedo manipular en este caso, mandar e imprimir en consola
			
			System.out.println(linea);
			
		} catch(Exception e) { //pero si existe un error atrapalo y ejecuta
			//lo siguiente
			
			//Si quiero visualizar la excepcion o error atrapalo y ejeuta
			//debo extraer donde se guardo(e) 
			
			e.printStackTrace(); //este metodo nos imprime el posible error que exitse ne consola
			System.out.println("No se puede leer/encontrar el archivo");
		} //Si me manda el error

	}

}
