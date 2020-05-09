package singleton;

/**
 * ���Ǽ�����Ӱ�����ܣ�ʹ��˫�ؼ��
 * @author lchan
 * @date 2020��5��7��
 */
public class DoubleCheckSingleton {

	private static DoubleCheckSingleton instance;
	private DoubleCheckSingleton() {}
	
	public static DoubleCheckSingleton getInstance() {
		if(instance == null) { //���жϣ��ټ���
			synchronized(new Object()) {
				if(instance == null) { //�ٴ��жϣ���ֹ�������õ�����ǰ���Ѵ�����һ��ʵ�������
					instance = new DoubleCheckSingleton();
				}
			}
		}
		return instance;
	}
}
