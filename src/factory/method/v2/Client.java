package factory.method.v2;

import factory.method.v1.LeiFeng;

/**
 * ��������ģʽ�˷��˼򵥹���Υ������-���ԭ���ȱ�㣬���Ǳ����˷�װ���󴴽����̵��ŵ�
 * @author lchan
 * @date 2020��5��6��
 */
public class Client {
	public static void main(String[] args) {
		LeiFengFactory factory = new UndergraduateFactory();
		LeiFeng lei = factory.createLeiFeng();
		lei.buyRice();
		lei.sweep();
		lei.wash();
	}
}
