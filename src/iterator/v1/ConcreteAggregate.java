package iterator.v1;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate implements Aggregate {

	private List<Object> list = new ArrayList<Object>();
	
	@Override
	public Iterator createIterator() {
		return new ConcreteIterator(this);
	}
	
	public int count() {
		return list.size();
	}
	
	public Object get(int i) {
		return list.get(i);
	}
	
	public void put(int i, Object obj) {
		list.add(i, obj);
	}

}
