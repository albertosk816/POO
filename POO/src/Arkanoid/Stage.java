package Arkanoid;

import java.awt.image.ImageObserver;

public interface Stage extends ImageObserver {
	public static final int WIDTH=640;
	public static final int HEIGHT=680;
	public static final int SPEED=10;
	public SpriteCache getSpriteCache();

}
