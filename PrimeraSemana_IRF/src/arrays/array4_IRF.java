package arrays;
import java.util.*;

public class array4_IRF {

	public static void main(String[] args) {
		
		Integer [] arrInt = {1,2,3}; 
		Integer [] arrIntCopy = new Integer[arrInt.length]; 
		
		for (int i = 0; i<arrInt.length; i++ ) {
			
			arrIntCopy[i] = arrInt[i]; 
		}
		
		// metodo reverse arr 
		Collections.reverse(Arrays.asList(arrIntCopy));
		

		for (int i = 0; i < arrInt.length; i++) {
			System.out.print(arrInt[i]);
			System.out.println(arrIntCopy[i]);
		}

		


	}

}
