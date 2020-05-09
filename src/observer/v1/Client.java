package observer.v1;

public class Client {

	public static void main(String[] args) {
		Secretary mm = new Secretary();
		StockObserver o1 = new StockObserver("ll", mm);
		StockObserver o2 = new StockObserver("ll", mm);
		mm.add(o1);
		mm.add(o2);
		mm.setAction("老板回来了！");
		mm.notifyObservers();
	}

}
