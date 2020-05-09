package builder.v2;

import builder.v1.Person;

public class PersonThinBuilder implements PersonBuilder {

	Person p = new Person();
	@Override
	public void buildHead() {
		p.setHeadSize(10);
	}

	@Override
	public void buildBody() {
		p.setBodySize(180);
	}

	@Override
	public void buildArm() {
		p.setArmSize(70);
	}

	@Override
	public void buildLeg() {
		p.setLegSize(100);
	}
	
	public Person getPerson() {
		return p;
	}

}
