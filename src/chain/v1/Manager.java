package chain.v1;

public class Manager {

	protected String name;
	public Manager(String name) {
		this.name = name;
	}
	
	public void getResult(String level, Request request) {
		if("����".equals(level)) {
			if("���".equals(request.getType()) && request.getNum() < 2) {
				System.out.println(name + ": " + request.getContent() + "���" + request.getNum() + "�죬����׼");
			}else {
				System.out.println(name + ": " + request.getContent() + "���" + request.getNum() + "�죬��Ȩ����");
			}
		}else if("�ܼ�".equals(level)) {
			if("���".equals(request.getType()) && request.getNum() < 5) {
				System.out.println(name + ": " + request.getContent() + "���" + request.getNum() + "�죬����׼");
			}else {
				System.out.println(name + ": " + request.getContent() + "���" + request.getNum() + "�죬��Ȩ����");
			}
		}else if("�ܾ���".equals(level)) {
			if("���".equals(request.getType())) {
				System.out.println(name + ": " + request.getContent() + "���" + request.getNum() + "�죬����׼");
			}
		}
	}
}
