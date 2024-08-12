package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaFRW {

	public static void main(String[] args) {
		//Uso de las clases File, FileReader y BufferesReader
        //Cada una nos sirve para una tarea espec�fica
		//File identifica la ruta del archivo
		//FileReader nos permite abrir el archivoo en modo lectura
		//BufferedReader nos permite leer el contenido del archivo
		//y acceder al mismoo
		String linea;
		//Utilizar una estructura try & catch nos sirve para intentar
		//realizar la coomunicaci�on o lectura del archivoo y as� poder
		//controlar una excepci�n que surgiera.
		try//intentar ejecutar el siguiente bloque de c�digo
		{//clase File es la representaci�n del archivo en memoreia
//	     File archivo = new File("C:\\Users\\Usuario1\\Desktop\\fichero.txt");
//	     //Para poder leer el archivo hacemos uso de la clase FileReader
//	     FileReader fr=new FileReader(archivo);
//	     //Ahora si vamos a leer el archivo con BufferedReader
//	     BufferedReader buffer = new BufferedReader(fr);
//	     //Ahora que ya poodemoos acceder a contenidoo y leerloo, lo voy a guardar 
//	     //en mi String line para poder mostrarlo en consola.
//	     //linea=buffer.readLine();
//	     //Si quiero leer m�s l�neas de texto voy a recurrir al uso de un ciclo
//	     while((linea=buffer.readLine())!=null)
//	    	 System.out.println(linea);	 
	     //Ahora vamos a escribir en un archivo
		String nombre="\nGeneracion 165";
		File archivo = new File("C:\\Users\\Usuario1\\Desktop\\fichero.txt");
		//Hacemos uso de la clase FileWriter
		FileWriter line= new FileWriter(archivo, true);//Agrego el valor booleanoo true para respetar el contenido presente en �l
		//Utilizamos el m�todo .write para escribir en nuestro archivo el valor de
		//el String llamado nombre
		line.write(nombre);
		//Para coonfirmar la escritura usamos el m�todo .close
		line.close();
		}catch(Exception e) {//Si algoo falla se controla la excepci�n
			System.out.println("No se encontr� el archivo");

	        e.printStackTrace();//Este m�todo me permite ver la traza de error en
	                            //en consola, es decir la excepci�n que se atrap� aqu�
		}
	}

}
