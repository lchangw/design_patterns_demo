package mediator.v1;

public class ConcreteMediator implements Mediator {
	
	private Colleuage1 c1;
	private Colleuage2 c2;

	@Override
	public void send(String message, Colleuage colleuage) {
		if(colleuage instanceof Colleuage1) {
			c2.inform(message);
		}else {
			c1.inform(message);
		}
	}

	public Colleuage1 getC1() {
		return c1;
	}

	public void setC1(Colleuage1 c1) {
		this.c1 = c1;
	}

	public Colleuage2 getC2() {
		return c2;
	}

	public void setC2(Colleuage2 c2) {
		this.c2 = c2;
	}

}
