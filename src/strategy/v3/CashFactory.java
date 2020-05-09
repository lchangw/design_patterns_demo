package strategy.v3;

import strategy.Discount;

/**
 * �տ����
 * @author lchan
 * @date 2020��5��4��
 */
public class CashFactory {
	public static Cash createCash(String type) {
		Cash cash = null;
		switch(type) {
			case "normal": cash = new NormalCash(); break; //TODO �ǵ�break������ֱ�����һ��
			case "discount": cash = new DiscountCash(Discount.EHIGHT); break;
			case "return": cash = new ReturnCash(300, 100); break;
		}
		return cash;
	}
}
