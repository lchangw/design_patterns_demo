package test;

public class B extends A {
	/**
	 * 子类构造方法会默认调用父类无参构造方法，父类若没有无参构造方法，则需显式调用其有参构造方法
	 * @param a
	 */
	public B(String a) {
		super(a);
	}

	/**
	 * super关键字主要用在子类的方法中，用于指向子类对象中的父类对象，可以访问父类的属性、方法以及构造方法
	 * TODO super关键字为何不可用在方法之外？？？
	 */
	public void changeA(){
		super.a = "B";
		System.out.println("修改父类的a值为：" + a);
	}
	
	public String name = "lisi";
	int num = 0;
	public B() {
		num = 100;
	}
	
	/**
	 * 执行父类构造方法时，子类非静态成员属性还未赋值
	 */
	public void a1() {
		System.out.println(num); //0
		System.out.println("BBB");
		System.out.println(name); //null
	}
}
