package ciclos;

import java.util.Scanner;

public class Ciclos3_1FIPS {

	public static void main(String[] args) {
		// Realiza un programa para determinar si un String es palíndromo
		
//		PALINDROMO: Palabra o frase cuyas letras están dispuestas de tal manera que resulta la misma
//		leída de izquierda a derecha que de derecha a izquierda; por ejemplo, anilina; dábale arroz a la zorra el abad.
	
		//Podemos ingresar los String por teclado
		//para ello podemos utilizar uno que se introduzca como
		//riginal y otro que se "arme"
		
		String original;
		String reversa = ""; 
		
		//Declaro mi scanner para poder ingresar y asignar los datos
		Scanner entrada = new Scanner (System.in); 
		
		System.out.println("Ingresa una palabra o frase");
		original = entrada.nextLine();
		
		//Procedo a interar al reves para armar mi String en reversa
		
		for (int i = original.length()-1; i >=0; i--) {
			reversa = reversa + original.charAt(i);
		}
		
		System.out.println("Original " + original.replace (" ", ""));
		System.out.println("Reversa " + reversa.replace (" ", ""));
		
		//Validamos 
		if (original.replace(" ", "").equalsIgnoreCase (reversa.replace (" ",""))) {
			System.out.println("La palabra/Frase ingresa es un palindromo");
		}else {
			System.out.println("La palabra/frase ingresada no es un palíndromo"); 
		}

	}

}