package factory.simple;

/**
 * 对计算业务进行封装，但仅此而已，实在谈不上完全面向对象，该如何利用面向对象的继承和多态呢？？？
 * 如果要增加一个开平方根的运算，却要让加减乘除的运算都参与编译，耦合度太高；本来是增加一个功能，却让那些运行良好的功能代码存在发生变化的风险。
 * @author lchan
 * @date 2020年5月3日
 */
public class OperationV3 {
	public static double getResult(double num1, double num2, String operate) throws Exception {
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
		return result;
	}
}
