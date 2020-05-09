package strategy.v4;

import strategy.v3.Cash;

public class CashStrategy {
	
	Cash cash;

	public CashStrategy(Cash cash) {
		this.cash = cash;
	}
	
	public double acceptCash(double money) {
		return cash.acceptCash(money);
	}
}
