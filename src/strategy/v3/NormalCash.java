package strategy.v3;

/**
 * �����տ�
 * @author lchan
 * @date 2020��5��4��
 */
public class NormalCash implements Cash {

	@Override
	public double acceptCash(double money) {
		System.out.println(", �����շѣ� �ܼ�: " + money);
		return money;
	}

}
