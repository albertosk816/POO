package Arkanoid;

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class Base extends Actor {
	
	private boolean moviendoAIzquierda = false;
	private boolean moviendoADerecha = false;
	private int velocidad = 5;
	private int ancho = 0;
	protected int vx;
	protected int vy;
	
//	public Base(Stage stage) {
//		super(stage);
//		setSpriteName("arkanoidBase.png");
//	}
	
	public Base() {
		super();
		setSpriteName("arkanoidBase.png");

		this.ancho = 78;
		// Colocaci�n de la nave en el centro horizontalmente y en la parte baja de la pantalla
		this.x = Arkanoid.ANCHO / 2;
		this.y = Arkanoid.ALTO - 50;
	}


	public void act() {
		// Controlo que el movimiento a derecha no haga que la nave se pierda por la derecha
		if (this.moviendoADerecha && (this.x + this.velocidad + this.ancho <= Arkanoid.ANCHO)) {
			this.x += this.velocidad;
		}
		// Control que el movimiento a izquierda no haga que la nave se pierda por la izquierda
		if (this.moviendoAIzquierda && (this.x - this.velocidad >= 0)) {
			this.x -= this.velocidad;
		}
	}
	
	
	@Override
	public void mouseMoved(MouseEvent event) {
		super.mouseMoved(event);
		if (event.getX() >= (this.ancho / 2) 
				&&
			event.getX() <= (Arkanoid.ANCHO - this.ancho / 2)) {
			this.x = event.getX() - this.ancho / 2;
		}
		
	}
	
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
			  case KeyEvent.VK_LEFT : moviendoAIzquierda = true; break;
			  case KeyEvent.VK_RIGHT : moviendoADerecha = true; break;
	  	}
	}
	
	public void keyReleased(KeyEvent e) {
		switch (e.getKeyCode()) {
			case KeyEvent.VK_LEFT : moviendoAIzquierda = false; break; 
			case KeyEvent.VK_RIGHT : moviendoADerecha = false; break;
		}
	}
	
}
