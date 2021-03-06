
public interface IMobile {
	public Direction getDirection;
	public void setDirection(Direction direction);
	public point getPosition;
	public Dimension getDimension;
	public int getWidth;
	public int getHeight;
	public int getSpeed;
	public Image getImage;
	public void move;
	public void placeInArea(IArea area);
	public boolean isPlayer(int player);
	public DogfightModel dogfightModel setDogfightModel;
	public boolean hit;
	public boolean isWeapon;
}
