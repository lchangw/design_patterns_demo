/**
 * 
 */
package factory.simple;

import java.util.Scanner;

/**
 * @author lchan
 * @date 2020年5月3日
 */
public class Client {

	public static void main(String[] args) {
		Scanner scanner = null;
    	try {
    		scanner = new Scanner(System.in);
            System.out.println("请输入第一个数字：");
            double num1 = scanner.nextDouble(); //编码规范之变量命名要有意义
            System.out.println("请输入运算符号(+、-、*、/)：");
            String operate = scanner.next();
            System.out.println("请输入第二个数字：");
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
