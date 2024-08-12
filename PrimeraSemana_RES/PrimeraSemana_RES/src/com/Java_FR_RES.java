package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Java_FR_RES {

	public static void main(String[] args) {
		// Clase File y FileReader
        //Para ello declaramos un String en donde almacenar del archivo.
		String linea;
		//Intentaremos realiza la comunicación con nuestro archivo
		//try & catch (intentar y atrapar una excepción
		try//intenta ejecutar el siguiente bloque de código
		{
	     File archivo= new File("C:\\Users\\Usuario1\\Desktop\\ficheros.txt");
	     //abrimos el archivo en modo lectura gracias a FileReader
	     FileReader fr = new FileReader(archivo);
	     //Leemos la información del achivo con la clase BufferedReader
	     BufferedReader br = new BufferedReader(fr);
	     //Lo que se está leyendo de mi archivo se está guardando o cargando 
	     //en el objeto BufferedReader lo debo guardadr en la 
	     //variable línea, lo puedo manipular, en este caso mandar a imprimir 
	     //en consola
	     linea= br.readLine();
	     br.close();
	     System.out.println(linea);
	     }catch (Exception e) {//pero si existe un error, atrápalo
	    	//y ejecuta lo siguiente
	    	 e.printStackTrace();//este método nos despliega el posible error en consola 
	    	//System.out.println(e);
	    }
	    	
	    }
		

}
