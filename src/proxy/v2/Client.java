package proxy.v2;

import proxy.v1.SchoolGirl;

/**
 * ����ģʽ -- Ϊ���������ṩһ�ִ����Կ��ƶ��������ķ���
 * @author lchan
 * @date 2020��5��4��
 */
public class Client {

	public static void main(String[] args) {
		SchoolGirl girl = new SchoolGirl();
		girl.setName("mm");
		Proxy proxy = new Proxy(girl);
		proxy.giveChocolate();
		proxy.giveDolls();
		proxy.giveFlowers();
	}

}
