package adapter.v1;

public class Adapter implements Target {

	private Adaptee adaptee = new Adaptee();
	@Override
	public void request() {
		//System.out.println("∆’Õ®«Î«Û£°");
		adaptee.specialRequest();
	}

}
