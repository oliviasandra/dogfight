package jpu2016.dogfight.view;

import java.util.Observable;

public interface IViewSystem {
	public void displayMessage(String message);
	public void closeAll();
	public class Dogfightwiew implements IViewSystem{
		public void DogfigthView(IOderPerformer orderPerformer , IDogfightModel dogfightModel , Observable observable) {
		}
		private void run();
		public void displayMessage(String message);
		public void closeAll();
	}	
}

