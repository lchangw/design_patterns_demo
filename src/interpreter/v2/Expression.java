package interpreter.v2;

public abstract class Expression {

	public void interpret(Context context) {
		if(context.getText().length()  != 0) {
			String key = context.getText().substring(0, 1);
			context.setText(context.getText().substring(2));
			double value = Double.parseDouble(context.getText().substring(0, context.getText().indexOf(" ")));
			context.setText(context.getText().substring(context.getText().indexOf(" ") + 1));
			execute(key, value);
		}
	}

	protected abstract void execute(String key, double value);
}
