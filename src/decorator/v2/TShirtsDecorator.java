package decorator.v2;

public class TShirtsDecorator extends Decorator {
	public void show() {
		System.out.print("T�� ");
		person.show();
	}
}
