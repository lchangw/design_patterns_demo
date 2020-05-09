package factory.simple.v4;

/**
 * ��������ʵ���Ĺ�����
 * @author lchan
 * @date 2020��5��3��
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
