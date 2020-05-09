package singleton;

/**
 * 在加载类时就将自己实例化，可称之为饿汉式单例，之前的则是在第一次引用时才被实例化，为懒汉式单例
 * @author lchan
 * @date 2020年5月7日
 */
public class StaticSingleton {
	private static final StaticSingleton instance = new StaticSingleton();
	private StaticSingleton() {}
	public static StaticSingleton getInstance() {
		return instance;
	}
}
