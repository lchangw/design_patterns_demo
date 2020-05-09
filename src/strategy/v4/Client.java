package strategy.v4;

import strategy.Discount;
import strategy.v3.DiscountCash;
import strategy.v3.ReturnCash;

/**
 * ʹ�� ����ģʽʵ��
 * ����ģʽ�������㷨���壬�ֱ��װ����������֮������滻�����㷨�ı仯����Ӱ�쵽ʹ���㷨�ͻ�
 * ����ģʽ��strategy����������ȡ����Щ�㷨�Ĺ�������
 * @author lchan
 * @date 2020��5��4��
 */
public class Client {
	static double totalPrice;

	public static void main(String[] args) {
		CashStrategy strategy;
		strategy = new CashStrategy(new DiscountCash(Discount.EHIGHT));
		totalPrice += strategy.acceptCash(count(20, 5));
		strategy = new CashStrategy(new DiscountCash(Discount.FIVE));
		totalPrice += strategy.acceptCash(count(30, 5));
		strategy = new CashStrategy(new ReturnCash(300, 100));
		totalPrice += strategy.acceptCash(count(30, 10));
		strategy = new CashStrategy(new ReturnCash(500, 300));
		totalPrice += strategy.acceptCash(count(30, 20));
		System.out.println("�ϼƣ�" + totalPrice);
	}
	
	private static double count(double price, double num) {
		System.out.print("���ۣ�" + price + ", ������" + num + ", �ܼۣ�" + price * num);
//		totalPrice += price * num; //TODO ����ļ�����Ч������
		return price * num;
	}
}
