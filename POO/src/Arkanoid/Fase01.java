package Arkanoid;

import java.awt.Color;

public class Fase01 extends Fase {
		// Propiedades est�ticas de la fase
		public static final int ESPACIO_SUPERIOR_SOBRE_LADRILLOS = 60;

		
		/**
		 * Inicializaci�n de la fase, es la implementaci�n de un m�todo abstracto en el supertipo
		 */
		@Override
		public void inicializaFase() {

		    // Inicializamos los ladrillos
		    int numLadrillosPosibles = Arkanoid.ANCHO / (Bloques.ANCHO + Bloques.ESPACIO_ENTRE_LADRILLOS);
		    int margenIzquierdo = (Arkanoid.ANCHO % (Bloques.ANCHO + Bloques.ESPACIO_ENTRE_LADRILLOS)) / 2;
		    
		    // Array con los diferentes colores, uno por cada fila
		    Color colores[] = new Color[] {Color.GREEN, Color.RED, Color.BLUE, Color.MAGENTA, Color.LIGHT_GRAY, Color.ORANGE};
		    
		    // Creamos las filas
		    for (int i = 0; i < colores.length; i++) {
		    	for (int j = 0; j < numLadrillosPosibles; j++) {
			    	this.actores.add(new Bloques(margenIzquierdo + j * (Bloques.ANCHO + Bloques.ESPACIO_ENTRE_LADRILLOS), 
			    			ESPACIO_SUPERIOR_SOBRE_LADRILLOS + i * (Bloques.ALTO + Bloques.ESPACIO_ENTRE_LADRILLOS), colores[i]));
			    }
		    }
		}

	}
