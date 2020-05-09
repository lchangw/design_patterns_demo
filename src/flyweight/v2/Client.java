package flyweight.v2;

/**
 * ��Ԫģʽ -- ���ù�������Ч��֧�ִ���ϸ���ȵĶ���
 * �ⲿ״̬���ڵ���ʱ�����Ǵ��ݹ���
 * 
 * ���һ��Ӧ��ʹ���˴����Ķ��󣬶���Щ����Ĵ����״̬����ʹ���ⲿ״̬ʱ�����Կ���ʹ�ý��ٵĶ���ȡ���ܶ��������Ǻ�Ԫģʽ
 * @author lchan
 * @date 2020��5��8��
 */
public class Client {

	public static void main(String[] args) {
		WebSiteFactory factory = new WebSiteFactory();
		WebSite w1 = factory.getWebSite("����");
		w1.display(new User("lili"));
		
		WebSite w2 = factory.getWebSite("��Ʒչʾ");
		w2.display(new User("mimi"));
		
		WebSite w3 = factory.getWebSite("����");
		w3.display(new User("nini"));
		
		System.out.println(factory.count());
	}

}
