package bridge.v2;

public abstract class HandsetBrand {

	protected HandsetSoft handsetSoft;
	
	public void setHandsetSoft(HandsetSoft handsetSoft) {
		this.handsetSoft = handsetSoft;
	}
	
	abstract void run();
}
