package strategy;

/**
 * ��һ���̳�������������ݿͻ�������Ʒ�ĵ��ۺ���������ͻ��շ�
 * ���Ӵ���ҵ��
 * @author lchan
 * @date 2020��5��4��
 */
public class CashV2 {

	static double totalPrice;
	
	public static void main(String[] args) {
		count(2, 6, Discount.FIVE);
		count(3, 5, Discount.EHIGHT);
		System.out.println("�ϼƣ�" + String.format("%.2f", totalPrice));

	}

	private static void count(double price, double num, double dis) {
		System.out.println("���ۣ�" + price + ", ������" + num + ", ���ۣ�" + dis + ", �ܼۣ�" + String.format("%.2f", price * num * dis));
		totalPrice += price * num;
	}

}

