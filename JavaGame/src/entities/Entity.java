package JavaGame.src.entities;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import JavaGame.src.game.Game;
import JavaGame.src.world.Camera;

public class Entity {

	public static BufferedImage LIFEPACK_EN = Game.spritesheet.getSprite(144,0,16,16);
	public static BufferedImage WEAPON_EN = Game.spritesheet.getSprite(144,16,16,16);
	public static BufferedImage AMMUNITION_EN = Game.spritesheet.getSprite(144,32,16,16);
	public static BufferedImage PROTEINPOWDER_EN = Game.spritesheet.getSprite(144,144,16,16);
	public static BufferedImage ENEMY_EN = Game.spritesheet.getSprite(16*2,16*4,16,16);

	protected double x;
	protected double y;
	protected int width;
	protected int height;
	
	private BufferedImage sprite;
	
	public Entity(int x, int y ,int width, int height, BufferedImage sprite) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.sprite = sprite;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	

	
	public int getX() {
		return (int)this.x;
	}
	public int getY() {
		return (int)this.y;
	}
	public int getWidth() {
		return this.width;
	}
	public int getHeight() {
		return this.height;
	}
	
	public void tick() {
		
	}
	
	public void render(Graphics g) {
		g.drawImage(sprite, this.getX() - Camera.x,this.getY() - Camera.y,null);
	}
	
}
