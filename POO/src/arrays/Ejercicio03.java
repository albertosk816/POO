package arrays;

public class Ejercicio03 {

	public static void main(String[] args) {

//		3º.- Crea un array de 20 números decimales creados al azar entre 0 y 100. Para crear el número decimal 
//		debes generar al azar la parte entera y la parte decimal por separado para después unir las dos partes. 
//		A continuación debes examinar la cantidad de números cuya parte decimal está comprendida entre .00 y .49
		
		int numSuma[] = new int[20];

		float decimal;
		int entero;

		
		int contadorParteDecimal = 0;
		
		
		for (int i = 0; i < numSuma.length; i++) {
			
			entero = (int) (Math.random()*100);
			decimal = (float) (Math.random());

			
			float suma = (float)entero + decimal;
			System.out.println("Valores con suma: "  + suma);
			
			
			if(decimal >= 0 && decimal <= 0.49) {
				contadorParteDecimal++;
				
			}
			
		}
		
      System.out.println("La cantidad de numeros cuya parte decimal esta entre 00 y 49 es: " + contadorParteDecimal);
      
	}
	
	private void contarNumDecimalesMenores49 () {
		
	}

}
