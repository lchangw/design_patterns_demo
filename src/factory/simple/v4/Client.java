package factory.simple.v4;

import java.util.Scanner;

/**
 * UML类图中类、接口间关系
 * 继承关系
 * 实现关系
 * 关联关系 -- 当一个类“知道”另一个类时
 * 聚合关系 -- 个体与群体的关系，个体不依赖于群体
 * 组合关系 -- 部分与整体的关系，部分依赖于整体
 * 依赖关系 -- 一个类依赖于另一个类
 * 
 * 编程不只是一门技术，更是一门艺术。
 * 不能只满足于写出正确运行的代码，还应时常考虑如何让代码更简练，更易于维护、扩展和复用，这样才能真正的提高。
 * 写出优雅的代码是需要长期积累的。
 * 
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
            
            Operation oper = OperationFactory.createOperation(operate);
            if(oper != null) {
            	oper.num1 = num1;
            	oper.num2 = num2;
                System.out.println("The result is: " + String.format("%.2f", oper.getResult()));
            }else {
            	throw new Exception("运算符不是 +、-、*、/ 中的任一种");
            }
    	}catch(Exception e) {
    		System.out.println("error: " + e.getMessage());
    	}finally {
    		if(scanner != null) scanner.close();
    	}
	}
}
