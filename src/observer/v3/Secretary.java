package observer.v3;

public class Secretary implements Subject {

	private String action;
	
	@Override
	public void notifyObservers() {
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
