package Ahorcado;

import javax.swing.JOptionPane;

public class principal {

	public static void main(String[] args) {
		String palabras[] = new String []{"pantalon", "camiseta", "gorra"};
		
        String miPalabra = null;
        
        String comprobarLetraPalabra = null;
        
        int intentos;
		
		int palabraAleatoria = (int) Math.round(Math.random()*palabras.length);
			System.out.println(palabras[palabraAleatoria]);
			    
		
			
			for (int i = 0; i < palabras[palabraAleatoria].length(); i++) {

				System.out.print(" _ ");
				
				
		}
			do {
			
			comprobarLetraPalabra = JOptionPane.showInputDialog("Introduzca una letra/palabra: ");
			
			//Así igualamos nuestra palabra con la introducida por el usuario
				if(comprobarLetraPalabra.equals(palabras[palabraAleatoria])) {
					JOptionPane.showMessageDialog(null, "***Enhorabuena la palabra ha sido acertada***");
			    
			 } 
			    	else {
			    		
			    	       comprobarLetraPalabra = JOptionPane.showInputDialog("Introduzca una letra/palabra: ");
			    	       
			    	       if(comprobarLetraPalabra.contains(palabras[palabraAleatoria])) {
			    	    	  // comprobarLetraPalabra.replace(_, comprobarLetraAleatoria);
			    	       }
			             
			 }   	
				
			} while (!comprobarLetraPalabra.equals(palabras[palabraAleatoria]));
			  JOptionPane.showMessageDialog(null, "***Enhorabuena la palabra ha sido acertada***");
			
			}
	
		


			
			
			
	}
	


