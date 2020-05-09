package singleton;

/**
 * 考虑加锁会影响性能，使用双重检查
 * @author lchan
 * @date 2020年5月7日
 */
public class DoubleCheckSingleton {

	private static DoubleCheckSingleton instance;
	private DoubleCheckSingleton() {}
	
	public static DoubleCheckSingleton getInstance() {
		if(instance == null) { //先判断，再加锁
			synchronized(new Object()) {
				if(instance == null) { //再次判断，防止后来者拿到锁后，前者已创建了一个实例的情况
					instance = new DoubleCheckSingleton();
				}
			}
		}
		return instance;
	}
}
