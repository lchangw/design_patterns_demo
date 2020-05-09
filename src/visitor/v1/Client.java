package visitor.v1;

public class Client {

	public static void main(String[] args) {

		Person man = new Man();
		man.action = "成功";
		man.name = "男人";
		man.getConclusion();
		
		Person woman = new Woman();
		woman.action = "恋爱";
		woman.name = "女人";
		woman.getConclusion();
	}

}
