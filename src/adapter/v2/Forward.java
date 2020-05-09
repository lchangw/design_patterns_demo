package adapter.v2;

public class Forward extends Player {

	public Forward(String name) {
		super(name);
	}

	@Override
	void attack() {
		System.out.println("Ç°·æ " + name + " ½ø¹¥");
	}

	@Override
	void guard() {
		System.out.println("Ç°·æ " + name + " ·ÀÊØ");
	}

}
