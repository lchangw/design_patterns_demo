package chain.v3;

import chain.v2.Request;

public class CommonManager extends Manager {

	public CommonManager(String name) {
		super(name);
	}

	@Override
	public void request(Request request) {
		if(request.getNum() < 2) {
			System.out.println(name + ": " + request.getName() + "请假" + request.getNum() + "天，被批准");
		}else {
			if(superior != null) {
				superior.request(request);
			}
		}
	}

}
