package visitor.v2;

public class Love extends Action {

	@Override
	public void getManConclusion(Person person) {
		System.out.println(person.name + name + "ʱ�����ǲ���ҲҪװ��");
	}

	@Override
	public void getWomanConclusion(Person person) {
		System.out.println(person.name + name + "ʱ�����¶�Ҳװ������");
	}

}
