package decorator.v2;

public class SneakersDecorator extends Decorator {

	@Override
	public void show() {
		System.out.print("����Ь ");
		person.show();
	}

}
