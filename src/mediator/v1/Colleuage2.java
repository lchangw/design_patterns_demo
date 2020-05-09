package mediator.v1;

public class Colleuage2 extends Colleuage{

	public Colleuage2(Mediator mediator) {
		super(mediator);
	}
	
	public void send(String message) {
		mediator.send(message, this);
	}
	
	public void inform(String message) {
		System.out.println("C2 get message: " + message);
	}
}
