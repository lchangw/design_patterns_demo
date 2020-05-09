package strategy.v3;

/**
 * ���Ӵ�������ҵ�������ü򵥹���ģʽʵ��
 * ��������̣�������Խ��Խ�ã���Ļ�����Ϊ�˷�װ��������Ļ����ǳ��󣬾�����ͬ���Ժ͹��ܵĳ��󼯺ϲ�����
 * ���Ҫ��5����ô�죿
 * ���Ҫ��500��200��ô�죿
 * �򵥹�����ȱ�����ڹ���ְ����أ���������չ���ӵĲ�Ʒ�ṹ������㷨�ľ����䶯��Ӧ�и��õĽ���취(���ģʽ)
 * @author lchan
 * @date 2020��5��4��
 */
public class Client {
	static double totalPrice = 0;

	public static void main(String[] args) {
		Cash cash = CashFactory.createCash("discount");
		totalPrice += cash.acceptCash(count(20, 5));
		totalPrice += cash.acceptCash(count(30, 20));
		System.out.println("�ϼƣ�" + totalPrice);
	}
	
	private static double count(double price, double num) {
		System.out.print("���ۣ�" + price + ", ������" + num + ", �ܼۣ�" + price * num);
//		totalPrice += price * num; TODO �޸ĳ�Ա����Ϊ����Ч������
		return price * num;
	}

}
