package dogfightModel;

import java.util.ArrayList;

public interface IDogfightModel {
	public static final IArea getArea = null;
	public void buildArea(Dimension dimension);
	public void addMobile(IMobile Mobile);
	public void removeMobile(IMobile Mobile);
	public ArrayList<IMobile> getMobiles = null;
	public IMobile getMobileByPlayer(int player);
	public void setMobilesHavesMoved();
}
