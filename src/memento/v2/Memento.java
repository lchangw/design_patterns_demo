package memento.v2;

public class Memento {

	private String state;
	public Memento(String state) {
		this.setState(state);
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
