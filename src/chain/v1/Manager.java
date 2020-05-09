package chain.v1;

public class Manager {

	protected String name;
	public Manager(String name) {
		this.name = name;
	}
	
	public void getResult(String level, Request request) {
		if("经理".equals(level)) {
			if("请假".equals(request.getType()) && request.getNum() < 2) {
				System.out.println(name + ": " + request.getContent() + "请假" + request.getNum() + "天，被批准");
			}else {
				System.out.println(name + ": " + request.getContent() + "请假" + request.getNum() + "天，无权处理");
			}
		}else if("总监".equals(level)) {
			if("请假".equals(request.getType()) && request.getNum() < 5) {
				System.out.println(name + ": " + request.getContent() + "请假" + request.getNum() + "天，被批准");
			}else {
				System.out.println(name + ": " + request.getContent() + "请假" + request.getNum() + "天，无权处理");
			}
		}else if("总经理".equals(level)) {
			if("请假".equals(request.getType())) {
				System.out.println(name + ": " + request.getContent() + "请假" + request.getNum() + "天，被批准");
			}
		}
	}
}
