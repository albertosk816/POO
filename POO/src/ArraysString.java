
public class ArraysString {
	public static void main(String[] args) {
		
		/*
		
		Ejemplo array de 5 valores mayores que 2 y menores que 50
		
		Array array1[]= new Array[5];
		
		for (int i = 0; i < array1.length; i++) {
			int num;
			
			num = (int) Math.round(Math.random()*48)+2;
			
			System.out.println(num);
		}
		*/
		
		//Array de string para pintar los elementos del array
		/*
		String nombres[] = new String[]{"Rafa", "Alberto"};
		
		for (int i = 0; i < nombres.length; i++) {
			System.out.println(nombres[i]);
		}
		
		*/
		
		/*
		 * Sacar un elemento aleatorio de mi cadena de arrays
		
		String nombres[]= new String[]{"Rafa", "Alberto"};
		
		int nombreAleatorio = (int) Math.round(Math.random()*nombres.length);
		
		String nombreElegido = nombres[nombreAleatorio];
		
		System.out.println(nombreElegido);
		
		*/
//		
//		
//		String nombres[]=new String[]{"Alberto Cuenca Luna", "Paco" , "Alba"};
//		
//		int longNombre = nombres[0].length();
//		
//		String primeraPosicion = nombres[0];
//		String segundaPosicion = nombres[1];
//		
//		
//		nombres[0] = segundaPosicion;
//		nombres[1] = primeraPosicion;
//		
//		
//		
//		System.out.println(Arrays.toString(nombres));
		/*
		Arrays.sort(nombres);
		
		System.out.println(Arrays.toString(nombres));
		
		*/
		//System.out.println(longNombre);
		
		/*int miPalabra = nombres[0].length;
		
		
		
		char[] caracteresNombre = new char[nombres[miPalabra].length()];
		

		for (int i = 0; i < caracteresNombre.length; i++) {
						
			System.out.print(" - ");
            caracteresNombre[i] = 'N';
		}

		*/
		
//		
//		int [] numeros = {1 , 2 , 3, 4};
//		
//		
//		 int originalPosition = 1;
//		 int newPosition = 3;
//		  int temp = numeros[originalPosition];
//		 
//		 numeros[originalPosition] = numeros[newPosition];
//
//		 numeros[newPosition] = temp;
//		 Arrays.sort(numeros);
//		 System.out.println(Arrays.toString(numeros));
//		
		
		
		
		
//		
//		String[] nombres = {"Alberto", "Paco"};
//		
//		char[] nombre = nombres[0].toCharArray();
//		
//		for (int i = 0; i < nombre.length; i++) {
//			System.out.println(nombre[i]);
//			if (nombre[i] == 'a') {
//				nombre[i] = 'B';
//			}
//		}
//		System.out.println(nombre);
//		

		
		String[] nombres = {"Alberto", "Paco"};
//		
//		for (int i = 0; i < nombres.length; i++) {
//			nombres[i] = nombres[i].toUpperCase();
//		}
//		
//		System.out.println(Arrays.toString(nombres));
//		
		char[] nombre = nombres[0].toCharArray();
		
		for (int i = 0; i < nombre.length; i++) {
			System.out.println(nombre[i]);
			
			if (nombre[i] == 't') {
				nombre[i] = Character.toUpperCase(nombre[i]);
			}
			if (nombre[i] == 'A') {
				nombre[i] = Character.toLowerCase(nombre[i]);
			}
		}
		
	}



}
