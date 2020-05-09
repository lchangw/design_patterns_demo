package composite.v1;

import java.util.ArrayList;
import java.util.List;

import util.StrUtil;

public class Composite extends Component {

	private List<Component> list = new ArrayList<Component>();
	public Composite(String name) {
		super(name);  //子类构造发会默认调用父类的无参构造方法，若父类无无参构造方法，则需在子类构造方法中显式调用父类的构造方法
	}

	@Override
	void add(Component c) {
		list.add(c);
	}

	@Override
	void remove(Component c) {
		list.remove(c);
	}

	@Override
	void display(int depth) {
		System.out.println(StrUtil.repeatStr("-", depth) + name);
		for(Component c : list) {
			c.display(depth+1);
		}
	}

}
