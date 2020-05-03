package dogfightModel;

import java.awt.Color;
import java.awt.Image;
import java.awt.Point;

public abstract class Mobile {
	private int speed;
	public Mobile(Direction direction, Position position, Dimension dimension, int speed, String image) {
	}
	public Direction getDirection;
	public void setDirection(Direction direction) {
	}
	public Point getPosition(){
		return null;}
	public Dimension getDimension;
	public int getSpeed;
	public int getWidth;
	public int getHeight;
	public void move(){}
	public void placeInArea(IArea area) {
	}
	public boolean isPlayer(int player) {
		return false;
	}
	public void moveUp(){}
	public void moveRight(){}
	public void moveDown(){}
	public void moveleft(){}
	public Color getColor;
	public IDogfightModel getDogfightModel;
	public void setDogfightModel(IDogfightModel dogfightModel) {
	}
	public boolean hint;
	public boolean isWeapon;
	public Image getImage;
}
