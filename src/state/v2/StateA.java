package state.v2;

public class StateA extends State {
	@Override
	public void handle(Context context) {
		if(context.getHour() < 12) {
			System.out.printf("��ǰʱ�䣺%f�㣬���繤��������ٱ�", context.getHour());
			System.out.println();
		}
		else {
			context.setState(new StateB());
			context.request();
		}
	}
	@Override
	String getName() {
		return "���繤��������ٱ�";
	}
}
