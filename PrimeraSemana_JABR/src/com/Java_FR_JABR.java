package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Java_FR_JABR {

	public static void main(String[] args) {
		// Clase File y FileReader
		
		//Vamos a intentar realizar la lectura de un archivo
		//Para ello declaramos un String donde almacenar
		//lo que vamos a leer de el
		
		String linea;
		
		//Intentaremos realizar la comunicación con nuestro archivo
		//try & catch (intentar y atrapar una excepcion)
		
		try { //intenta ejecutar el siguiente bloque de codigo
			//Primero ubicamos nuestro archivo, gracias a la clase File
			File archivo = new File("C:\\Users\\jorge\\OneDrive\\Escritorio\\fichero.txt");
			//Abrimos el archivo en modo lectura gracias a FileReader
			FileReader fr = new FileReader(archivo);
			//Leemos la informacion del archivo con la clase BufferedReader
			BufferedReader buffer = new BufferedReader(fr);
			
			//Lo que se esta leyendo de mi archivo, se esta guardando o cargando
			//en el objeto buffer
			//Lo que estamos leyendo lo debo guardar en mi variable linea
			linea = buffer.readLine();
			//Una vez que se leyo y se guardo en la variable linea
			//lo puedo manipular, en este caso, mandar a imprimir en consola
			System.out.println(linea);
		} catch (Exception e) { //pero si existe un error atrapalo y ejecuta
			//lo siguiente
			//Si quiero visualizar la excepcion o error en consola
			//debo extraerla de donde se guardo (e)
			e.printStackTrace(); //este metodo nos imprime el posible error que
			//exista en consola
			System.out.println("No se puede leer/encontrar el archivo");
		}
		
		
		

	}

}
