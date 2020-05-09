package builder.v1;

public class PersonFatBuilder {
	
	public Person build() {
		Person p = new Person();
		p.setHeadSize(20);
		p.setBodySize(180);
		p.setArmSize(70);
		p.setLegSize(100);
		return p;
	}
}
