package observer.v2;

import java.util.ArrayList;
import java.util.List;

public class Secretary implements Subject {

	private List<Observer> list = new ArrayList<Observer>();
	private String action;
	@Override
	public void add(Observer observer) {
		list.add(observer);
	}

	@Override
	public void remove(Observer observer) {
		list.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for(Observer observer : list) {
			observer.update();
			System.out.println();
		}
	}

	@Override
	public String getAction() {
		return action;
	}

	@Override
	public void setAction(String action) {
		this.action = action;
	}

}
