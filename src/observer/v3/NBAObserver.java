package observer.v3;

public class NBAObserver {

	private String name;
	private Subject sub;
	public NBAObserver(String name, Subject sub) {
		this.name = name;
		this.sub = sub;
	}
	
	public void closeNBA() {
		System.out.printf("%s %s �ر�NBAֱ��������������", sub.getAction(), name);
	}
}
