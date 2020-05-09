package builder.v2;

public class PersonDirector {

	private PersonBuilder pb;
	public PersonDirector(PersonBuilder pb) {
		this.pb = pb;
	}
	
	public void createPerson() {
		pb.buildHead();
		pb.buildBody();
		pb.buildArm();
		pb.buildLeg();
	}
}
