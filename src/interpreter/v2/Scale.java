package interpreter.v2;

public class Scale extends Expression {

	@Override
	protected void execute(String key, double value) {
		String scale = "";
		switch(new Double(value).intValue()) {
			case 1: scale = "����"; break;
			case 2: scale = "����"; break;
			case 3: scale = "����"; break;
		}
		System.out.print(scale+" ");
	}

}
