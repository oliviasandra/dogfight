package jpu2016.dogfight.view;

import java.util.Observable;

import jpu2016.dogfight.view.GraphicsBuilder.GraphicsBuilders;

public class DogfightView {
	public void DogfigthView(IOderPerformer orderPerformer , IDogfightModel dogfightModel , Observable observable) {
	}
	private void run();
	public void displayMessage(String message);
	public void closeAll();
	private EventPerformer _eventPerformer;
	private DogfightView() {
		EventPerformer _eventPerformer = new EventPerformer();
	}
	class EventPerformer{
		
	}
	private GraphicsBuilders _graphicsBuilder;
	 private DogfightView() {
		 _graphicsBuilder = new GraphicsBuilders();
	 }
	 class GraphicsBuilders{
		 
	 }
	private GameFrame _gameFrame;
	private DogfightView() {
		_gameFrame = new GameFrame();
	}
	class GameFrame{
		
	}
}
