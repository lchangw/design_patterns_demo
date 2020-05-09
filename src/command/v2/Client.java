package command.v2;

import command.v1.Barbecuer;

/**
 * 命令模式 -- 将一个请求封装成一个 对象，可用不同的请求对客户进行参数化、对请求排队或记录请求日志，以及支持可撤销的操作
 * @author lchan
 * @date 2020年5月8日
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
