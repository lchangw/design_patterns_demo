package flyweight.v1;

public class Client {

	public static void main(String[] args) {
		WebSite w1 = new WebSite("����");
		w1.display();
		
		WebSite w2 = new WebSite("����");
		w2.display();
		
		WebSite w3 = new WebSite("��Ʒչʾ");
		w3.display();
		
		WebSite w4 = new WebSite("��Ʒչʾ");
		w4.display();
	}

}
