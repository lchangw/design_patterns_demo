package test;

public class Client {

	public static void main(String[] args) {
		testSubString();
	}
	
	static void testSubString() {
		String str = "0.5 ";
		System.out.println(str.substring(0, str.indexOf(" "))); //substring(0, -1) String index out of range: -1
		System.out.println(str.substring(4)); //substring(int start) start���Ե���str�ĳ���
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
		 * �̳����ʼ��˳��
		 * 1.���ྲ̬���ԡ����ྲ̬�����
		 * 2.���ྲ̬���ԡ����ྲ̬�����
		 * 3.������ͨ���ԡ�������ͨ�����
		 * 4.���๹�캯��
		 * 5.������ͨ���ԡ�������ͨ�����
		 * 6.���๹�캯��
		 */
		B b1 = new B();
		b1.a1();
	}

}
