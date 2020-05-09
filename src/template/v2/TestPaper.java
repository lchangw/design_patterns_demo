package template.v2;

public abstract class TestPaper {

	public void testQuestion1() {
		System.out.println("����1��������𰸣�");
		System.out.println("�𰸣�" + answer1());
	}
	
	public void testQuestion2() {
		System.out.println("����2��������𰸣�");
		System.out.println("�𰸣�" + answer2());
	}

	public void testQuestion3() {
		System.out.println("����3��������𰸣�");
		System.out.println("�𰸣�" + answer3());
	}
	
	public void answerQuestion() {
		testQuestion1();
		testQuestion2();
		testQuestion3();
	}

	protected abstract String answer1();
	protected abstract String answer2();
	protected abstract String answer3();
	
}
