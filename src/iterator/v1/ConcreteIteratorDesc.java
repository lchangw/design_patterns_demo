package iterator.v1;

public class ConcreteIteratorDesc implements Iterator {

	private ConcreteAggregate a;
	private int current = 0;
	
	public ConcreteIteratorDesc(ConcreteAggregate a) {
		this.a = a;
		current = a.count() - 1;
	}
	
	@Override
	public Object first() {
		return a.get(a.count() - 1);
	}

	@Override
	public Object next() {
		Object obj = null;
		current--;
		if(current >= 0) {
			obj = a.get(current);
		}
		return obj;
	}

	@Override
	public boolean isDone() {
		return current < 0;
	}

	@Override
	public Object currentItem() {
		return a.get(current);
	}

}
