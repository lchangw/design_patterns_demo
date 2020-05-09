package chain.v3;

import chain.v2.Request;

/**
 * ְ���� -- ��������л��ᴦ�����󣬽���Щ��������һ���������������������ݸ����� ��ֱ����һ�������������Ϊֹ
 * ÿ��������豣��һ�����̴����������ã����������ߺʹ�����֮�����Ϲ�ϵ
 * ������ʱ���ӻ��޸�һ������Ĵ���ṹ
 * @author lchan
 * @date 2020��5��8��
 */
public class Client {

	public static void main(String[] args) {
		Manager m1 = new CommonManager("m1");
		Manager m2 = new MajorManager("m2");
		Manager m3 = new GeneralManager("m3");
		m1.setManager(m2);  //������ʱ��������ṹ
		m2.setManager(m3);

		Request request = new Request();
		request.setName("lili");
		request.setType("���");
		request.setNum(10);
		
		m1.request(request);
	}

}
