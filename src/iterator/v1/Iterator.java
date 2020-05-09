package iterator.v1;

public interface Iterator {
	Object first();
	Object next();
	boolean isDone();
	Object currentItem();
}
