package strategy.v3;

/**
 * 折扣收款
 * @author lchan
 * @date 2020年5月4日
 */
public class DiscountCash implements Cash {
	private double discount;
	
	public DiscountCash(double discount) {
		this.discount = discount;
	}

	@Override
	public double acceptCash(double money) {
		System.out.println(", 打折促销， 总计: " + money * discount);
		return money * discount;
	}

}
