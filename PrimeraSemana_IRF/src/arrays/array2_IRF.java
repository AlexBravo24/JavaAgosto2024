package arrays;

public class array2_IRF {

	public static void main(String[] args) {
		System.out.println("suma y media");
		
		int arrSize = 100; 
		int[] arrInt = new int[arrSize]; 
		int sumaArr = 0; 
		int media = 0; 
		
		for (int i = 0; i < arrSize;i++) {
			
			arrInt[i] = i + 1;  
			sumaArr += arrInt[i]; 
			System.out.print(arrInt[i] + " ");
		}
		
		System.out.println();
		media = sumaArr / arrInt.length; 
		System.out.println("suma de todos los elementos del array: " + sumaArr);
		System.out.println("media de los elementos del array: " + media);

	}

}
