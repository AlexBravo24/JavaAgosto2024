package Condicionales;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Condicionales4_RES {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena="";
		Scanner lectura= new Scanner(System.in);
		Pattern pat = Pattern.compile("[ABCDEFGHIJKLMNÑOPQRSTUVWXYZ]");
		System.out.println("Programa que analiza si una cadena de texto tiene una letra mayúscula");
		System.out.println("Escribe la cadena a analizar:");
		cadena=lectura.nextLine();
		Matcher mat = pat.matcher(cadena);
		lectura.close();
        if(mat.find())
          System.out.println("¡La cadena: "+cadena+" tiene al menos una letra mayúscula");	
        else
        	System.out.println("¡La cadena "+cadena+" no tiene letras mayúsculas!");
          	
	}

}
