package composite.v1;

import util.StrUtil;

public class Leaf extends Component {

	public Leaf(String name) {
		super(name);
	}

	@Override
	void add(Component c) {
		System.out.println("Cann't add to a leaf"); //�˴�ʵ��û�����壬����ʹҶ�ڵ��֦�ڵ�߱���ȫһ�½ӿ�
	}

	@Override
	void remove(Component c) {
		System.out.println("Cann't remove from a leaf");
	}

	@Override
	void display(int depth) {
		System.out.println(StrUtil.repeatStr("-", depth) + name); //TODO Util����û�а������޷����룿����
	}

}
