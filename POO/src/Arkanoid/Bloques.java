package Arkanoid;

import java.awt.Color;
import java.awt.Graphics2D;

public class Bloques extends Actor {



	public static final int ANCHO = 30;
	public static final int ALTO = 20;
	public static final int ESPACIO_ENTRE_LADRILLOS = 2;
	
	private Color color = null;
	
	
	public Bloques() {
		super();
		
		this.x = 10;
		this.y = 10;
		this.color = Color.WHITE; // Por defecto pongo el ladrillo en color blanco
	}
	
	public Bloques(int x, int y, Color color) {
		
		this.x = x;
		this.y = y;
		this.color = color;
	}
	/**
	 * Pintado del ladrillo en pantalla
	 */
	public void paint(Graphics2D g){
		g.setColor(this.color);
		// Pinto el ladrillo como un rect�ngulo con v�rtices redondeados
		g.fillRoundRect(this.x, this.y, ANCHO, ALTO, 3, 3);
	}


	// M�todos getter y setter
	public Color getColor() { return color; }
	public void setColor(Color color) { this.color = color; }

}

