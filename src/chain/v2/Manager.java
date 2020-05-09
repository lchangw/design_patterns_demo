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
			System.out.println(name + ": " + request.getName() + "请假" + request.getNum() + "天，被批准");
		}else {
			if(level == Constants.LEVEL_MAX) {
				System.out.println(name + ": " + request.getName() + "请假" + request.getNum() + "天，不予批准");
			}else {
				System.out.println(name + ": " + request.getName() + "请假" + request.getNum() + "天，无权处理");
				Manager m = new Manager(Constants.getName(level+1), level+1);
				m.getResult(request);
			}
		}
	}
}
