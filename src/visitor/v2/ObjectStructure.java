package visitor.v2;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {

	private List<Person> list = new ArrayList<>();
	
	public void add(Person person) {
		list.add(person);
	}
	
	public void remove(Person person) {
		list.remove(person);
	}
	
	public void display(Action action) {
		for(Person p : list) {
			p.accept(action);
		}
	}
}
