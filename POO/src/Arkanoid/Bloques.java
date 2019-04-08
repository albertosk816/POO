package Arkanoid;

import java.awt.Color;
import java.awt.Graphics2D;

public class Bloques extends Actor {

	
	public static final int ANCHO = 50;
	public static final int ALTO = 20;
	public static final int ESPACIO_ENTRE_LADRILLOS = 1;
	private static Stage stage;
	
	private Color color = null;
	
	
	public Bloques(int x, int y, Color color) {
		super(stage);
		this.x = x;
		this.y = y;
		this.color = color;
	}
	
	/**
	 * Pintado de los bloques en pantalla
	 */
	public void paint(Graphics2D g){
		g.setColor(this.color);
		
		g.fillRect(this.x, this.y, ANCHO, ALTO);
	}


	// Metodos getter y setter
	public Color getColor() { return color; }
	public void setColor(Color color) { this.color = color; }

}

