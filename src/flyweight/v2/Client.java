package flyweight.v2;

/**
 * 亨元模式 -- 利用共享技术有效的支持大量细粒度的对象
 * 外部状态可在调用时将它们传递过来
 * 
 * 如果一个应用使用了大量的对象，而这些对象的大多数状态可以使用外部状态时，可以考虑使用较少的对象取代很多对象，这就是亨元模式
 * @author lchan
 * @date 2020年5月8日
 */
public class Client {

	public static void main(String[] args) {
		WebSiteFactory factory = new WebSiteFactory();
		WebSite w1 = factory.getWebSite("博客");
		w1.display(new User("lili"));
		
		WebSite w2 = factory.getWebSite("产品展示");
		w2.display(new User("mimi"));
		
		WebSite w3 = factory.getWebSite("博客");
		w3.display(new User("nini"));
		
		System.out.println(factory.count());
	}

}
