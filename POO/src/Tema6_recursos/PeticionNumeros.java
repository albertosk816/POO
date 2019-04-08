package Tema6_recursos;


import javax.swing.JOptionPane;


public class PeticionNumeros {

	public static void main(String[] args) {
		pideNumeroPar();
	}

	private static void pideNumeroPar() {
		int numero= 0;
		while (numero % 2 ==0) {
			 numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número par: "));
			
		}
		
		
		
	}

}
