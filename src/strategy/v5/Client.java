package strategy.v5;

/**
 * ����ģʽ��򵥹����ں�
 * ѡ�����ʵ�ֵĹ����ɿͻ���ת�Ƶ���Strategy�㣬����Ҫ����һ���㷨�������޸�Strategy�㣬��������÷��似��������ڳ��󹤳�ģʽ���н���
 * @author lchan
 * @date 2020��5��4��
 */
public class Client {

	public static void main(String[] args) {
		double totalPrice = 0;
		CashStrategy strategy;
		strategy = new CashStrategy("discount");
		totalPrice += strategy.acceptCash(count(20, 5));
		strategy = new CashStrategy("return");
		totalPrice += strategy.acceptCash(count(30, 10));
		System.out.println("�ϼƣ�" + totalPrice);
	}
	private static double count(double price, double num) {
		System.out.print("���ۣ�" + price + ", ������" + num + ", �ܼۣ�" + price * num);
		return price * num;
	}

}
