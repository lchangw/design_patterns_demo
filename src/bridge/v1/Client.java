package bridge.v1;

/**
 * 对象的继承关系在编译时就定义好了，所以无法在运行时改变从父类继承的实现
 * 子类的实现与它的父类有非常紧密的依赖关系，以至于父类实现中的任何变化必然会导致子类发生变化
 * 这种依赖关系最终限制了灵活性并最终限制了复用性
 * @author lchan
 * @date 2020年5月8日
 */
public class Client {

	public static void main(String[] args) {
		HandsetBrand hb;
		hb = new HandsetBrandM();
		hb.run();
		hb = new HandsetBrandMGame();
		hb.run();
		hb = new HandsetBrandMAddress();
		hb.run();
	}

}
