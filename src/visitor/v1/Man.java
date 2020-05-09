package visitor.v1;

public class Man extends Person {

	@Override
	public void getConclusion() {
		if("成功".equals(action)) {
			System.out.println(name + action + "时，背后多半有一个伟大的女人");
		}else if("失败".equals(action)) {
			System.out.println(name + action + "时，闷头喝酒，谁也不用劝");
		}else if("恋爱".equals(action)) {
			System.out.println(name + action + "时，凡是不懂也要装懂");
		}
	}

}
