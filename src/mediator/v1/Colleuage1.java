package mediator.v1;

public class Colleuage1 extends Colleuage{

	public Colleuage1(Mediator mediator) {
		super(mediator);
		
	}
	
	public void send(String message) {
		mediator.send(message, this);
	}
	
	public void inform(String message) {
		System.out.println("C1 get message: " + message);
	}
}
