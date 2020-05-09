package visitor.v2;

public abstract class Person {
	protected String name;
	public abstract void accept(Action action);
}
