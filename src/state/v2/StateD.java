package state.v2;

public class StateD extends State {

	@Override
	void handle(Context context) {
		if(context.isFinished()) {
			System.out.printf("��ǰʱ�䣺%f�㣬�°��ˣ��ؼ�", context.getHour());
			System.out.println();
		}
		else {
			if(context.getHour() < 21) {
				System.out.printf("��ǰʱ�䣺%f�㣬�Ӱ�Ŷ������", context.getHour());
				System.out.println();
			}else {
				System.out.printf("��ǰʱ�䣺%f�㣬���ˣ�˯����", context.getHour());
				System.out.println();
			}
		}
			
	}

	@Override
	String getName() {
		return "�°��ˣ��ؼ�";
	}

}
