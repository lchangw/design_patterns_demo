package factory.simple.v4;

import java.util.Scanner;

/**
 * UML��ͼ���ࡢ�ӿڼ��ϵ
 * �̳й�ϵ
 * ʵ�ֹ�ϵ
 * ������ϵ -- ��һ���ࡰ֪������һ����ʱ
 * �ۺϹ�ϵ -- ������Ⱥ��Ĺ�ϵ�����岻������Ⱥ��
 * ��Ϲ�ϵ -- ����������Ĺ�ϵ����������������
 * ������ϵ -- һ������������һ����
 * 
 * ��̲�ֻ��һ�ż���������һ��������
 * ����ֻ������д����ȷ���еĴ��룬��Ӧʱ����������ô����������������ά������չ�͸��ã�����������������ߡ�
 * д�����ŵĴ�������Ҫ���ڻ��۵ġ�
 * 
 * @author lchan
 * @date 2020��5��3��
 */
public class Client {
	public static void main(String[] args) {
		Scanner scanner = null;
    	try {
    		scanner = new Scanner(System.in);
            System.out.println("�������һ�����֣�");
            double num1 = scanner.nextDouble(); //����淶֮��������Ҫ������
            System.out.println("�������������(+��-��*��/)��");
            String operate = scanner.next();
            System.out.println("������ڶ������֣�");
            double num2 = scanner.nextDouble();
            
            Operation oper = OperationFactory.createOperation(operate);
            if(oper != null) {
            	oper.num1 = num1;
            	oper.num2 = num2;
                System.out.println("The result is: " + String.format("%.2f", oper.getResult()));
            }else {
            	throw new Exception("��������� +��-��*��/ �е���һ��");
            }
    	}catch(Exception e) {
    		System.out.println("error: " + e.getMessage());
    	}finally {
    		if(scanner != null) scanner.close();
    	}
	}
}
