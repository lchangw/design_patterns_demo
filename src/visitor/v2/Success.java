package visitor.v2;

public class Success extends Action {

	@Override
	public void getManConclusion(Person person) {
		System.out.println(person.name + name + "时，背后多半有一个伟大的女人");
	}

	@Override
	public void getWomanConclusion(Person person) {
		System.out.println(person.name + name + "时，背后多半有一个不成功的男人");
	}

}
