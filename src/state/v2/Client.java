package state.v2;

/**
 * ״̬ģʽ -- ��һ�����������״̬�ı�ʱ������ı�����Ϊ
 * ������һ�������״̬ת�������������ڸ���ʱ����״̬���ж��߼�ת�Ƶ���ʾ��ͬ״̬��һϵ��������
 * @author lchan
 * @date 2020��5��7��
 */
public class Client {

	public static void main(String[] args) {
		Context c = new Context(new StateA());
		c.setHour(9);
		c.request();
		c.setHour(10);
		c.request();
		c.setHour(12);
		c.request();
		c.setHour(13);
		c.request();
		c.setHour(14);
		c.request();
		c.setHour(17);
		c.request();
		c.setHour(19);
		c.request();
		c.setHour(21);
		c.request();
		c.setHour(22);
		c.request();
	}

}
