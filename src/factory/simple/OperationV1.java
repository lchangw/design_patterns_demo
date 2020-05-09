package factory.simple;

import java.util.Scanner;

/**
 * 用面向对象语言实现一个计算器控制程序，要求输入两个数和运算符号，得到结果.
 * @author lchan
 * @date 2020年5月3日
 */
public class OperationV1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        double num1 = scanner.nextDouble(); //编码规范之变量命名要有意义
        System.out.println("请输入运算符号(+、-、*、/)：");
        String operate = scanner.next();
        System.out.println("请输入第二个数字：");
        double num2 = scanner.nextDouble();
        scanner.close();

        double result = 0;
        //这样的写法，每个条件都要做一次判断
        if ("+".equals(operate)) result = num1 + num2; //String是一个对象，指向堆上一个地址
        if ("-".equals(operate)) result = num1 - num2;
        if ("*".equals(operate)) result = num1 * num2;
        if ("/".equals(operate)) result = num1 / num2; //客户端第二个数字输入0怎么办？
        System.out.println("The result is: " + String.format("%.2f", result));
    }
}
