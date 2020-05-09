package iterator.v1;

/**
 * ������ģʽ -- �ṩһ�ַ���˳�����һ���ۺ϶����и���Ԫ�أ����ֲ���¶�ö�����ڲ���ʾ
 * 
 * ���ָ߼����Զ��������˷�װ������ģʽ����������
 * @author lchan
 * @date 2020��5��7��
 */
public class Client {

	public static void main(String[] args) {
		ConcreteAggregate a = new ConcreteAggregate();
		a.put(0, "lili");
		a.put(1, "mimi");
		a.put(2, "nini");
		Iterator i = new ConcreteIterator(a);
		Object item = i.first();
		while(!i.isDone()) {
			System.out.println(i.currentItem() + "����Ʊ");
			i.next();
		}
	}

}
