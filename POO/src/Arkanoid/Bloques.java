package Arkanoid;

public class Bloques extends Actor {


		protected int vx;
		protected int vy;
		
		public Bloques(Stage stage) {
			super(stage);
			setSpriteName("cuadroVerde.png");

		}


		public void act() {
			x+=vx;
			if (x < 0 || x > Stage.WIDTH-78)
			  vx = -vx;
		}


		public int getVx() { return vx; }
		public void setVx(int i) {vx = i;	}
		
	}

