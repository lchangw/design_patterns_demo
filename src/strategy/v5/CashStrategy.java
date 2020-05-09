package strategy.v5;

import strategy.v3.Cash;
import strategy.v3.CashFactory;

/**
 * ����ģʽ��򵥹����ں�
 * @author lchan
 * @date 2020��5��4��
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
