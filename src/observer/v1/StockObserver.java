package observer.v1;

public class StockObserver {

	private String name;
	private Secretary sub;
	public StockObserver(String name, Secretary sub) {
		this.name = name;
		this.sub = sub;
	}
	
	public void update() {
		System.out.printf("%s %s �رչ�Ʊ���飬����������", sub.getAction(), name);
	}
}
