package adapter.v1;

/**
 * 适配器模式 -- 将一个类的接口转换为客户希望的另一个接口
 * 使得原本由于接口不兼容而不能一起工作的类可以一起工作
 * @author lchan
 * @date 2020年5月7日
 */
public class Client {

	public static void main(String[] args) {
		Target target = new Adapter();
		target.request();
	}

}
