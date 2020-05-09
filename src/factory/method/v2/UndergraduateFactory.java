package factory.method.v2;

import factory.method.v1.LeiFeng;
import factory.method.v1.Undergraduate;

public class UndergraduateFactory implements LeiFengFactory {

	@Override
	public LeiFeng createLeiFeng() {
		return new Undergraduate();
	}

}
