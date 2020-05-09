package state.v2;

public class StateB extends State {

	@Override
	public void handle(Context context) {
		if(context.getHour() < 13) {
			System.out.printf("当前时间：%f点，饿了，犯困，午休", context.getHour());
			System.out.println();
		}
		else {
			context.setState(new StateC());
			context.request();
		}
	}

	@Override
	String getName() {
		return "饿了，犯困，午休";
	}

}
