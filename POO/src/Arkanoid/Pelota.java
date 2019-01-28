package Arkanoid;
public class Pelota extends Actor {
	protected int vx;
	
	public Pelota(Stage stage) {
		super(stage);
		setSpriteName("pelota1.png");
	}
	
	public void act() {
		x+=vx;
		if (x < 0 || x > Stage.WIDTH)
		  vx = -vx;
	}

	public int getVx() { return vx; }
	public void setVx(int i) {vx = i;	}

}
