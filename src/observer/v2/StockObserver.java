package observer.v2;


public class StockObserver extends Observer {

	public StockObserver(String name, Subject sub) {
		super(name, sub);
	}

	@Override
	void update() {
		System.out.printf("%s %s �رչ�Ʊ���飬����������", sub.getAction(), name);
	}

}
