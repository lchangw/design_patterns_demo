package adapter.v2;

public class Client {

	public static void main(String[] args) {
		Player a = new Forward("�Ʊ�");
		a.attack();
		a.guard();
		
		Player b = new Guard("�ǵ�");
		b.attack();
		b.guard();
		
		Player c = new Translator("Ҧ��");
		c.attack();
		c.guard();
	}

}
