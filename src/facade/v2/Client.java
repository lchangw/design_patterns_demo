package facade.v2;

/**
 * ���ģʽ -- Ϊ��ϵͳ��һ��ӿ��ṩһ��һ�µĽ���
 * ������������ʱ�������ڲ����֮�佨����ۣ�Ϊ������ϵͳ�ṩͳһ�ӿڣ�������϶�
 * ����Ϊ��ֹϵͳ�ع��ݻ����������ģʽ���ṩͳһ�ӿڣ���������
 * @author lchan
 * @date 2020��5��6��
 */
public class Client {

	public static void main(String[] args) {
		Fund fund = new Fund();
		fund.buy();
		fund.sell();
	}

}
