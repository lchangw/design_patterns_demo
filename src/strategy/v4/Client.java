package strategy.v4;

import strategy.Discount;
import strategy.v3.DiscountCash;
import strategy.v3.ReturnCash;

/**
 * 使用 策略模式实现
 * 策略模式定义了算法家族，分别封装起来，它们之间可以替换，让算法的变化不会影响到使用算法客户
 * 策略模式的strategy层有助于析取出这些算法的公共功能
 * @author lchan
 * @date 2020年5月4日
 */
public class Client {
	static double totalPrice;

	public static void main(String[] args) {
		CashStrategy strategy;
		strategy = new CashStrategy(new DiscountCash(Discount.EHIGHT));
		totalPrice += strategy.acceptCash(count(20, 5));
		strategy = new CashStrategy(new DiscountCash(Discount.FIVE));
		totalPrice += strategy.acceptCash(count(30, 5));
		strategy = new CashStrategy(new ReturnCash(300, 100));
		totalPrice += strategy.acceptCash(count(30, 10));
		strategy = new CashStrategy(new ReturnCash(500, 300));
		totalPrice += strategy.acceptCash(count(30, 20));
		System.out.println("合计：" + totalPrice);
	}
	
	private static double count(double price, double num) {
		System.out.print("单价：" + price + ", 数量：" + num + ", 总价：" + price * num);
//		totalPrice += price * num; //TODO 这里的计数无效？？？
		return price * num;
	}
}
