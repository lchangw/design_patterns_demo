package decorator.v2;

public class BigTrouserDecorator extends Decorator {

	public void show() {
		System.out.print("��� ");
		person.show();
	}

}
