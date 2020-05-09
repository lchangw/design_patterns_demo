package chain.v1;

/**
 * 实现请假流程
 * @author lchan
 * @date 2020年5月8日
 */
public class Client {

	public static void main(String[] args) {
		
		Manager m1 = new Manager("m1");
		Manager m2 = new Manager("m2");
		Manager m3 = new Manager("m3");

		Request request = new Request();
		request.setContent("lili");
		request.setType("请假");
		request.setNum(3);
		
		m1.getResult("经理", request);
		m2.getResult("总监", request);
		m3.getResult("总经理", request);
	}

}
