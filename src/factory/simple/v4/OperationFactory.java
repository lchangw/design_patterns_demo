package factory.simple.v4;

/**
 * 创建操作实例的工厂类
 * @author lchan
 * @date 2020年5月3日
 */
public class OperationFactory {

	public static Operation createOperation(String operate) {
		Operation oper = null;
		switch(operate) {
	    	case "+": oper = new AddOperation(); break;
	    	case "-": oper = new SubOperation(); break;
	    	case "*": oper = new MulOperation(); break;
	    	case "/": oper = new DivOperation(); break;
		}
		return oper;
	}
}
