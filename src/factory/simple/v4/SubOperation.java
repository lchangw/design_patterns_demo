package factory.simple.v4;

/**
 * 定义减法操作
 * @author lchan
 * @date 2020年5月3日
 */
public class SubOperation extends Operation {

	@Override
	public double getResult() {
		return num1 - num2;
	}

}
