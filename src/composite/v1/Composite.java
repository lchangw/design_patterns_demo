package composite.v1;

import java.util.ArrayList;
import java.util.List;

import util.StrUtil;

public class Composite extends Component {

	private List<Component> list = new ArrayList<Component>();
	public Composite(String name) {
		super(name);  //���๹�췢��Ĭ�ϵ��ø�����޲ι��췽�������������޲ι��췽�������������๹�췽������ʽ���ø���Ĺ��췽��
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
