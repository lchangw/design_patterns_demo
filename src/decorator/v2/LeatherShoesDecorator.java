package decorator.v2;

public class LeatherShoesDecorator extends Decorator {

	@Override
	public void show() {
		System.out.print("ƤЬ ");
		person.show();
	}

}
