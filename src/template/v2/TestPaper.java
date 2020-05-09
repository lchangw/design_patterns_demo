package template.v2;

public abstract class TestPaper {

	public void testQuestion1() {
		System.out.println("问题1，请给出答案：");
		System.out.println("答案：" + answer1());
	}
	
	public void testQuestion2() {
		System.out.println("问题2，请给出答案：");
		System.out.println("答案：" + answer2());
	}

	public void testQuestion3() {
		System.out.println("问题3，请给出答案：");
		System.out.println("答案：" + answer3());
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
