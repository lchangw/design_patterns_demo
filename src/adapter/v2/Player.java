package adapter.v2;

public abstract class Player {
	protected String name;
	public Player(String name) {
		this.name = name;
	}
	abstract void attack();
	abstract void guard();
}
