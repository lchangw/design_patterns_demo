package strategy;

/**
 * ��һ���̳�������������ݿͻ�������Ʒ�ĵ��ۺ���������ͻ��շ�
 * @author lchan
 * @date 2020��5��4��
 */
public class CashV1 {

	static double totalPrice;
	
	public static void main(String[] args) {
		count(2, 6);
		count(3, 5);
		System.out.println("�ϼƣ�" + String.format("%.2f", totalPrice));

	}

	private static void count(double price, double num) {
		System.out.println("���ۣ�" + price + ", ������" + num + ", �ܼۣ�" + String.format("%.2f", price * num));
		totalPrice += price * num;
	}

}
