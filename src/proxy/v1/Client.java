package proxy.v1;

public class Client {

	public static void main(String[] args) {
		SchoolGirl girl = new SchoolGirl();
		girl.setName("mm");
		Persuit persuit = new Persuit(girl);
		persuit.giveChocolate();
		persuit.giveDolls();
		persuit.giveFlowers();
	}

}
