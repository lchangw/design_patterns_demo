package proxy.v2;

import proxy.v1.SchoolGirl;

public class Persuit implements GiveGift {
	private SchoolGirl girl;
		
	public Persuit(SchoolGirl girl) {
		this.girl = girl;
	}

	public void giveDolls() {
		System.out.println(girl.getName() + " ����������");
	}
	
	public void giveFlowers() {
		System.out.println(girl.getName() + " �����ʻ�");
	}
	
	public void giveChocolate() {
		System.out.println(girl.getName() + " �����ɿ���");
	}

}
