package adapter.v2;

public class Guard extends Player {

	public Guard(String name) {
		super(name);
	}

	@Override
	void attack() {
		System.out.println("后卫 " + name + " 进攻");
	}

	@Override
	void guard() {
		System.out.println("后卫 " + name + " 进攻");
	}

}
