package adapter.v2;

public class Guard extends Player {

	public Guard(String name) {
		super(name);
	}

	@Override
	void attack() {
		System.out.println("���� " + name + " ����");
	}

	@Override
	void guard() {
		System.out.println("���� " + name + " ����");
	}

}
