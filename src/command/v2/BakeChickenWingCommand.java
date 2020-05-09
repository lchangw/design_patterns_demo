package command.v2;

import command.v1.Barbecuer;

public class BakeChickenWingCommand extends Command {

	public BakeChickenWingCommand(Barbecuer receiver) {
		super(receiver);
	}

	@Override
	public void execute() {
		receiver.bakeChickenWing();
	}

	public String toString() {
		return "¿¾¼¦³á";
	}
}
