package visitor.v1;

public class Man extends Person {

	@Override
	public void getConclusion() {
		if("�ɹ�".equals(action)) {
			System.out.println(name + action + "ʱ����������һ��ΰ���Ů��");
		}else if("ʧ��".equals(action)) {
			System.out.println(name + action + "ʱ����ͷ�Ⱦƣ�˭Ҳ����Ȱ");
		}else if("����".equals(action)) {
			System.out.println(name + action + "ʱ�����ǲ���ҲҪװ��");
		}
	}

}
