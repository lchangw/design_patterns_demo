package strategy.v3;

/**
 * 增加促销返利业务，这里用简单工厂模式实现
 * 面向对象编程，不是类越多越好，类的划分是为了封装，但分类的基础是抽象，具有相同属性和功能的抽象集合才是类
 * 如果要打5折怎么办？
 * 如果要满500返200怎么办？
 * 简单工厂的缺点在于工厂职责过重，不易于扩展复杂的产品结构，面对算法的经常变动，应有更好的解决办法(设计模式)
 * @author lchan
 * @date 2020年5月4日
 */
public class Client {
	static double totalPrice = 0;

	public static void main(String[] args) {
		Cash cash = CashFactory.createCash("discount");
		totalPrice += cash.acceptCash(count(20, 5));
		totalPrice += cash.acceptCash(count(30, 20));
		System.out.println("合计：" + totalPrice);
	}
	
	private static double count(double price, double num) {
		System.out.print("单价：" + price + ", 数量：" + num + ", 总价：" + price * num);
//		totalPrice += price * num; TODO 修改成员变量为何无效？？？
		return price * num;
	}

}
