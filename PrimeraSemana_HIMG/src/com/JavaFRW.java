package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaFRW {

	public static void main(String[] args) {
		// Uso de las clases File, FileReader y BufferedReader.
		// Cada una nos sirve para una tarea especifica.
		// File - Identifica la ruta del archivo.
		// FileReader - Nos permite abrir el archivo en modo de lectura.
		// BufferedReader - Nos permite leer el contenido del archivo y acceder al mismo.
		
		// Declaramos un String donde podamos guardar la información.
		// que vamos a leer de un archivo de prueba.
		String linea;
		
		// Utilizar una estructura try & catch para intentar 
		// realizar la comunicación o lectura del archivo y asi poder 
		// controlar una excepción si surgiera.
		
		try { // Intenta ejecutar el siguiente bloque de codigo o intentar y atrapar una excepción.
			
//			// Clase File seria la representación del archivo en memoria.
//			File archivo = new File("C:\\Users\\hugot\\OneDrive\\Escritorio\\Fichero.txt");
//			
//			// Para poder leer el archivo hacremos uso de la clase FileReader.
//			FileReader fr = new FileReader(archivo);
//			
//			// Ahora si vamos a leer el contenido del archivo con BufferedReader. 
//			 BufferedReader buffer = new BufferedReader(fr);
//			
//			
//			// Ahora que ya podemos acceder al contenido y leerlo , lo voy 
//			// a guardar en mi String linea para poder mostrarlo finalmente en consola.
//			// linea = buffer.readLine();
//			
//			// System.out.println(linea);
//			 
//			// Si quiero leer mas lineas de texto voy a recurrir a un ciclo.
//				while ((linea = buffer.readLine()) != null) {
//					System.out.println(linea);
//				}
			
			// Escritura de archivos - FileWriter
			String nombre = "\nGeneración 157"; // \n - es introducir un salto de linea.
			
			File archivo = new File("C:\\Users\\hugot\\OneDrive\\Escritorio\\Fichero.txt");
			
			// Hacemos uso de la clase FileWriter para escribir la información del archivo.
			FileWriter line = new FileWriter(archivo, true); // Agrego el valor booleano true,
			// para respetar la información contenida en nuestro archivo originalmente.
			
			// Utilizamos el metodo .writerpara escribir en nuestro archivo el valor de Strin nombre.
			line.write(nombre);
			
			// Para confirmar la escritura utilizamos el metodo .close().
			line.close();
			
		} catch (Exception e) { // Si algo falla se controla la excepción y atrapa la excepción en la variable 'e'.
			System.out.println("No se encontro el archivo");
			e.printStackTrace();// Este metodo me permite ver la traza de error en consola
			// es decir ver la excepción que se atrapo aqui.
		}

	}

}
