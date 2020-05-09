package template.v1;

public class Client {

	public static void main(String[] args) {
		TestPaper a = new TestPaperA();
		a.testQuestion1();
		a.testQuestion2();
		a.testQuestion3();
		
		TestPaper b = new TestPaperB();
		b.testQuestion1();
		b.testQuestion2();
		b.testQuestion3();
	}

}
