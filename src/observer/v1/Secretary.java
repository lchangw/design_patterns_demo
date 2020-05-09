package observer.v1;

import java.util.ArrayList;
import java.util.List;

public class Secretary {
	
	private String action;
	private List<StockObserver> list = new ArrayList<StockObserver>();
	
	public void add(StockObserver observer) {
		list.add(observer);
	}
	
	public void remove(StockObserver observer) {
		list.remove(observer);
	}
	
	public void notifyObservers() {
		for(StockObserver observer : list) {
			observer.update();
			System.out.println();
		}
	}
	
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
}
