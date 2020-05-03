package jpu2016.gameframe;

import java.awt.List;
import java.awt.event.KeyEvent;
import java.util.Observable;

import jpu2016.dogfight.view.ARRayList;

public class GameFrame {
	public void GameFrame(String title , IGraphicsBuilder graphicBuilder, Observable observable) {
	}
	public void keyPressed(KeyEvent keyEvent) {
	}
	private ARRayList<IEventPerformer> _evenPerformer = new ARRayList<IEventPerformer>();
}
