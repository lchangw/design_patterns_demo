package factory.simple.v4;

/**
 * 定义乘法操作
 * @author lchan
 * @date 2020年5月3日
 */
public class MulOperation extends Operation {

	@Override
	public double getResult() {
		return num1 * num2;
	}

}
