package observer.v3;

/**
 * �¼�ί��ʵ��
 * @author lchan
 * @date 2020��5��7��
 */
public class Client {

	public static void main(String[] args) {
		Subject sub = new Secretary();
		StockObserver o1 = new StockObserver("lili", sub);
		NBAObserver o2 = new NBAObserver("mimi", sub);
	}

}
