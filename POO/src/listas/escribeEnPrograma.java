package listas;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;


public class escribeEnPrograma {
	
	private static List <String> linea = new ArrayList<String>();

	public static void main(String[] args) {

		añadirLineaTexto();
		añadirLineaTexto();
		añadirLineaTexto();
		añadirLineaTexto();
		imprimirTexto();
		System.out.println();
		
		borrarLineaTexto();
		imprimirTexto();
		System.out.println();


		
		insertarTextoEnCualquierPosicion();
		imprimirTexto();
		System.out.println();
		
		editarLineaTexto();
		imprimirTexto();
		System.out.println();
		
		cortarYPegar();
		imprimirTexto();
		
		
	}
	
	
	private static void añadirLineaTexto() {
		
		linea.add(JOptionPane.showInputDialog(null, "Introduzca una linea"));
		
	}
	
	private static void insertarTextoEnCualquierPosicion() {
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce en que linea quieres añadir"));
		linea.add(num, JOptionPane.showInputDialog("Introduce que añadir en esta linea"));
		
	}
	
	private static void editarLineaTexto() {
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de linea a modificar"));
		
		linea.set(num, JOptionPane.showInputDialog("Que quieres escribir en esta linea"));
	}
	
	private static void borrarLineaTexto() {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de linea a borrar"));
		linea.remove(num);
	}
	
	private static void cortarYPegar() {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de linea a cortar"));
		linea.get(num);
		linea.remove(num);
		
		int indiceDondePegar = Integer.parseInt(JOptionPane.showInputDialog("Introduce en que linea deseas pegar"));
		linea.add(indiceDondePegar, linea.get(num));

	}

	
	private static void imprimirTexto() {
		int contador = 0;
		
		for (String linea : linea) {
			
			System.out.println(contador + "- " + linea);
			contador++;
		}
	
	}
	
}
