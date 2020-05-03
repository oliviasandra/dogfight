package jpu2016.dogfight.view;

public class EventPerformer {
	public void EventPerformer(IOrderPerfomer orderPerformer);
	public void eventPerform(KeyEvent keyCode);
	private UserOrder keyCodeToUserOrder(int keyCode);
	
	private List<IOrderPerformer> _orderPerformer = new ARRayList<IOrderPerformer>();
	
}
