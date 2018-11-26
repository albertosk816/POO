package Ahorcado;

import javax.swing.JOptionPane;

public class principal {

	public static void main(String[] args) {
		String palabras[] = new String []{"pantalon", "camiseta", "gorra"};
		
        String miPalabra = null;
        
        int buscar;
		
		int palabraAleatoria = (int) Math.round(Math.random()*palabras.length);
			System.out.println(palabras[palabraAleatoria]);
			    
		
			
			for (int i = 0; i < palabras[palabraAleatoria].length(); i++) {

				System.out.print(" _ ");
				
		}
			miPalabra = palabras[palabraAleatoria];
			miPalabra = (String)JOptionPane.showInputDialog("Introduzca una letra o palabra: ");
			
			
			 for (buscar = 0; buscar < 1000; buscar++) {
			
			if(miPalabra.equals(palabras[palabraAleatoria])) {
				
			}else
			  
				miPalabra = (String)JOptionPane.showInputDialog("Introduzca una letra o palabra: ");
			}
				System.out.println("\n La palabra es correcta");
				
			
			
			}
	
		


			
			
			
	}
	


