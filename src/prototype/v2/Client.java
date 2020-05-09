package prototype.v2;

/**
 * ԭ��ģʽ������ԭ��ʵ�������µĶ���ʡ����ÿ��ִ�й��캯���Ŀ���
 * �ڳ�ʼ����Ϣ���������������£���¡����õİ취����������˴��������ϸ�ڣ������������
 * 
 * clone����������ֶ���ֵ���ͣ��Ը��ֶ���λ���ƣ�����ֶ����������ͣ���ֻ��������
 * @author lchan
 * @date 2020��5��6��
 */
public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		Resume r1 = new Resume("lilin");
		r1.setPersonalInfo("man", 29);
		r1.setWorkExperience("2019-2020", "XX��˾");
		
		Resume r2 = (Resume) r1.clone();
		r2.setWorkExperience("2018-2019", "YY��˾");
		
		System.out.println(r1.toString());
		System.out.println(r2.toString());
	}

}
