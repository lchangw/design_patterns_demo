package builder.v2;

import builder.v1.Person;

public interface PersonBuilder {

	void buildHead();
	void buildBody();
	void buildArm();
	void buildLeg();
	Person getPerson();
}
