package strategy.v3;

/**
 * �ۿ��տ�
 * @author lchan
 * @date 2020��5��4��
 */
public class DiscountCash implements Cash {
	private double discount;
	
	public DiscountCash(double discount) {
		this.discount = discount;
	}

	@Override
	public double acceptCash(double money) {
		System.out.println(", ���۴����� �ܼ�: " + money * discount);
		return money * discount;
	}

}
