package visitor.v1;

public class Client {

	public static void main(String[] args) {

		Person man = new Man();
		man.action = "�ɹ�";
		man.name = "����";
		man.getConclusion();
		
		Person woman = new Woman();
		woman.action = "����";
		woman.name = "Ů��";
		woman.getConclusion();
	}

}
