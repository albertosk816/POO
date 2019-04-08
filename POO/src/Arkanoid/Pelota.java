package Arkanoid;


public class Pelota extends Actor {
	protected int vx;
	protected int vy;

	
	public Pelota(Stage stage) {
		super(stage);
//		spriteCache.getSprite(setSpriteName("pelota1.png"));
	}


	public void act() {
		x+=vx;
		if (x < 0 || x > Stage.WIDTH-38)
		  vx = -vx;
		
		y+=vy;
		if (y < 0 || y > Stage.HEIGHT-38)
		  vy = -vy;
	}
	
//	public void paint(Graphics2D g){
//		setSpriteName("pelota1.png");
//		
//	}

	public int getVx() { return vx; }
	public void setVx(int i) {vx = i;	}
	
	public int getVy() { return vy; }
	public void setVy(int i) {vy = i;	}
	
	


}
