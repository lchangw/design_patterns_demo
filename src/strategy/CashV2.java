package strategy;

/**
 * 做一个商场收银软件，根据客户购买商品的单价和数量，向客户收费
 * 增加打折业务
 * @author lchan
 * @date 2020年5月4日
 */
public class CashV2 {

	static double totalPrice;
	
	public static void main(String[] args) {
		count(2, 6, Discount.FIVE);
		count(3, 5, Discount.EHIGHT);
		System.out.println("合计：" + String.format("%.2f", totalPrice));

	}

	private static void count(double price, double num, double dis) {
		System.out.println("单价：" + price + ", 数量：" + num + ", 打折：" + dis + ", 总价：" + String.format("%.2f", price * num * dis));
		totalPrice += price * num;
	}

}

