package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaFRW {

	public static void main(String[] args) {
		// Uso de las clases File, FileReader y BufferedReader
		//Cada una nos sirve para una tarea específica
		//File-identifica la ruta del archivo
		//FileReader nos permite abrir el archivo en modo lectura
		//BufferedReader nos permite leer el contenido del archivo y acceder al mismo
		
		//Declaramos un String donde podamos guardar la información a leer de un archivo de prueba
		
		String linea;
		
		//Utilizar una estructura try & catch para intenta
		//realizar la comunicacion o lectura del archivo y asi poder
		//controlar una excepcion si esta surgiera
		
		try {//intentar ejecutar el siguiente bloque de codigo
			File archivo = new File("C:\\Users\\Luis\\Desktop\\Fichero.txt"); //file se encuentra en otro paquete (java.io)
			
			//Para poder leer el archivo hacemos uso de la clase FileReader
			FileReader fr = new FileReader(archivo);//prepara para el modo lectura
			
			//Ahora si vamos a leer el contenido del archivo con BUfferedReader
			BufferedReader buffer = new BufferedReader(fr);
			
			//Ahora que ya podemos acceder al contenido y leerlo, lo voy a guardar
			//en mi String linea para poder mostrarlo en consola
			//linea=buffer.readLine();
			
			//si quiero leer mas lineas de texto, voy a recurrir a un ciclo while
			while ((linea=buffer.readLine())!=null) {
				System.out.println(linea);
			}
			
			//Escritura de archivos
			String nombre = "\nGeneracion";
			
			File dato = new File("C:\\Users\\Luis\\Desktop\\Fichero.txt"); 
			
			//Hacemos uso de la clase FileWriter para escribir informacion en el archivo
			FileWriter line= new FileWriter(dato, true);
			
			//Utilizamos el método .write para escribir en nuestro archivo el valor del
			//String nombre		
			line.write(nombre);
			
			//para guardar la informacion debemos cerrar con .close()
			line.close();

						
			
		} catch (Exception e) {//Si algo falla, se controla la excepcion
			// TODO: handle exception 
			System.out.println("No se encontro el archivo");
			
			//paa imprimir la excepcion que se guardo en el objeto e
			e.printStackTrace();
		}
		

	}

}
