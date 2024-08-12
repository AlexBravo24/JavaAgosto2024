package com;
import java.util.HashMap;
import java.util.Map;

import com.logica.Cajero;
import com.modelo.Cuentas;

public class Principal {

	public static void main(String[] args) {
		// Vamos a crear nuestra base de datos
		
		//Declaramos nuestro HashMap
		Map<Integer, Cuentas> cuentas = new HashMap<Integer, Cuentas>();
		
		//Para agregar cuentas en nuestro HashMap podemos hacerlo de 2 formas:
		//1. Creando la cuenta y agreg�ndola despu�s
		
		Cuentas alex = new Cuentas("Alex", 13000, 4000, 50000, "D�bito");
		cuentas.put(1001, alex);
		
		//2. Creando las cuentas directamente en el HashMap
		cuentas.put(1002, new Cuentas("Berenice", 1000, 100, 15000, "D�bito"));
		cuentas.put(1003, new Cuentas("Humberto", 1000, 1000, 20000, "D�bito"));
		cuentas.put(1004, new Cuentas("Pablo", 500, 100, 10000, "D�bito"));
		
		//Si nos acordamos, para recuperar el valor de un objeto con mi HashMap
		System.out.println(cuentas.get(1003));
		
		//Crear mi nuevo Cajero
		Cajero angelopolis = new Cajero("Angel�polis", cuentas);
		
		//Probar el m�todo consultar (cuenta existente)
		System.out.println(angelopolis.consultar(1001));
		
		//Probar el m�todo consultar (cuenta INexistente)
		System.out.println(angelopolis.consultar(1006));
		
		//Probar el m�todo retirar
		System.out.println(angelopolis.retirar(1001, 9000));
		
		//Probar m�todo retirar pasando el m�nimo
		System.out.println(angelopolis.retirar(1001, 1000));

		//Retirar de una cuenta que no existe
		System.out.println(angelopolis.retirar(1006, 1000));
		
		//Depositar
		System.out.println(angelopolis.depositar(1001, 5000));
	}

}
