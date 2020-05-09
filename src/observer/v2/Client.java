package observer.v2;

/**
 * �ֽз�������ģʽ��������һ��һ�Զ��������ϵ���ö���۲��߶���ͬʱ����ĳһ���������
 * �����������ڼ�������״̬�仯ʱ����֪ͨ���й۲��߶���ʹ�����ܹ��Զ������Լ�
 * 
 * ��һ������ı����Ҫͬʱ������������ʱ�򣬿���ʹ�ù۲���ģʽ
 * 
 * ���㣺��������������תԭ�򣬵���"����ͳ����"��������"����۲���"����һû���˳���۲��������Ľӿڣ���֪ͨ���ܾ��겻����
 * ���⣬����ÿ���۲��ߵķ�����һ������"update"�����֪ͨ�ߺ͹۲��߱��ͻ��಻֪�����ɿͻ�����������֪ͨ˭���ͺ���
 * @author lchan
 * @date 2020��5��7��
 */
public class Client {

	public static void main(String[] args) {
		Subject sub = new Secretary();
		Observer o1 = new StockObserver("lili", sub);
		Observer n1 = new NBAObserver("mimi", sub);
		sub.add(o1);
		sub.add(n1);
		sub.remove(n1);
		sub.setAction("�ϰ�����ˣ�");
		sub.notifyObservers();
	}

}
