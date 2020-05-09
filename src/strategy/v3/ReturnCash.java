package strategy.v3;

/**
 * 促销返现收款
 * @author lchan
 * @date 2020年5月4日
 */
public class ReturnCash implements Cash {
	private double conditionMoney;
	private double returnMoney;

	public ReturnCash(double conditionMoney, double returnMoney) {
		this.conditionMoney = conditionMoney;
		this.returnMoney = returnMoney;
	}

	@Override
	public double acceptCash(double money) {
		double totalMoney = 0;
		if(money >= conditionMoney) totalMoney = money - returnMoney;
		else totalMoney = money;
		System.out.println(", 返利促销， 总计: " + totalMoney);
		return totalMoney;
	}

}
