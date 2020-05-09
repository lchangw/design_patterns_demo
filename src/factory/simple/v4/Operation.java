package factory.simple.v4;

/**
 * 将计算的公共属性抽象出来
 * @author lchan
 * @date 2020年5月3日
 */
public abstract class Operation {
	protected double num1;
	protected double num2;
	
	abstract double getResult() throws Exception;
}
