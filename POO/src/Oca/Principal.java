package Oca;



public class Principal {   

	/**
	 * 
	 */
	public static void main (String args[]) {
		String[] nombreJugadores = new String [] {"Rojo", "Amarillo", "Azul" , "Verde"}; 
	    
		Jugador jugador[] = new Jugador[4];

		
		for (int i = 0; i < jugador.length; i++) {
			
			jugador[i] = new Jugador(nombreJugadores[i]);
			
		}
			
		do {
			for (int i = 0; i < jugador.length; i++) {
				if (!jugador[i].isTerminado()) {
					System.out.println(jugador[i].getNombre());
					jugador[i].tirarDado();
				
					}	if(jugador[i].isTerminado()) {
						
						//jugador[i].setPodium(contador++);
						int contador = 1;
						System.out.println(jugador[i] + " Jugador-> " +i+ " - " +  contador);
						contador++;
				}
				
				}
			
		} while (!estaJuegoTerminado(jugador));
	}
	
		
		
		
	/*	if(i == 0) {
				Jugador jugadorRojo = new Jugador();
				jugadorRojo.setNombre("rojo");
				
					jugador[0].tirarDado();
					
		}else if (i ==1) {
			
				Jugador jugadorAmarillo = new Jugador();
                jugadorAmarillo.setNombre("Amarillo");

	               jugador[1].tirarDado();
                   }
			
		else if (i == 2) {
				Jugador jugadorVerde = new Jugador();
                jugadorVerde.setNombre("Verde");

	               jugador[2].tirarDado();
                   }
		
	

		
		
					
		else if (i == 3){
				Jugador jugadorAzul = new Jugador();
                jugadorAzul.setNombre("Azul");

	                jugador[3].tirarDado();
                    }
		
		}*/
			/*if(i==0) {if(jugador[i].isTerminado()) {
				jugador.getPodium();

			
				
			}else if(i==1) {
				Jugador jugadorAmarillo = new Jugador();
				jugadorAmarillo.setNombre("amarillo");
				
	
					jugador[1].tirarDado();

				
			}else if(i==2) {
				Jugador jugadorVerde = new Jugador();
				jugadorVerde.setNombre("Verde");

					jugador[2].tirarDado();

	
				
			}else if (i == 3) {
				Jugador jugadorAzul = new Jugador();
				jugadorAzul.setNombre("Azul");
				
     				jugador[3].tirarDado();


			}
		}*/
		
		// Prueba de uso del primer jugador
		

		
		private static boolean estaJuegoTerminado (Jugador jugador[]) {

		//	int contador = 0;
		
			for (int i = 0; i < jugador.length; i++) {
			/*	if(jugador[i].isTerminado()) {
					
					jugador[i].setPodium(contador++);
					
					System.out.println(jugador[i] + " Jugador-> " +i+ " - " +  contador);
					
				}*/
				
				if (!jugador[i].isTerminado()) {
					return false;
				}
				
			}
			return true;
	
			
	
		}
	}


