package state.v1;

public class Work {
	private int hour;
	private boolean finished;
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public boolean isFinished() {
		return finished;
	}
	public void setFinished(boolean finished) {
		this.finished = finished;
	}
	
	//方法过长是坏味道
	public void state() {
		if(hour < 12) System.out.printf("当前时间：%d点，上午工作，精神百倍", hour);
		else if(hour < 13) System.out.printf("当前时间：%d点，饿了，犯困，午休", hour);
		else if(hour < 17) System.out.printf("当前时间：%d点，下午工作，继续努力", hour);
		else {
			if(finished) System.out.printf("当前时间：%d点，下班了，回家", hour);
			else {
				if(hour < 21) System.out.printf("当前时间：%d点，加班哦，好累", hour);
				else System.out.printf("当前时间：%d点，困了，睡着了", hour);
			}
		}
		System.out.println();
	}
}
