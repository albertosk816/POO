package Ejercicio02;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {

		String menuPersona = "Menú: \n"
				+ "\n 1.-Persona Documentada"
				+ "\n 2.-Persona No Documentada";
		
		int num = Integer.parseInt(JOptionPane.showInputDialog(menuPersona));
		
		if (num > 0 && num < 3) {
			
			
			switch (num) {
			case 1:
				Persona personaD = new personaDocumentada(); 
				
				break;

			case 2:
				Persona personaND = new personaNoDocumentada();
				break;
			}
		}
		
		
		
		String menuMatricula = "Menú: \n"
				+ "\n 1.-ESO"
				+ "\n 2.-Bachillerato"
				+ "\n 3.-FP";
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog(menuPersona));
		
		if (num1 > 0 && num1 < 4) {
			
			
			switch (num1) {
			case 1:
				
			Matricula eso = new eso();
				
				break;

			case 2:
			
				break;
				
			case 3:
				
				break;
			}
		}
				
	}

}
