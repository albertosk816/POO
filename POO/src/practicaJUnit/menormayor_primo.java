package practicaJUnit;

import java.util.Arrays;

public class menormayor_primo {

	public static void main(String[] args) {

			int ultimos[] = getTresUltimosPrimos(50);
			


			for (int num : ultimos) {
				System.out.println(num);
			}
			
			System.out.println();
			
			int numeros[]= devuelveMenorMayor(new int[] { 37,123, 243});
			
			System.out.println("mayor: " + numeros[2] + "\nmenor: " + numeros[0]);
			

			
		}

		
		/**
		 * 
		 * @param limiteSuperior
		 * @return
		 */
		public static int[] getTresUltimosPrimos (int limiteSuperior) {
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
		
		
		
		public static int[] devuelveMenorMayor(int array[]) {

					
			Arrays.sort(array);
			
//			
//					}
//				}
//			}
			
			return array;
}
		
}

		
