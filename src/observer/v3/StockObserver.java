package observer.v3;

public class StockObserver {

	private String name;
	private Subject sub;
	public StockObserver(String name, Subject sub) {
		this.name = name;
		this.sub = sub;
	}
	
	public void closeStock() {
		System.out.printf("%s %s 关闭股票行情，继续工作！", sub.getAction(), name);
	}
}
