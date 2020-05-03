package jpu2016.dogfight.view;

public class GraphicsBuilder {
	public void GraphicsBuilder(IDogfightModel dogfightModel);
	public void applyModelToGraphic(Graphics graphics , ImageObserver observer);
	private void buikdEmptySky();
	private void drawMobile(IMobile mobile , Graphics graphics , ImageObserver observer);
	 public int getGlobalWidth();
	 public int getGlobalHeight();
	 
	 private IDogfightModel _dogfightModel;
	 private GraphicsBuilder() {
		 _dogfightModel = new IDogfightModel();
	 }
	 public interface IDogfightModel{
		 
	 }
	 private BuffereDImage _emptySky;
	 private GraphicsBuilder() {
		 _emptySky = new BuffereDImage();
	 }
	 public class BuffereDImage{
		 
	 }
}
