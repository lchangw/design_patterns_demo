package template.v2;

/**
 * 模板方法使得子类可以不改变一个算法结构而重新定义该算法的某些步骤	
 * 把不变的行为搬移到超类
 * 有时，我们会遇到一系列步骤构成的过程，但有些步骤的实现可能不同，这时候我们就应该考虑模板方法了
 * @author lchan
 * @date 2020年5月6日
 */
public class Client {

	public static void main(String[] args) {
		TestPaper a = new TestPaperA();
		a.answerQuestion();
		
		TestPaper b = new TestPaperB();
		b.answerQuestion();
	}

}
