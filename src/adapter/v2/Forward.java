package adapter.v2;

public class Forward extends Player {

	public Forward(String name) {
		super(name);
	}

	@Override
	void attack() {
		System.out.println("ǰ�� " + name + " ����");
	}

	@Override
	void guard() {
		System.out.println("ǰ�� " + name + " ����");
	}

}
