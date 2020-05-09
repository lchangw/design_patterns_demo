package singleton;

/**
 * 考虑多线程可能会破坏单例模式，加锁，但会影响性能
 * @author lchan
 * @date 2020年5月7日
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
