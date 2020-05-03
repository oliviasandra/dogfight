package jpu2016.gameframe;

import java.awt.Graphics;
import java.awt.List;
import java.awt.image.ImageObserver;

import jpu2016.dogfight.view.ARRayList;

public interface IGraphicsBuilder {
	public void applyModelToGraphic(Graphics graphics, ImageObserver observer);
	public int getGlobalWidth();
	public int getGlobalHeight();
	public class GraphicsBuilder implements IGraphicsBuilder {

		@Override
		public void applyModelToGraphic(Graphics graphics, ImageObserver observer) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public int getGlobalWidth() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int getGlobalHeight() {
			// TODO Auto-generated method stub
			return 0;
		}
		
	}
	ARRayList<GamePanel> _graphicsBuilder = new ARRayList<GamePanel>();
}
