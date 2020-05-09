package strategy;

/**
 * 做一个商场收银软件，根据客户购买商品的单价和数量，向客户收费
 * @author lchan
 * @date 2020年5月4日
 */
public class CashV1 {

	static double totalPrice;
	
	public static void main(String[] args) {
		count(2, 6);
		count(3, 5);
		System.out.println("合计：" + String.format("%.2f", totalPrice));

	}

	private static void count(double price, double num) {
		System.out.println("单价：" + price + ", 数量：" + num + ", 总价：" + String.format("%.2f", price * num));
		totalPrice += price * num;
	}

}
