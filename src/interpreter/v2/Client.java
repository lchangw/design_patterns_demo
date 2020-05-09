package interpreter.v2;

/**
 * ����ֻ�ǿ���̨����
 * ����������а�����Ӧ��mp3�ļ�������Media Player�ؼ�������д����ʵ���������Խ�����
 * @author lchan
 * @date 2020��5��8��
 */
public class Client {

	public static void main(String[] args) {
		Context context = new Context();
		System.out.println("�Ϻ�̲��");
		context.setText("O 2 E 0.5 G 0.5 A 3 E 0.5 G 0.5 D 3 E 0.5 G 0.5 ");
		Expression expression = null;
		try {
			while(context.getText().length() > 0) {
				String str = context.getText().substring(0, 1);
				switch(str) {
					case "O": expression = new Scale(); break;
					case "C":
					case "D":
					case "E":
					case "F":
					case "G":
					case "A":
					case "B": 
					case "P": expression = new Note(); break;
				}
				expression.interpret(context);
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
