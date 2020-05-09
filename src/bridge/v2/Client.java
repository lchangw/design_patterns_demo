package bridge.v2;

/**
 * �Ž�ģʽ -- �����󲿷�������ʵ�ֲ��ַ��룬ʹ���ǿ��Զ����仯
 * ʵ��ϵͳ�����ж�Ƕȷ��࣬ÿһ�ַ��඼�п��ܱ仯����ô��������ֽǶȷ�����������Ƕ��Ա仯����������֮������
 * @author lchan
 * @date 2020��5��8��
 */
public class Client {

	public static void main(String[] args) {
		HandsetBrand hb;
		hb = new HandsetBrandM();
		
		hb.setHandsetSoft(new HandsetGame());
		hb.run();
		
		hb.setHandsetSoft(new HandsetAddress());
		hb.run();
	}
}
