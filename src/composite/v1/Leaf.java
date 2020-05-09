package composite.v1;

import util.StrUtil;

public class Leaf extends Component {

	public Leaf(String name) {
		super(name);
	}

	@Override
	void add(Component c) {
		System.out.println("Cann't add to a leaf"); //此处实现没有意义，但可使叶节点和枝节点具备完全一致接口
	}

	@Override
	void remove(Component c) {
		System.out.println("Cann't remove from a leaf");
	}

	@Override
	void display(int depth) {
		System.out.println(StrUtil.repeatStr("-", depth) + name); //TODO Util类若没有包名就无法引入？？？
	}

}
