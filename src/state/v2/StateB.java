package state.v2;

public class StateB extends State {

	@Override
	public void handle(Context context) {
		if(context.getHour() < 13) {
			System.out.printf("��ǰʱ�䣺%f�㣬���ˣ�����������", context.getHour());
			System.out.println();
		}
		else {
			context.setState(new StateC());
			context.request();
		}
	}

	@Override
	String getName() {
		return "���ˣ�����������";
	}

}
