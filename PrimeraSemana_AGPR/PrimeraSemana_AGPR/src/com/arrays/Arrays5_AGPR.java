package com.arrays;

import java.util.Scanner;

public class Arrays5_AGPR {

	public static void main(String[] args) {
		//Crea dos arrays, uno para mostrar n productos y otro para mostrar sus
		//respectivos precios. Muestra en consola la lista de productos y sus precios.
		//Por lo menos 5 productos o artículos
		
		Scanner entrada =new Scanner (System.in);

		int productos;
		System.out.println("Ingres el numero de productos");
		productos=entrada.nextInt();
		entrada.nextLine();
		
		String[] nombresProductos = new String [productos];
		float[] precios= new float [productos];
		
		for (int i = 0; i < productos; i++) {
			System.out.println("Ingresa el nombre del producto "+i);
			nombresProductos[i]=entrada.nextLine();
			
			System.out.println("Ingresa el precio del producto "+i);
			precios[i]=entrada.nextFloat();
			entrada.nextLine();
						
			}
		for (int i = 0; i < productos; i++) {
			System.out.println("Producto: " + nombresProductos[i] + " - Precio: $" + precios[i]);
			}
        entrada.close();

		}

	}
			
		


