package factory.method.v1;

/**
 * 工厂方法模式 -- 定义一个工厂接口，让子工厂类决定实例化哪一个类
 * v1版本先使用简单工厂示例
 * @author lchan
 * @date 2020年5月5日
 */
public class Client {
	public static void main(String[] args) {
		LeiFeng lei = LeiFengFactory.createLeiFeng("volunteer");
		lei.buyRice();
		lei.sweep();
		lei.wash();
	}
}
