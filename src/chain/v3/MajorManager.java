package chain.v3;

import chain.v2.Request;

public class MajorManager extends Manager {

	public MajorManager(String name) {
		super(name);
	}

	@Override
	public void request(Request request) {
		if(request.getNum() < 5) {
			System.out.println(name + ": " + request.getName() + "���" + request.getNum() + "�죬����׼");
		}else {
			if(superior != null) {
				superior.request(request);
			}
		}
	}

}
