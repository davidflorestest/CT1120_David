package arrays;

public class ArreglosEj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray [];
		int [] intArray2;
		
		short shortArray[];
		String array[];
		
		array = new String[5];
		
		array[0] = "Cero";
		array[1] = "Uno";
		array[2] = "Dos";
		array[3] = "Tres";
		array[4] = "Cuatro";
		
		System.out.println(array[3]);
		
		for(int i =0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
