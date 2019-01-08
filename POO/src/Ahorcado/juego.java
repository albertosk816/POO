package Ahorcado;

import java.util.Arrays;

import javax.swing.JOptionPane;


public class juego{
		
		String palabras[] = new String []{"pantalon", "camiseta", "gorra"};
	
	    String comprobarLetraPalabra = null;
	    
	    int fallos = 0;
	    int control;
		char charUsu;
		int palabraAleatoria = (int) Math.round(Math.random()*palabras.length)-1;
		String palabraEle = palabras[palabraAleatoria];
		int tope = palabraEle.length();
		int contador =0; 
		
		//System.out.println(palabraEle);
		
		
		//Para poder iniciar el juego en la clase principal
		public static void setJuego(juego juegoAhorcado) {
			juego.juego = juegoAhorcado;
		}
		
		private static juego juego = null;
		
	
		public static juego getJuego() {
			if (juego == null) {
				juego = new juego();
			}
			return juego;
		}
		
		
	
		public void juegoAhorcado(){
	   char[] coincidencias= new char [palabras[palabraAleatoria].length()];
			
		for (int i = 0; i < coincidencias.length; i++) {
	
				System.out.print(" _ ");
				coincidencias[i]='_';
		}
		System.out.println("\n");
		do {
			
			comprobarLetraPalabra = JOptionPane.showInputDialog("Introduzca una letra/palabra: ");
			
			//Así igualamos nuestra palabra con la introducida por el usuario
				   if(comprobarLetraPalabra.equals(palabras[palabraAleatoria])) {
					  JOptionPane.showMessageDialog(null, "***Enhorabuena la palabra ha sido acertada***");
					  contador=tope;
					  
			       } else  {
			    	   if(comprobarLetraPalabra.length()==1) {
			    		   control=0;
			    		   for(int i = 0; i < palabraEle.length(); i++) {
					           
			    			   charUsu = comprobarLetraPalabra.charAt(0);
			    		      if (comprobarLetraPalabra.charAt(0) == palabraEle.charAt(i)) {
			    		    	  control=1;
			    		    	  coincidencias[i] = comprobarLetraPalabra.charAt(0);
			    		    	  System.out.print(" " + coincidencias[i]);
			    		    	  contador++;
	     
						      }else {
						    	  System.out.print(" " + coincidencias[i]);
						      }  
			    		   }
			    		   System.out.println();
			    		   if (control==0) {
			    			   fallos++;
			    		   }
			    	   }	     
			       }   	
				VentanaAhorcado.getVentana().repaint();
			} while (contador!=tope && fallos<6);
			if (fallos<6) {
			  JOptionPane.showMessageDialog(null, "***Enhorabuena la palabra ha sido acertada***");
			}else {
				JOptionPane.showMessageDialog(null, "***Has llegado al tope de fallos***");
			}
	}
	
	
	
		public int getFallos() {
			return fallos;
		}
	
	
	
		public void setFallos(int fallos) {
			this.fallos = fallos;
		}
	
	
	}
