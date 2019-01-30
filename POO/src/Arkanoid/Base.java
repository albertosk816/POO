package Arkanoid;

import java.awt.event.MouseEvent;

public class Base extends Actor {
	protected int vx;
	protected int vy;
	
	public Base(Stage stage) {
		super(stage);
		setSpriteName("arkanoidBase.png");
	}
	
	public void act() {
		x+=vx;
		if (x < 0 || x > Stage.WIDTH-78)
		  vx = -vx;
	}


	public int getVx() { return vx; }
	public void setVx(int i) {vx = i;	}
	
	
	
	public void mouseMoved(MouseEvent e) {
		setX(e.getX());
	}
	
}
