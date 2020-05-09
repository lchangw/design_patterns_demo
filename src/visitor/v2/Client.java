package visitor.v2;

/**
 * ������ģʽ -- ��ʾһ��������ĳ����ṹ�еĸ�Ԫ�صĲ�������ʹ���ڲ��ı��Ԫ�����ǰ���¶�����������ЩԪ�ص��²���
 * ������Gof����ӵ�һ��ģʽ��
 * 
 * ������ģʽ���������ݽṹ����ȶ���ϵͳ�������У���������Ա�ֹ��Ů����ô����һ����𣬾���������״̬��(Action)������һ��������Ϊ����OCԭ��
 * 
 * ������ģʽ��Ŀ���ǰѴ�������ݽṹ������������ϵͳ�бȽ��ȶ������ݽṹ�����и��ڱ仯���㷨����ô���ʺϷ�����ģʽ��
 * 
 * Gof˵�������ʱ�㲢����Ҫ������ģʽ��һ������Ҫ�ˣ����������Ҫ���ˣ���ʵ�ϣ����Ǻ����ҵ����ݽṹ���仯�����
 * @author lchan
 * @date 2020��5��9��
 */
public class Client {

	public static void main(String[] args) {
		ObjectStructure o = new ObjectStructure();
		
		Action succ = new Success();
		succ.name = "�ɹ�";
		Action love = new Love();
		love.name = "����";
		
		Person man = new Man();
		man.name = "����";
		o.add(man);
		
		Person woman = new Woman();
		woman.name = "Ů��";
		o.add(woman);
		
		o.display(succ);
		o.display(love);
	}

}
