package strategy.v5;

import strategy.v3.Cash;
import strategy.v3.CashFactory;

/**
 * 策略模式与简单工厂融合
 * @author lchan
 * @date 2020年5月4日
 */
public class CashStrategy {
	
	Cash cash;

	public CashStrategy(String type) {
		cash = CashFactory.createCash(type);
	}
	
	public double acceptCash(double money) {
		return cash.acceptCash(money);
	}
}
