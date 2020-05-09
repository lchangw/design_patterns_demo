package test;

public class Client {

	public static void main(String[] args) {
		testSubString();
	}
	
	static void testSubString() {
		String str = "0.5 ";
		System.out.println(str.substring(0, str.indexOf(" "))); //substring(0, -1) String index out of range: -1
		System.out.println(str.substring(4)); //substring(int start) start可以等于str的长度
	}
	
	static void testDoubleToInt() {
		System.out.println(new Double(2.8).intValue());
	}
	
	static void testOperate() {
//		(1+1 == 2) ? 2 : 3;  //The left-hand side of an assignment must be a variable
		int a = (1+1 == 2) ? 2 : 3;
	}
	
	static void testExtend(){
		B b = new B("C");
		//b.changeA();
		System.out.println(b.a);
		
		/**
		 * 继承类初始化顺序：
		 * 1.父类静态属性、父类静态代码块
		 * 2.子类静态属性、子类静态代码块
		 * 3.父类普通属性、父类普通代码块
		 * 4.父类构造函数
		 * 5.子类普通属性、子类普通代码块
		 * 6.子类构造函数
		 */
		B b1 = new B();
		b1.a1();
	}

}
