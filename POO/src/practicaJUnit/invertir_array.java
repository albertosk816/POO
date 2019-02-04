package practicaJUnit;

public class invertir_array {

	
	public static void main(String[] args) {
		
		int array[] = {1,2,3,4,5,6,7,8,9};
		int aux = 0;
		

		int longitud=array.length;
		
		for (int i = 0; i < longitud; i++) {
			System.out.println(array[i] + "");
		}
		
		for (int i = 0; i <= longitud/2; i++) {

			
			aux = array[(longitud-1)-i];

			array[longitud-i-1] = array[i];
			
			array[i] = aux;
			
		}
	
	//comprobamos que se ha invertido el array
		System.out.println();
		
		for (int i = 0; i < longitud; i++) {
			System.out.println(array[i] + " ");
		}
	}
	
}

