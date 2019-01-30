package practicaJUnit;


public class menormayor_primo {

	public static void main(String[] args) {

			int ultimos[] = getTresUltimosPrimos(50);
			


			for (int num : ultimos) {
				System.out.println(num);
			}
			
			System.out.println();
			
			int numeros[]= devuelveMenorMayor(123, 243, 37);
			
			System.out.println("mayor: " + numeros[2] + "\nmenor: " + numeros[0]);
			

			
		}

		
		/**
		 * 
		 * @param limiteSuperior
		 * @return
		 */
		private static int[] getTresUltimosPrimos (int limiteSuperior) {
			int ultimosPrimos[] = new int[] {-1, -1, -1};
			int contador = 0;
			
			for (int i = limiteSuperior; i > 0; i--) {
				if (esPrimo(i)) {
					ultimosPrimos[contador] = i;
					contador++;
					
					if (contador == 3) {
						return ultimosPrimos;
					}
				}
			}
			
			return ultimosPrimos;
		}
		
		/**
		 * 
		 * @param num
		 * @return
		 */
		private static boolean esPrimo (int num) {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					return false;
				}
			}
			return true;
		}
		
		
		
		public static int[] devuelveMenorMayor(int numero1, int numero2, int numero3) {

			int array[] = new int[] {numero1 , numero2, numero3};
			
			for (int i = array.length-1; i > 0; i--) {
				for (int j = 0; j < i; j++) {
					if (array[j] > array[j+1]) {
						int aux = array[j];
						array[j] = array[j+1];
						array [j+1] = aux;
					}
				}
			}
			
			return array;
}
		
}

		
