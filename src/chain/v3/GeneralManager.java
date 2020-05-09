package chain.v3;

import chain.v2.Request;

public class GeneralManager extends Manager {

	public GeneralManager(String name) {
		super(name);
	}

	@Override
	public void request(Request request) {
		if(request.getNum() < 10) {
			System.out.println(name + ": " + request.getName() + "���" + request.getNum() + "�죬����׼");
		}else {
			if(superior != null) {
				superior.request(request);
			}
		}
	}

}
