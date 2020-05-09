package state.v2;

/**
 * 状态模式 -- 当一个对象的内在状态改变时，允许改变其行为
 * 当控制一个对象的状态转换的条件表达过于复杂时，把状态的判断逻辑转移到表示不同状态的一系列子类中
 * @author lchan
 * @date 2020年5月7日
 */
public class Client {

	public static void main(String[] args) {
		Context c = new Context(new StateA());
		c.setHour(9);
		c.request();
		c.setHour(10);
		c.request();
		c.setHour(12);
		c.request();
		c.setHour(13);
		c.request();
		c.setHour(14);
		c.request();
		c.setHour(17);
		c.request();
		c.setHour(19);
		c.request();
		c.setHour(21);
		c.request();
		c.setHour(22);
		c.request();
	}

}
