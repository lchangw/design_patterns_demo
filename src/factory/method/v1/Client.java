package factory.method.v1;

/**
 * ��������ģʽ -- ����һ�������ӿڣ����ӹ��������ʵ������һ����
 * v1�汾��ʹ�ü򵥹���ʾ��
 * @author lchan
 * @date 2020��5��5��
 */
public class Client {
	public static void main(String[] args) {
		LeiFeng lei = LeiFengFactory.createLeiFeng("volunteer");
		lei.buyRice();
		lei.sweep();
		lei.wash();
	}
}
