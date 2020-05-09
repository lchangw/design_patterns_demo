package bridge.v2;


public class HandsetBrandM extends HandsetBrand {

	@Override
	void run() {
		System.out.print("Motorola ");
		handsetSoft.run();
	}

}
