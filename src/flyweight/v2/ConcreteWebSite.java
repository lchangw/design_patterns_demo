package flyweight.v2;

public class ConcreteWebSite implements WebSite {

	private String name;
	
	public ConcreteWebSite(String name) {
		this.name = name;
	}
	
	@Override
	public void display(User user) {
		System.out.println("网站分类：" + name + " 用户：" + user.getName());
	}

}
