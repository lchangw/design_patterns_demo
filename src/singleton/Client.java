package singleton;

/**
 * 单例模式 -- 保证一个类只有一个实例，且提供一个访问它的全局访问点
 * @author lchan
 * @date 2020年5月7日
 */
public class Client {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println(s1 == s2);
	}

}
