package adapter.v1;

/**
 * ������ģʽ -- ��һ����Ľӿ�ת��Ϊ�ͻ�ϣ������һ���ӿ�
 * ʹ��ԭ�����ڽӿڲ����ݶ�����һ�����������һ����
 * @author lchan
 * @date 2020��5��7��
 */
public class Client {

	public static void main(String[] args) {
		Target target = new Adapter();
		target.request();
	}

}
