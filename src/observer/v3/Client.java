package observer.v3;

/**
 * 事件委托实现
 * @author lchan
 * @date 2020年5月7日
 */
public class Client {

	public static void main(String[] args) {
		Subject sub = new Secretary();
		StockObserver o1 = new StockObserver("lili", sub);
		NBAObserver o2 = new NBAObserver("mimi", sub);
	}

}
