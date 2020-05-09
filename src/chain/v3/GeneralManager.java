package chain.v3;

import chain.v2.Request;

public class GeneralManager extends Manager {

	public GeneralManager(String name) {
		super(name);
	}

	@Override
	public void request(Request request) {
		if(request.getNum() < 10) {
			System.out.println(name + ": " + request.getName() + "请假" + request.getNum() + "天，被批准");
		}else {
			if(superior != null) {
				superior.request(request);
			}
		}
	}

}
