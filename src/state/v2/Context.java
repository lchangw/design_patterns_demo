package state.v2;

public class Context {

	private double hour;
	private boolean finished;
	private State state;
	public Context(State state) {
		this.setState(state);
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public void request() {
		state.handle(this);
	}
	public double getHour() {
		return hour;
	}
	public void setHour(double hour) {
		this.hour = hour;
	}
	public boolean isFinished() {
		return finished;
	}
	public void setFinished(boolean finished) {
		this.finished = finished;
	}
}
