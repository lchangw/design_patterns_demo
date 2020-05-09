package observer.v2;


public class StockObserver extends Observer {

	public StockObserver(String name, Subject sub) {
		super(name, sub);
	}

	@Override
	void update() {
		System.out.printf("%s %s 关闭股票行情，继续工作！", sub.getAction(), name);
	}

}
