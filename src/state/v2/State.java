package state.v2;

public abstract class State {
	abstract void handle(Context context);
	abstract String getName();
}
