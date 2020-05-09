package flyweight.v1;

public class Client {

	public static void main(String[] args) {
		WebSite w1 = new WebSite("博客");
		w1.display();
		
		WebSite w2 = new WebSite("博客");
		w2.display();
		
		WebSite w3 = new WebSite("产品展示");
		w3.display();
		
		WebSite w4 = new WebSite("产品展示");
		w4.display();
	}

}
