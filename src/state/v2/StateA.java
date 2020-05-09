package state.v2;

public class StateA extends State {
	@Override
	public void handle(Context context) {
		if(context.getHour() < 12) {
			System.out.printf("当前时间：%f点，上午工作，精神百倍", context.getHour());
			System.out.println();
		}
		else {
			context.setState(new StateB());
			context.request();
		}
	}
	@Override
	String getName() {
		return "上午工作，精神百倍";
	}
}
