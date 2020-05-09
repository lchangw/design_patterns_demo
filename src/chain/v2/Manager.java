package chain.v2;

public class Manager {

	private String name;
	private int level;
	public Manager(String name, int level) {
		this.name = name;
		this.level = level;
	}
	
	public void getResult(Request request) {
		if(request.getNum() < Constants.getDays(level)) {
			System.out.println(name + ": " + request.getName() + "���" + request.getNum() + "�죬����׼");
		}else {
			if(level == Constants.LEVEL_MAX) {
				System.out.println(name + ": " + request.getName() + "���" + request.getNum() + "�죬������׼");
			}else {
				System.out.println(name + ": " + request.getName() + "���" + request.getNum() + "�죬��Ȩ����");
				Manager m = new Manager(Constants.getName(level+1), level+1);
				m.getResult(request);
			}
		}
	}
}
