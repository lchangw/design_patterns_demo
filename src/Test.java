
public class Test {
	
	static double num = 0;

	public static void main(String[] args) {
		
		count3(3, 2);
		System.out.println(num);
	}

	private static double count3(double a, double b) {
		num += a * b; //�˴��޸ĳ�Ա������Ч
		System.out.println(num);
		return a * b;
	}

}
