package template.v2;

/**
 * ģ�巽��ʹ��������Բ��ı�һ���㷨�ṹ�����¶�����㷨��ĳЩ����	
 * �Ѳ������Ϊ���Ƶ�����
 * ��ʱ�����ǻ�����һϵ�в��蹹�ɵĹ��̣�����Щ�����ʵ�ֿ��ܲ�ͬ����ʱ�����Ǿ�Ӧ�ÿ���ģ�巽����
 * @author lchan
 * @date 2020��5��6��
 */
public class Client {

	public static void main(String[] args) {
		TestPaper a = new TestPaperA();
		a.answerQuestion();
		
		TestPaper b = new TestPaperB();
		b.answerQuestion();
	}

}
