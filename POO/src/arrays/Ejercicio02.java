package arrays;

public class Ejercicio02 {

	public static void main(String[] args) {
	
//		2º.- Crea un array de 20 números enteros generados al azar entre 0 y 10. Analiza el array y calcula el porcentaje 
//		(con decimales) de notas aprobadas ( >= 5 ) y de notas suspensas.
		
		float notas[] = new float[200];
		
		
		int contadorAprobados = 0;
		int contadorSuspensos = 0;
		
		
		for (int i = 0; i < notas.length; i++) {
			notas[i] = (float)(Math.random()*10);
			System.out.println(i + " -- " + notas[i]);
			
			if(notas[i] >= 5) {
				contadorAprobados++;

			}
			else {
				contadorSuspensos++;
	
			}

		}
		
		float porcentajeAprobados = (contadorAprobados*100)/notas.length;
		float porcentajeSuspensos = (contadorSuspensos*100)/notas.length;
		
			System.out.println("Porcentaje Aprobados: " + porcentajeAprobados);
			System.out.println("Porcentaje Suspensos: " + porcentajeSuspensos);

		
		

	}

}
