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
	
	//���������ǻ�ζ��
	public void state() {
		if(hour < 12) System.out.printf("��ǰʱ�䣺%d�㣬���繤��������ٱ�", hour);
		else if(hour < 13) System.out.printf("��ǰʱ�䣺%d�㣬���ˣ�����������", hour);
		else if(hour < 17) System.out.printf("��ǰʱ�䣺%d�㣬���繤��������Ŭ��", hour);
		else {
			if(finished) System.out.printf("��ǰʱ�䣺%d�㣬�°��ˣ��ؼ�", hour);
			else {
				if(hour < 21) System.out.printf("��ǰʱ�䣺%d�㣬�Ӱ�Ŷ������", hour);
				else System.out.printf("��ǰʱ�䣺%d�㣬���ˣ�˯����", hour);
			}
		}
		System.out.println();
	}
}
