package builder.v1;

public class PersonThinBuilder {
	
	public Person build() {
		Person p = new Person();
		p.setHeadSize(10);
		p.setBodySize(180);
		p.setArmSize(70);
		p.setLegSize(100);
		return p;
	}
}
