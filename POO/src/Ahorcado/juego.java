package Ahorcado;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class juego {
	
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
			
		} while (contador!=tope && fallos<6);
		if (fallos<6) {
		  JOptionPane.showMessageDialog(null, "***Enhorabuena la palabra ha sido acertada***");
		}else {
			JOptionPane.showMessageDialog(null, "***Has llegado al tope de fallos***");
		}
}

	@Override
	public String toString() {
		return "juego [palabras=" + Arrays.toString(palabras) + ", comprobarLetraPalabra=" + comprobarLetraPalabra
				+ ", fallos=" + fallos + ", control=" + control + ", charUsu=" + charUsu + ", palabraAleatoria="
				+ palabraAleatoria + ", palabraEle=" + palabraEle + ", tope=" + tope + ", contador=" + contador + "]";
	}

	public juego(String[] palabras, String comprobarLetraPalabra, int fallos, int control, char charUsu,
			int palabraAleatoria, String palabraEle, int tope, int contador) {
		super();
		this.palabras = palabras;
		this.comprobarLetraPalabra = comprobarLetraPalabra;
		this.fallos = fallos;
		this.control = control;
		this.charUsu = charUsu;
		this.palabraAleatoria = palabraAleatoria;
		this.palabraEle = palabraEle;
		this.tope = tope;
		this.contador = contador;
	}

	public String[] getPalabras() {
		return palabras;
	}

	public void setPalabras(String[] palabras) {
		this.palabras = palabras;
	}

	public String getComprobarLetraPalabra() {
		return comprobarLetraPalabra;
	}

	public void setComprobarLetraPalabra(String comprobarLetraPalabra) {
		this.comprobarLetraPalabra = comprobarLetraPalabra;
	}

	public int getFallos() {
		return fallos;
	}

	public void setFallos(int fallos) {
		this.fallos = fallos;
	}

	public int getControl() {
		return control;
	}

	public void setControl(int control) {
		this.control = control;
	}

	public char getCharUsu() {
		return charUsu;
	}

	public void setCharUsu(char charUsu) {
		this.charUsu = charUsu;
	}

	public int getPalabraAleatoria() {
		return palabraAleatoria;
	}

	public void setPalabraAleatoria(int palabraAleatoria) {
		this.palabraAleatoria = palabraAleatoria;
	}

	public String getPalabraEle() {
		return palabraEle;
	}

	public void setPalabraEle(String palabraEle) {
		this.palabraEle = palabraEle;
	}

	public int getTope() {
		return tope;
	}

	public void setTope(int tope) {
		this.tope = tope;
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}


}
