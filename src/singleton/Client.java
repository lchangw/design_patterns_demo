package singleton;

/**
 * ����ģʽ -- ��֤һ����ֻ��һ��ʵ�������ṩһ����������ȫ�ַ��ʵ�
 * @author lchan
 * @date 2020��5��7��
 */
public class Client {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println(s1 == s2);
	}

}
