package command.v2;

import command.v1.Barbecuer;

/**
 * ����ģʽ -- ��һ�������װ��һ�� ���󣬿��ò�ͬ������Կͻ����в��������������Ŷӻ��¼������־���Լ�֧�ֿɳ����Ĳ���
 * @author lchan
 * @date 2020��5��8��
 */
public class Client {

	public static void main(String[] args) {
		
		Barbecuer bar = new Barbecuer();
		Command bakeMutton1 = new BakeMuttonCommand(bar);
		Command bakeChickenWing1 = new BakeChickenWingCommand(bar);
		Waiter waiter = new Waiter();
		
		waiter.setOrder(bakeMutton1);
		waiter.Notify();
		waiter.setOrder(bakeChickenWing1);
		waiter.Notify();
	}

}
