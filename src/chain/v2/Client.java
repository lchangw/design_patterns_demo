package chain.v2;

/**
 * 自定义请假流程
 * @author lchan
 * @date 2020年5月8日
 */
public class Client {

	public static void main(String[] args) {
		
		Manager m1 = new Manager(Constants.NAME_MANAGER, Constants.LEVEL_MANAGER);

		Request request = new Request();
		request.setName("lili");
		request.setType("请假");
		request.setNum(10);
		
		m1.getResult(request);
	}

}
