package Ahorcado;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class VentanaAhorcado extends Canvas {
	
	// Declaraci�n de variables que nos permitir�n introducir el ancho y el alto
	// de la ventana
	public static final int ANCHO = 654;
	public static final int ALTO = 673;


	// Incorporaci�n de un patr�n Singleton a esta clase
	public static VentanaAhorcado ventana = null;
		
	/**
	 * 
	 */
	public VentanaAhorcado() {
		// La clase JFrame nos permite mostrar una ventana en pantalla
		JFrame ventana = new JFrame("Ahorcado");
		// Establecemos las dimensiones que queremos que tenga
		ventana.setBounds(0,0,ANCHO,ALTO);
		
		// Obtengo una referencia al panel principal de la ventana.
		// Todas las ventanas tienen un panel principal	
		JPanel panel = (JPanel)ventana.getContentPane();

		// Al panel principal de la ventana le a�adimos el objeto this, un Canvas
		panel.add(this);

		// Establezco el tama�o del canvas (this) para que ocupe todo el tama�o de la ventana
		this.setBounds(0,0,ANCHO,ALTO);
		
		// Provocamos que el programa se acabe cuando cerramos la ventana 
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Hacemos visible la ventana.
		ventana.setVisible(true);

		// Evitamos que la ventana pueda redimensionarse.
		ventana.setResizable(false);
	}

	/**
	 * Patr�n Singleton	public void repintarVentana () {
		// Obtengo el objeto de tipo gr�fico asociado al doble b�ffer, me permitir� pintar
		Graphics g = dobleBuffer.getDrawGraphics();

	}
	 * @return
	 */
	public static VentanaAhorcado getVentana() {
		if (ventana == null) {
			ventana = new VentanaAhorcado();
		}
		return ventana;
	}	
	
	
	public void paint (Graphics g) {
		
		//Muñeco
		g.setColor(Color.BLUE);
		g.fillRect(300, 300, 60, 90);
		
		
		g.fillRect(220, 300, 80, 20);
		g.fillRect(360, 300, 80, 20);
		
		
		g.fillOval(285, 210, 90, 90);
		
		g.fillRect(300, 390, 20, 80);
		g.fillRect(340, 390, 20, 80);
		
		if (get >0) {
			g.setColor(Color.red);
			g.fillRect(300, 300, 60, 90);
		}
		
		if (get.fallos >1) {
			g.setColor(Color.red);
			g.fillRect(220, 300, 80, 20);
		}
		
		if (fallos >2) {
			g.setColor(Color.red);
			g.fillRect(360, 300, 80, 20);
		}
		
		if (fallos >3) {
			g.setColor(Color.red);
			g.fillOval(285, 210, 90, 90);
		}
		
		if (fallos >4) {
			g.setColor(Color.red);
			g.fillRect(300, 390, 20, 80);
		}
		
		if (fallos >5) {
			g.setColor(Color.red);
			g.fillRect(340, 390, 20, 80);
		}
		
		
		
		
		//horca
		g.setColor(Color.darkGray);
		g.fillRect(50, 600, 500, 10);
		
		g.fillRect(40, 30, 10, 600);
		
		g.fillRect(50, 100, 300, 10);
		
		g.fillRect(330, 110, 5, 100);

		
		
		
	}
	
	
}