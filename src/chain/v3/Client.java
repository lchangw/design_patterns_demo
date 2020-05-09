package chain.v3;

import chain.v2.Request;

/**
 * 职责链 -- 多个对象都有机会处理请求，将这些对象连成一条链，并沿着这条链传递该请求 ，直到有一个对象处理该请求为止
 * 每个对象仅需保持一个其后继处理对象的引用，避免请求者和处理者之间的耦合关系
 * 可以随时增加或修改一个请求的处理结构
 * @author lchan
 * @date 2020年5月8日
 */
public class Client {

	public static void main(String[] args) {
		Manager m1 = new CommonManager("m1");
		Manager m2 = new MajorManager("m2");
		Manager m3 = new GeneralManager("m3");
		m1.setManager(m2);  //可以随时调整处理结构
		m2.setManager(m3);

		Request request = new Request();
		request.setName("lili");
		request.setType("请假");
		request.setNum(10);
		
		m1.request(request);
	}

}
