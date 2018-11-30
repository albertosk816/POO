package Ahorcado;

import javax.swing.JOptionPane;

public class principal {

	public static void main(String[] args) {
		String palabras[] = new String []{"pantalon", "camiseta", "gorra"};
		
        
        String comprobarLetraPalabra = null;
        
        int fallos = 0;

		char charUsu;
		int palabraAleatoria = (int) Math.round(Math.random()*palabras.length);
		System.out.println(palabras[palabraAleatoria]);
			    
	    char coincidencias []= new char[palabras[palabraAleatoria].length()];
			
		for (int i = 0; i < coincidencias.length; i++) {

				System.out.print(" _ ");
				
				
				
		}
		System.out.println("\n");
		do {
			
			comprobarLetraPalabra = JOptionPane.showInputDialog("Introduzca una letra/palabra: ");
			
			//Así igualamos nuestra palabra con la introducida por el usuario
				   if(comprobarLetraPalabra.equals(palabras[palabraAleatoria])) {
					  JOptionPane.showMessageDialog(null, "***Enhorabuena la palabra ha sido acertada***");
			    
			       } else  {
			    	   if(comprobarLetraPalabra.length()==1) {
			    		   for(int i = 0; i < palabras[palabraAleatoria].length(); i++) {
					           
			    			   charUsu = comprobarLetraPalabra.charAt(0);
			    		      if (charUsu == coincidencias[i]) {
			    		    	  
			    		    	  coincidencias[i] = charUsu;
			    		    		  
			    		    		  
			    		    		//palabras[palabraAleatoria] = comprobarLetraPalabra;
			    		    		 // coincidencias[i] = comprobarLetraPalabra.charAt(0);
									//comprobarLetraPalabra.replace(coincidencias[j], charUsu);
								
							     
						      }System.out.print(coincidencias[i]);
			    		}  
			    		   
			    	   }
			    	   
			    	  /* if(palabras[palabraAleatoria].contains(comprobarLetraPalabra)) {
			    	    	// comprobarLetraPalabra.replace(comprobarLetraPalabra, palabras[palabraAleatoria]);
			    	    	 System.out.print(comprobarLetraPalabra);
			    	    	 
			    	   }*/
			    	   else { 
			    		   if(!palabras[palabraAleatoria].contains(comprobarLetraPalabra )) {
			    	    	   fallos++;
			    	    	   
			    	    	   if(fallos >= 6){
			    	    		   System.out.print("\n ***Has perdido***");
			    	    	   }
			    	       }
			    	   }
			             
			       }   	
				
			} while (!comprobarLetraPalabra.equals(palabras[palabraAleatoria]));
			  JOptionPane.showMessageDialog(null, "***Enhorabuena la palabra ha sido acertada***");
			
			}
	
		

	

			
			
			
	}
	


