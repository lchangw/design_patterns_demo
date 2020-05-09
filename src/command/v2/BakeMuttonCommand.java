package command.v2;

import command.v1.Barbecuer;

public class BakeMuttonCommand extends Command {

	public BakeMuttonCommand(Barbecuer receiver) {
		super(receiver);
	}

	@Override
	public void execute() {
		receiver.bakeMutton();
	}

	public String toString() {
		return "øæ—Ú»‚¥Æ";
	}
}
