package decorator.v2;

public class SuitsDecorator extends Decorator {

	@Override
	public void show() {
		System.out.print("���� ");
		person.show();
	}

}
