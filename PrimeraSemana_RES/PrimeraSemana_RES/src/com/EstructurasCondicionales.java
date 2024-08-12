package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Estructuras condicionales o de desici�n
		//If-Eval�an valores booleanos
		int x=10;
		if(x<10)//si esto es verdad
		  {	
		   System.out.println("Si");	
		  }
		else //De otro modo ejecuta lo siguiente
		    {
			 System.out.println("No");
		    }
		// OPERADORES L�GICOS
		// AND, OR, NOT, DIFERENTE DE, IGUALDAD
		
		//Condiciones compuestas
		//AND - && -Devuelce true cuando se cumplen 
		//todas las condiciones.
		System.out.println("Resultado del operador l�gico AND / &&");
		if( x<=10 && x>8 && x==9)
		  System.out.println("Si");
		else
			System.out.println("No");
	    //El operador OR o || devuelve el valor de true cuando se cumplen 
	    //una de las condiciones
		System.out.println("Resultado del operador l�gico Or / ||");
	    if( x<10 || x>0 || x==9 )
	      {
	       System.out.println("Si");	
	      }
	    else
	        {
	    	 System.out.println("No");
	        }
        //Operador l�gico DIFERENTE  DE / != compara los valores true
	    //Si estos valores son diferentes
	    System.out.println("Resultado del operador l�gico !=");
	    if(x!=20)
	      {
	       System.out.println("Si");	
	       }
	    else
	        {
	    	 System.out.println("No");
	        }
	    //Resultado de la comparaci�n IGUAL / ==
	    //Devuelve true en caso que los valores a comparar sean iguales
	    System.out.println("Resultado de la operaci�n l�gica IGUALDAD / ==");
	    if(x==10)
	      {
	       System.out.println("Si");	
	      }
	    else
	        {
	    	 System.out.println("No");
	        }
	    //El operador l�gico NOT / ! cambia el valor l�gico de una expresi�n a su opuesto.
	    System.out.println("Resultado de la operaci�n l�gica NEGACI�N / !");
	    if(!(x==10))
	      {
	       System.out.println("Si");	
	      }
	    else
	        {
	    	 System.out.println("No");
	        }
	    //ifs anidados
	    System.out.println("Estructura IF-ELSE anidado");
	    int dia=10;
//	    if(dia==1)
//	    {	
//	     System.out.println("Lunes");	
//	    }
//	    else
//	        {
//	    	 if(dia==2)
//	    	   {
//	    	    System.out.println("Martes");	 
//	    	    }
//	    	 else
//	    	     {
//	    		  if(dia==3)
//	    		    {
//	    			 System.out.println("Mi�rcoles"); 
//	    		    }
//	    		  else
//	    		      {
//	    			   if(dia==4)
//	    			     {
//	    				  System.out.println("Jueves"); 
//	    			     }
//	    			   else
//	    			       {
//	    				    if(dia==5)
//	    				      {
//	    				       System.out.println("Viernes");	
//	    				      }
//	    				    else
//	    				        {
//	    				    	 if(dia==6)
//	    				    	   {
//	    				    	    System.out.println("S�bado");	 
//	    				    	   }
//	    				    	 else
//	    				    	     {
//	    				    		  if(dia==7)
//	    				    		    {
//	    				    			 System.out.println("Domingo"); 
//	    				    		    }
//	    				    		  else
//	    				    		      {
//	    				    			   System.out.println("Error de d�a");
//	    				    		      }
//	    				    	     }
//	    				        }
//	    			       }
//	    		      }
//	    	     }
//	        }
//	    //Estructura de desici�n switch case
	    System.out.println("Resultado de la ejecuci�n con estructura de desici�n SWITCH-CASE");
	    switch(dia)
	          {
	           case 1:System.out.println("Lunes");
	                  break;
	           case 2:System.out.println("Martes");
	                  break;
	           case 3:System.out.println("Mi�rcoles");
	                  break;
	           case 4:System.out.println("Jueves");
	                  break;
	           case 5:System.out.println("Viernes");
	           		  break;
	           case 6:System.out.println("S�bado");
                      break;
	           case 7:System.out.println("Domingo");
	                  break;
	          default:System.out.println("Error de d�a");
	                  break;
	          }
	}
} 
