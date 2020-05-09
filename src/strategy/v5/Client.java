package strategy.v5;

/**
 * 策略模式与简单工厂融合
 * 选择策略实现的功能由客户端转移到了Strategy层，但若要增加一种算法，仍需修改Strategy层，这可以利用反射技术解决，在抽象工厂模式中有讲解
 * @author lchan
 * @date 2020年5月4日
 */
public class Client {

	public static void main(String[] args) {
		double totalPrice = 0;
		CashStrategy strategy;
		strategy = new CashStrategy("discount");
		totalPrice += strategy.acceptCash(count(20, 5));
		strategy = new CashStrategy("return");
		totalPrice += strategy.acceptCash(count(30, 10));
		System.out.println("合计：" + totalPrice);
	}
	private static double count(double price, double num) {
		System.out.print("单价：" + price + ", 数量：" + num + ", 总价：" + price * num);
		return price * num;
	}

}
