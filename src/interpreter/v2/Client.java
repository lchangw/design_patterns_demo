package interpreter.v2;

/**
 * 这里只是控制台程序
 * 给你钢琴所有按键对应的mp3文件，利用Media Player控件，可以写出真实的音乐语言解释器
 * @author lchan
 * @date 2020年5月8日
 */
public class Client {

	public static void main(String[] args) {
		Context context = new Context();
		System.out.println("上海滩：");
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
