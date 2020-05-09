package interpreter.v2;

public class Scale extends Expression {

	@Override
	protected void execute(String key, double value) {
		String scale = "";
		switch(new Double(value).intValue()) {
			case 1: scale = "µÕ“Ù"; break;
			case 2: scale = "÷–“Ù"; break;
			case 3: scale = "∏ﬂ“Ù"; break;
		}
		System.out.print(scale+" ");
	}

}
