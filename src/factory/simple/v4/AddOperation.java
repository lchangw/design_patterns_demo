package factory.simple.v4;

/**
 * 定义加法操作
 * @author lchan
 * @date 2020年5月3日
 */
public class AddOperation extends Operation {

	@Override
	public double getResult() {
		return num1 + num2;
	}
	
}
