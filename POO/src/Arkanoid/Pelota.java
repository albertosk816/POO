package Arkanoid;
public class Pelota extends Actor {
	protected int vx;
	protected int vy;

	
	public Pelota(Stage stage) {
		super(stage);
		setSpriteName("pelota1.png");
	}
	
	public void act() {
		x+=vx;
		if (x < 0 || x > Stage.WIDTH-38)
		  vx = -vx;
		
	}
	


	public int getVx() { return vx; }
	public void setVx(int i) {vx = i;	}
	
	public int getVy() { return vy; }
	public void setVy(int i) {vy = i;	}

}
