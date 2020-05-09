/**
 * 
 */
package factory.simple;

import java.util.Scanner;

/**
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
            double result = OperationV3.getResult(num1, num2, operate);
            System.out.println("The result is: " + String.format("%.2f", result));
    	}catch(Exception e) {
    		System.out.println("error: " + e.getMessage());
    	}finally {
    		if(scanner != null) scanner.close();
    	}
	}

}
