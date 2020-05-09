package adapter.v2;

public class Translator extends Player {

	private ForeignCenter wj = new ForeignCenter();
	
	public Translator(String name) {
		super(name);
		wj.setName(name);
	}

	@Override
	void attack() {
		wj.½ø¹¥();
	}

	@Override
	void guard() {
		wj.·ÀÎÀ();
	}

}
