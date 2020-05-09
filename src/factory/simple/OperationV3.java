package factory.simple;

/**
 * �Լ���ҵ����з�װ�������˶��ѣ�ʵ��̸������ȫ������󣬸���������������ļ̳кͶ�̬�أ�����
 * ���Ҫ����һ����ƽ���������㣬ȴҪ�üӼ��˳������㶼������룬��϶�̫�ߣ�����������һ�����ܣ�ȴ����Щ�������õĹ��ܴ�����ڷ����仯�ķ��ա�
 * @author lchan
 * @date 2020��5��3��
 */
public class OperationV3 {
	public static double getResult(double num1, double num2, String operate) throws Exception {
		double result = 0;
		switch(operate) {
    	case "+": result = num1 + num2; break;
    	case "-": result = num1 - num2; break;
    	case "*": result = num1 * num2; break;
    	case "/": 
    		if(num2 == 0) throw new Exception("���г�������ʱ����������Ϊ0");
    		else  result = num1 / num2;
    		break;
		}
		return result;
	}
}
