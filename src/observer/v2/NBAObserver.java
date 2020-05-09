package observer.v2;


public class NBAObserver extends Observer {

	public NBAObserver(String name, Subject sub) {
		super(name, sub);
	}

	@Override
	void update() {
		System.out.printf("%s %s 关闭NBA直播，继续工作！", sub.getAction(), name);
	}

}
