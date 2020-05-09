package command.v3;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import command.v2.BakeChickenWingCommand;
import command.v2.Command;
import util.DateUtil;

public class Waiter {

	private List<Command> orders = new ArrayList<Command>();
	
	public void setOrder(Command command) {
		if(command instanceof BakeChickenWingCommand) {
			System.out.println("����Ա������û���ˣ�������տ�" + " ʱ�䣺" + DateUtil.datetime(new Date()));
		}else {
			orders.add(command);
			System.out.println("���Ӷ�����" + command.toString() + " ʱ�䣺" + DateUtil.datetime(Calendar.getInstance().getTime()));
		}
	}
	
	public void cancelOrder(Command command) {
		if(orders.remove(command)) {
			System.out.println("ȡ��������" + command.toString() + " ʱ�䣺" + DateUtil.datetime(new Date()));
		}else {
			System.out.println("ȡ������ʧ�ܣ�" + command.toString() + " ʱ�䣺" + DateUtil.datetime(new Date()));
		}
	}
	
	public void Notify() {
		for(Command c : orders) {
			c.execute();
			orders.remove(c);
		}
	}
}
