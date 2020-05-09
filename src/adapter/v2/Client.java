package adapter.v2;

public class Client {

	public static void main(String[] args) {
		Player a = new Forward("¿Æ±È");
		a.attack();
		a.guard();
		
		Player b = new Guard("ÇÇµ¤");
		b.attack();
		b.guard();
		
		Player c = new Translator("Ò¦Ã÷");
		c.attack();
		c.guard();
	}

}
