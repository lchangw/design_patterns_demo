package factory.method.v2;

import factory.method.v1.LeiFeng;
import factory.method.v1.Volunteer;

public class VolunteerFactory implements LeiFengFactory {

	@Override
	public LeiFeng createLeiFeng() {
		return new Volunteer();
	}

}
