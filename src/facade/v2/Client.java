package facade.v2;

/**
 * 外观模式 -- 为子系统中一组接口提供一个一致的界面
 * 比如在软件设计时，可以在层与层之间建立外观，为复杂子系统提供统一接口，降低耦合度
 * 或者为防止系统重构演化，增加外观模式以提供统一接口，减少依赖
 * @author lchan
 * @date 2020年5月6日
 */
public class Client {

	public static void main(String[] args) {
		Fund fund = new Fund();
		fund.buy();
		fund.sell();
	}

}
