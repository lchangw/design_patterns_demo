package factory.method.v1;

public class Volunteer implements LeiFeng {

	@Override
	public void sweep() {
		System.out.println("志愿者扫地");
	}

	@Override
	public void wash() {
		System.out.println("志愿者洗衣");
	}

	@Override
	public void buyRice() {
		System.out.println("志愿者买米");
	}

}
