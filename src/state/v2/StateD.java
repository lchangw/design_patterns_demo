package state.v2;

public class StateD extends State {

	@Override
	void handle(Context context) {
		if(context.isFinished()) {
			System.out.printf("当前时间：%f点，下班了，回家", context.getHour());
			System.out.println();
		}
		else {
			if(context.getHour() < 21) {
				System.out.printf("当前时间：%f点，加班哦，好累", context.getHour());
				System.out.println();
			}else {
				System.out.printf("当前时间：%f点，困了，睡着了", context.getHour());
				System.out.println();
			}
		}
			
	}

	@Override
	String getName() {
		return "下班了，回家";
	}

}
