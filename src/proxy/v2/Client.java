package proxy.v2;

import proxy.v1.SchoolGirl;

/**
 * 代理模式 -- 为其他对象提供一种代理以控制对这个对象的访问
 * @author lchan
 * @date 2020年5月4日
 */
public class Client {

	public static void main(String[] args) {
		SchoolGirl girl = new SchoolGirl();
		girl.setName("mm");
		Proxy proxy = new Proxy(girl);
		proxy.giveChocolate();
		proxy.giveDolls();
		proxy.giveFlowers();
	}

}
