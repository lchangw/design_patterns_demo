package singleton;

/**
 * ���Ƕ��߳̿��ܻ��ƻ�����ģʽ������������Ӱ������
 * @author lchan
 * @date 2020��5��7��
 */
public class MultiThreadSingleton {

	private static MultiThreadSingleton instance;
	private MultiThreadSingleton() {}
	
	public static MultiThreadSingleton getInstance() {
		synchronized(new Object()) {
			if(instance == null) {
				instance = new MultiThreadSingleton();
			}
		}
		return instance;
	}
}
