package visitor.v2;

public abstract class Action {
	protected String name;
	public abstract void getManConclusion(Person person);
	public abstract void getWomanConclusion(Person person);
}
