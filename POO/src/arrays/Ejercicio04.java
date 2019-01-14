package arrays;

public class Ejercicio04 {

	public static void main(String[] args) {
	
//    4º.- Realiza un programa que cree un array bidimensional, una matriz, de 5 filas x 5 columnas. Una vez hecho el array, realiza estos pasos:
//    	
//	      - Crea un método que rellena la matriz con valores creados al azar.
//	      
//	      - Crea un método que imprima la matriz en pantalla.
//	      
//	      - Crea un método que compruebe si la matriz es positiva. (Todos sus elementos mayores o iguales a cero)
//	      
//	      - Crea un método que compruebe si la matriz es diagonal (Todos los elementos que no est´an en la diagonal principal son nulos).
//	      
//	      - Crea un método que compruebe si la matriz es triangular superior. (Todos los elementos que están por debajo de la diagonal principal son nulos).
//	      
//	      - Crea un método que compruebe si la matriz es dispersa. (Todos las filas y todas las columnas contienen al menos un elemento nulo)
//	      
//	      - Crea un método que construya un array unidimensional con todos los elementos de la matriz.
//	      
//	      - Crea un método que compruebe si la matriz es simétrica. (Los elementos de la matriz (i, j) y (j, i), si existen, son iguales).
//	      
//	      - Crea un método que realice la matriz traspuesta de la que recibe.
//	      
//	      - Crea un método que realice la matiz opuesta de la que recibe.
//	      
//	      - Crea un método que pida al usuario un número de fila sobre la matriz. Debes crear una matriz igual a la original pero eliminando 
//	      el número de fila que el usuario ha especificado.
		
		int miMatriz[][]= creaMatriz();
		
		imprimirMatriz(miMatriz[][]);
		
		
		
	}
	
	private static int[][] creaMatriz() {
		int matriz[][] = new int [5][5];
		
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[0].length; j++) {
					matriz[i][j] = (int) (Math.round(Math.random()*10));
				}
			}
		
		
		
		return matriz;
	}
	
	private static void imprimirMatriz(int matriz[][]) {
	
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println(matriz[i][j]);
				
				
			}
		}
	}

}
