package command.v3;

import command.v1.Barbecuer;
import command.v2.BakeChickenWingCommand;
import command.v2.BakeMuttonCommand;
import command.v2.Command;

public class Client {

	public static void main(String[] args) {
		Barbecuer bar = new Barbecuer();
		Command bakeMutton1 = new BakeMuttonCommand(bar);
		Command bakeChickenWing1 = new BakeChickenWingCommand(bar);
		Waiter waiter = new Waiter();
		
		waiter.setOrder(bakeMutton1);
		waiter.setOrder(bakeChickenWing1);
		waiter.cancelOrder(bakeChickenWing1);
		waiter.Notify();
	}

}
