package chain.v2;

/**
 * �Զ����������
 * @author lchan
 * @date 2020��5��8��
 */
public class Client {

	public static void main(String[] args) {
		
		Manager m1 = new Manager(Constants.NAME_MANAGER, Constants.LEVEL_MANAGER);

		Request request = new Request();
		request.setName("lili");
		request.setType("���");
		request.setNum(10);
		
		m1.getResult(request);
	}

}
