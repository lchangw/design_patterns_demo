package visitor.v1;

public class Woman extends Person {

	@Override
	public void getConclusion() {
		if("�ɹ�".equals(action)) {
			System.out.println(name + action + "ʱ����������һ�����ɹ�������");
		}else if("ʧ��".equals(action)) {
			System.out.println(name + action + "ʱ������������˭ҲȰ����");
		}else if("����".equals(action)) {
			System.out.println(name + action + "ʱ�����¶�Ҳװ������");
		}
	}

}
