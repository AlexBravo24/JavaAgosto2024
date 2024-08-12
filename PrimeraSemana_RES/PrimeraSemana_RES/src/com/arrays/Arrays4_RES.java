package com.arrays;

public class Arrays4_RES {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 int [] a = {1,2,3,4,5};
	 int [] b = new int[5];
	 for (int i=0;i<5; i++) {
		b[i]=a[4-i];
		}
	 System.out.println("El arreglo invertido es: ");
	 for (int i = 0; i <5; i++) {
		System.out.print("b["+i+"]: "+b[i]+" ");
	}

	}

}
