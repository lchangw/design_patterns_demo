package flyweight.v1;

public class WebSite {

	private String name;
	
	public WebSite(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.println("ÍøÕ¾·ÖÀà£º" + name);
	}
}
