package visitor.v2;

public class Success extends Action {

	@Override
	public void getManConclusion(Person person) {
		System.out.println(person.name + name + "ʱ����������һ��ΰ���Ů��");
	}

	@Override
	public void getWomanConclusion(Person person) {
		System.out.println(person.name + name + "ʱ����������һ�����ɹ�������");
	}

}
