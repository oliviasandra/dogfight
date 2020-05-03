package java.lang;

import java.util.Observable;

import jpu2016.dogfight.view.IDogfightModel;
import jpu2016.dogfight.view.IOderPerformer;

public interface Runnable{
	public class Dogfightwiew implements Runnable{
		public void DogfigthView(IOderPerformer orderPerformer , IDogfightModel dogfightModel , Observable observable) {
		}
		private void run();
		public void displayMessage(String message);
		public void closeAll();
}