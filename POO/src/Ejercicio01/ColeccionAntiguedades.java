package Ejercicio01;

import javax.swing.JOptionPane;

public class ColeccionAntiguedades {

	public static void main(String[] args) {
		/*
		 *2�. Crear un programa que use la herencia para gestionar una colecci�n de antig�edades. 
		 *Todas las antig�edades tienen datos en com�n, como a�o de fabricaci�n, el origen y el 
		 *precio de venta, pero cada tipo particular de antig�edad tiene datos espec�ficos. 
		 *Por ejemplo, las joyas tienen un material de fabricaci�n. Los libros tienen 
		 *un autor y t�tulo, etc... El programa podr� crear y gestionar antig�edades  de 
		 *4 tipos diferentes. Deber�s crear las clases necesarias, con sus variables de 
		 *instancia, m�todos para actualizar y consultar las variables, constructores, y
		 * m�todos para imprimir en pantalla el objeto. Para probar las clases, deber�s 
		 * crear una clase llamada "ColeccionAntiguedades", que pida los datos sobre una
		 *  antig�edad (el tipo, datos comunes, datos espec�ficos), cree el objeto de la 
		 *  clase correspondiente, y posteriormente lo imprima en pantalla.  
		 */

		String menu = "Creacion de datos de antiguedades: "
				+ "\n\n 1.-Joya"
				+ "\n 2.-Mueble";
		
		
		int opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
		
		switch (opcion) {
		case 1:
			
			break;
			
		case 2:
			
			break;

		default:
			break;
		}
	}

}
