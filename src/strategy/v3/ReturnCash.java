package strategy.v3;

/**
 * ���������տ�
 * @author lchan
 * @date 2020��5��4��
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
		System.out.println(", ���������� �ܼ�: " + totalMoney);
		return totalMoney;
	}

}
