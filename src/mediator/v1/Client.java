package mediator.v1;

/**
 * �н���ģʽ -- ��һ���н��������װһϵ�еĶ��󽻻���ʹ�ø���������ʽ���໥���ã���ɢ�����
 * ���㣺�н�����Ҫֱ�����еĽ������󣬰ѽ����ĸ����Ա�����н��ߵĸ�����
 * һ��Ӧ����һ������Զ������õ��Ǹ���ͨ�ŵĳ���
 * ��ϵͳ�г��֡���Զࡱ�������ӵĶ���Ⱥʱ����Ҫ����ʹ���н���ģʽ��Ҫ�ȷ�˼ϵͳ��ƺϲ�����
 * @author lchan
 * @date 2020��5��8��
 */
public class Client {

	public static void main(String[] args) {
		ConcreteMediator mediator = new ConcreteMediator();
		Colleuage1 c1 = new Colleuage1(mediator);
		Colleuage2 c2 = new Colleuage2(mediator);
		
		mediator.setC1(c1);
		mediator.setC2(c2);
		
		c1.send("���ɶ");
		c2.send("����զ��");
	}

}
