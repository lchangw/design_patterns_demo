package bridge.v1;

/**
 * ����ļ̳й�ϵ�ڱ���ʱ�Ͷ�����ˣ������޷�������ʱ�ı�Ӹ���̳е�ʵ��
 * �����ʵ�������ĸ����зǳ����ܵ�������ϵ�������ڸ���ʵ���е��κα仯��Ȼ�ᵼ�����෢���仯
 * ����������ϵ��������������Բ����������˸�����
 * @author lchan
 * @date 2020��5��8��
 */
public class Client {

	public static void main(String[] args) {
		HandsetBrand hb;
		hb = new HandsetBrandM();
		hb.run();
		hb = new HandsetBrandMGame();
		hb.run();
		hb = new HandsetBrandMAddress();
		hb.run();
	}

}
