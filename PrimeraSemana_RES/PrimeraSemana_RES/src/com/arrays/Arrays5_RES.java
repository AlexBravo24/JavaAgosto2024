package com.arrays;

public class Arrays5_RES {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String [] productos = {"l pan"," la leche","l kilo  de tortillas","l kilo de aguacate","l kilo de naranjas"};
        float [] precios = {6,22,22,60,40};
        for (int i = 0; i < precios.length; i++) {
        	System.out.println("El precio de"+productos[i]+" es: "+precios[i]);
			
		}
	}

}
