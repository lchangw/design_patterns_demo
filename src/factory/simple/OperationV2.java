package factory.simple;

import java.util.Scanner;

/**
 * 用面向对象语言实现一个计算器控制程序，要求输入两个数和运算符号，得到结果.
 * 修改了V1版本中的几处问题，但这样的编程符合面向对象码？？？
 * 用计算机的方式去思考，只能满足当前的需求，程序不容易维护、不容易扩展、更不容易复用，从而达不到高质量代码的要求。
 * 但何为可维护、可扩展、可复用呢？？？
 * 如活字印刷术，"喝酒唱歌，人生真爽" --> "对酒当歌，人生真爽" --> "对酒当歌，人生几何"
 * 要改，只需改要改之字，为可维护；可以在后来重复使用，为可复用；若要加字，只需另刻即可，为可扩展；可重新排列，即灵活性好。
 * 
 * 如果不面向对象编程，客户稍微改动需求，原先的程序就几乎需从头来过，因为我们的程序不容易维护、灵活性差、不容易扩展，更谈不上代码的复用了。
 * 因此，面对需求变化，加班加点、对程序动大手术就成了无可奈何了。
 * 如果我们学习了面向对象编程的分析设计思想，就可以考虑封装、继承、多态把程序的耦合度降低，就可以使用设计模式让程序更加灵活，容易修改，且易于复用。
 * 
 * 有人说初级程序员的工作就是复制、粘贴，这时非常不好的编码习惯，当你的代码中重复的代码多到一定程度，维护的时候，就是一种灾难。
 * 编程有一原则，就是尽可能的去避免重复。
 * @author lchan
 * @date 2020年5月3日
 */
public class OperationV2 {
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

            double result = 0;
            switch(operate) {
            	case "+": result = num1 + num2; break;
            	case "-": result = num1 - num2; break;
            	case "*": result = num1 * num2; break;
            	case "/": 
            		if(num2 == 0) throw new Exception("进行除法运算时，除数不能为0");
            		else  result = num1 / num2;
            		break;
            }
            System.out.println("The result is: " + String.format("%.2f", result));
    	}catch(Exception e) {
    		System.out.println("error: " + e.getMessage());
    	}finally {
    		if(scanner != null) scanner.close();
    	}
        
    }
}
