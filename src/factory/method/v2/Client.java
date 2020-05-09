package factory.method.v2;

import factory.method.v1.LeiFeng;

/**
 * 工厂方法模式克服了简单工厂违背开放-封闭原则的缺点，但是保持了封装对象创建过程的优点
 * @author lchan
 * @date 2020年5月6日
 */
public class Client {
	public static void main(String[] args) {
		LeiFengFactory factory = new UndergraduateFactory();
		LeiFeng lei = factory.createLeiFeng();
		lei.buyRice();
		lei.sweep();
		lei.wash();
	}
}
