package strategy.v3;

/**
 * 正常收款
 * @author lchan
 * @date 2020年5月4日
 */
public class NormalCash implements Cash {

	@Override
	public double acceptCash(double money) {
		System.out.println(", 正常收费， 总计: " + money);
		return money;
	}

}
