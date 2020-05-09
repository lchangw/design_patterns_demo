package state.v2;

public class StateC extends State {

	@Override
	void handle(Context context) {
		if(context.getHour() < 17) {
			System.out.printf("��ǰʱ�䣺%f�㣬���繤��������Ŭ��", context.getHour());
			System.out.println();
		}
		else {
			context.setState(new StateD());
			context.request();
		}
	}

	@Override
	String getName() {
		return "���繤��������Ŭ��";
	}

}
