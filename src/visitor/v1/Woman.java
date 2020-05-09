package visitor.v1;

public class Woman extends Person {

	@Override
	public void getConclusion() {
		if("成功".equals(action)) {
			System.out.println(name + action + "时，背后大多有一个不成功的男人");
		}else if("失败".equals(action)) {
			System.out.println(name + action + "时，眼泪汪汪，谁也劝不了");
		}else if("恋爱".equals(action)) {
			System.out.println(name + action + "时，遇事懂也装作不懂");
		}
	}

}
