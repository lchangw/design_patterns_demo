package test;

public class B extends A {
	/**
	 * ���๹�췽����Ĭ�ϵ��ø����޲ι��췽����������û���޲ι��췽����������ʽ�������вι��췽��
	 * @param a
	 */
	public B(String a) {
		super(a);
	}

	/**
	 * super�ؼ�����Ҫ��������ķ����У�����ָ����������еĸ�����󣬿��Է��ʸ�������ԡ������Լ����췽��
	 * TODO super�ؼ���Ϊ�β������ڷ���֮�⣿����
	 */
	public void changeA(){
		super.a = "B";
		System.out.println("�޸ĸ����aֵΪ��" + a);
	}
	
	public String name = "lisi";
	int num = 0;
	public B() {
		num = 100;
	}
	
	/**
	 * ִ�и��๹�췽��ʱ������Ǿ�̬��Ա���Ի�δ��ֵ
	 */
	public void a1() {
		System.out.println(num); //0
		System.out.println("BBB");
		System.out.println(name); //null
	}
}
