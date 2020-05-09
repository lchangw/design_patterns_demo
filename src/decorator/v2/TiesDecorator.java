package decorator.v2;

public class TiesDecorator extends Decorator {

	@Override
	public void show() {
		System.out.print("Áì´ø ");
		person.show();
	}

}
