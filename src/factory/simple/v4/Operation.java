package factory.simple.v4;

/**
 * ������Ĺ������Գ������
 * @author lchan
 * @date 2020��5��3��
 */
public abstract class Operation {
	protected double num1;
	protected double num2;
	
	abstract double getResult() throws Exception;
}
