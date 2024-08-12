//  Realiza un programa para determinar si un String es palíndromo
// palindromo son palabras que se pueden leer igual de izquierda a derecha
// y de derecha a izquierda 

package ciclos;
import java.lang.*;
import java.io.*;
import java.util.*;
import java.util.Scanner;



public class ciclos3_IRF {

	public static void main(String[] args) {
		
		System.out.println("Ingresa una palabra: ");
		
		// input string console 
		Scanner scan = new Scanner(System.in); 
		
		String inputString = scan.nextLine(); 
		
		// declare new string 
		StringBuilder stringReverse = new StringBuilder(); 
		
		// created new string 
		stringReverse.append(inputString);  
		System.out.println(stringReverse);
		
		// reverse String 
		stringReverse.reverse(); 
		System.out.println(stringReverse);
		
		
		
		if(inputString.equals(stringReverse.toString())) {
			System.out.println("Son palindromos");
		}
		else {
			System.out.println("No son palindromos");
		}
		

		

		

		

		

	}

}
