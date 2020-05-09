package singleton;

/**
 * �ڼ�����ʱ�ͽ��Լ�ʵ�������ɳ�֮Ϊ����ʽ������֮ǰ�������ڵ�һ������ʱ�ű�ʵ������Ϊ����ʽ����
 * @author lchan
 * @date 2020��5��7��
 */
public class StaticSingleton {
	private static final StaticSingleton instance = new StaticSingleton();
	private StaticSingleton() {}
	public static StaticSingleton getInstance() {
		return instance;
	}
}
