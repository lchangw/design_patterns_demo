package chain.v1;

/**
 * ʵ���������
 * @author lchan
 * @date 2020��5��8��
 */
public class Client {

	public static void main(String[] args) {
		
		Manager m1 = new Manager("m1");
		Manager m2 = new Manager("m2");
		Manager m3 = new Manager("m3");

		Request request = new Request();
		request.setContent("lili");
		request.setType("���");
		request.setNum(3);
		
		m1.getResult("����", request);
		m2.getResult("�ܼ�", request);
		m3.getResult("�ܾ���", request);
	}

}
