package factory.simple.v4;

/**
 * �����������
 * @author lchan
 * @date 2020��5��3��
 */
public class DivOperation extends Operation {

	@Override
	public double getResult() throws Exception {
		if(num2 == 0) throw new Exception("���г�������ʱ����������Ϊ0");
		else return num1 / num2;
	}

}
