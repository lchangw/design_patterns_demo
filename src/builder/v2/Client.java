package builder.v2;

/**
 * ��һ�����Ӷ���Ĺ��������ı�ʾ����
 * ���ƺ���ģ�巽���Ѿ��岽���ʵ�ַ���������ʵ��һ�����������ģ�����TODO 
 * @author lchan
 * @date 2020��5��7��
 */
public class Client {

	public static void main(String[] args) {
		PersonBuilder pb = new PersonThinBuilder();
		PersonDirector pd = new PersonDirector(pb);
		pd.createPerson();
	}

}
