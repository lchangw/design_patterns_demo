package strategy.v3;

import strategy.Discount;

/**
 * 收款工厂类
 * @author lchan
 * @date 2020年5月4日
 */
public class CashFactory {
	public static Cash createCash(String type) {
		Cash cash = null;
		switch(type) {
			case "normal": cash = new NormalCash(); break; //TODO 记得break，否则直到最后一个
			case "discount": cash = new DiscountCash(Discount.EHIGHT); break;
			case "return": cash = new ReturnCash(300, 100); break;
		}
		return cash;
	}
}
