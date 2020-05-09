package state.v2;

public class StateC extends State {

	@Override
	void handle(Context context) {
		if(context.getHour() < 17) {
			System.out.printf("当前时间：%f点，下午工作，继续努力", context.getHour());
			System.out.println();
		}
		else {
			context.setState(new StateD());
			context.request();
		}
	}

	@Override
	String getName() {
		return "下午工作，继续努力";
	}

}
