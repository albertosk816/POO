package arrays;

import java.lang.reflect.Array;

public class Ejercicio01 {  
	public static void main(String[] args) {
//		1º.- Crea un método que reciba un array de números enteros creados al azar entre 0 y 100. 
//		El método debe examinar la longitud del array, comprobar que la longitud es un valor impar 
//		y devolver el valor que se encuentre en la posición media. En caso de que la longitud del 
//		array sea un número par no se debe devolver un valor -1.
		
		
		int array[] = devuelveArray();
		
		imprimirArray(array);
		
		


	}
		private static int[] devuelveArray(){
		
			int array[] = new int[5];
			
			int valorMedio = 0;
			
			for (int i = 0; i < array.length; i++) {
				array[i] = (int)Math.round(Math.random()*100);
			}
            
			if(array.length%2 != 0) {
				valorMedio = array[array.length/2];
			}
			
			System.out.println("El valor de la posicion central es: " + valorMedio);
			return array;
		}
		
		private static void imprimirArray(int array[]) {
			for (int i = 0; i < array.length; i++) {
				System.out.println(array[i]);
			}
		}


}
