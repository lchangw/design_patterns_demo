package factory.simple.v4;

/**
 * 定义除法操作
 * @author lchan
 * @date 2020年5月3日
 */
public class DivOperation extends Operation {

	@Override
	public double getResult() throws Exception {
		if(num2 == 0) throw new Exception("进行除法运算时，除数不能为0");
		else return num1 / num2;
	}

}
