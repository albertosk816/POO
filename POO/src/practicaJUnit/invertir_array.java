package practicaJUnit;

public class invertir_array {
	
	public invertir_array() {
	
	}
	
	public static void main(String[] args) {
	/*Declaramos array a invertir y la variable que nos va a servir para intercambiar
	 * los valores del array
	 */
		
		int array[] = {1,2,3,4,5,6,7,8,9};
		int aux = 0;
		
		//imprimimos array para comrobar
		int longitud=array.length;
		
		for (int i = 0; i < longitud; i++) {
			System.out.println(array[i] + "");
			//invertimos array recorriendo hasta la mitad intercambiando valores
		}
		
		for (int i = 0; i <= longitud/2; i++) {
			//vamos guardando la posicion que vamos a intencambiar desde el final
			
			aux = array[longitud-i];
			
			/*como ya tenemos guardada la poscion longitud -i-1, ya podemos guardar
			 * en esa poscion un valor
			 */
			
			array[longitud-i-1] = array[i];
			
			//guardamos en las posiciones iniciales el valor de aux que ya estaba guardado
			array[i] = aux;
			
		}
	
	//comprobamos que se ha invertido el array
		System.out.println();
		
		for (int i = 0; i < longitud; i++) {
			System.out.println(array[i] + " ");
		}
	}
	
}

