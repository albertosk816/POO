package Arkanoid;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

public class Actor {
	protected int x;
	protected int y;
	protected int width, height;
	protected String spriteName;
	protected SpriteCache spriteCache;



	public Actor(Stage stage) {

	}


	public void paint(Graphics2D g){
		ImageObserver stage = null;
		g.drawImage( spriteCache.getSprite(spriteName), x,y, stage);
	}

	
	public int getX()  { return x; }
	public void setX(int i) {	x = i; }

	public int getY() {	return y; }
	public void setY(int i) { y = i; }
	
	public String getSpriteName() {	return spriteName; }
	public void setSpriteName(String string) { 
		spriteName = string;
		BufferedImage image = spriteCache.getSprite(spriteName);
		height = image.getHeight();
		width = image.getWidth();
	}			
	
	public int getHeight() { return height; }
	public int getWidth() {	return width;	}
	public void setHeight(int i) {height = i;	}
	public void setWidth(int i) {	width = i;	}

	public void act() { }


	public void mouseMoved(MouseEvent event) {
		// TODO Auto-generated method stub
		
	}

}
