package mediator.v1;

public abstract class Colleuage {

	protected Mediator mediator;
	
	public Colleuage(Mediator mediator) {
		this.mediator = mediator;
	}
	
	abstract void send(String message);
	abstract void inform(String message);
}
