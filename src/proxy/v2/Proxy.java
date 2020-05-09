package proxy.v2;

import proxy.v1.SchoolGirl;

public class Proxy implements GiveGift {
	
	private Persuit persuit;
	
	public Proxy(SchoolGirl girl) {
		persuit = new Persuit(girl);
	}

	@Override
	public void giveDolls() {
		persuit.giveDolls();
	}

	@Override
	public void giveChocolate() {
		persuit.giveChocolate();
	}

	@Override
	public void giveFlowers() {
		persuit.giveFlowers();
	}

}
