package command.v2;

import command.v1.Barbecuer;

public abstract class Command {

	protected Barbecuer receiver;
	
	public Command(Barbecuer receiver) {
		this.receiver = receiver;
	}
	
	public abstract void execute();
}
