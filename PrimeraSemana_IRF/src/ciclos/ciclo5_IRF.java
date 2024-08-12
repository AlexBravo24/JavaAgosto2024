/*
 Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2%
de interés mensual. ¿Cuál será la cantidad de dinero que esta persona
tendrá al cabo de un año si todo el dinero lo reinvierte?
 * 
 * */

package ciclos;

public class ciclo5_IRF {

	public static void main(String[] args) {
		
		String[] arrMeses = {"Enero", "febrero", "marzo", "abril","mayo", 
				"junio", "julio", "agosto", "septiembre", "octubre", "noviembre" , "diciembre"}; 
		
		int dineroInvertir = 1000; 
		int interesMensual = 2;    // 2% 
		int gananciaMensual  = 0; 
		int dineroAcumulado  = 0; 
		
		gananciaMensual = (dineroInvertir / 100) * (interesMensual); 
		
		
		for (int i = 1; i<=12; i++) {
			
			System.out.print(arrMeses[i - 1] + ":	");
			dineroAcumulado = gananciaMensual * i; 
			System.out.println(dineroAcumulado + dineroInvertir);
			
		}
		
		
		

	}

}
