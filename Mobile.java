
public class Mobile {
	private int speed;
	public Mobile(Directio direction, Position position, Dimension dimension, int speed, String image);
	public Direction getDirection;
	public void setDirection(Direction direction);
	public point getPosition;
	public Dimension getDimension;
	public int getSpeed;
	public int getWidth;
	public int getHeight;
	public void move;
	public void placeInArea(IArea area);
	public boolean isPlayer(int player);
	public void moveUp;
	public void moveRight;
	public void moveDown;
	public void moveleft;
	public Color getColor;
	public IDogfightModel getDogfightModel;
	public void setDogfightModel(IDogfightModel dogfightModel);
	public boolean hint;
	public boolean isWeapon;
	public Image getImage;
}
