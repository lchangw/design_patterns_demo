package visitor.v2;

public class Love extends Action {

	@Override
	public void getManConclusion(Person person) {
		System.out.println(person.name + name + "时，凡是不懂也要装懂");
	}

	@Override
	public void getWomanConclusion(Person person) {
		System.out.println(person.name + name + "时，遇事懂也装作不懂");
	}

}
