package visitor.v2;

/**
 * 访问者模式 -- 表示一个作用于某对象结构中的各元素的操作，可使你在不改变个元素类的前提下定义作用于这些元素的新操作
 * 它算是Gof中最复杂的一个模式了
 * 
 * 访问者模式适用于数据结构相对稳定的系统，此例中，如果人类性别不止男女，那么新增一种类别，就需在所有状态类(Action)中增加一个方法，为别来OC原则
 * 
 * 访问者模式的目的是把处理从数据结构分离出来，如果系统有比较稳定的数据结构，又有富于变化的算法，那么就适合访问者模式了
 * 
 * Gof说过，大多时你并不需要访问者模式，一旦你需要了，就是真的需要它了，事实上，我们很难找到数据结构不变化的情况
 * @author lchan
 * @date 2020年5月9日
 */
public class Client {

	public static void main(String[] args) {
		ObjectStructure o = new ObjectStructure();
		
		Action succ = new Success();
		succ.name = "成功";
		Action love = new Love();
		love.name = "恋爱";
		
		Person man = new Man();
		man.name = "男人";
		o.add(man);
		
		Person woman = new Woman();
		woman.name = "女人";
		o.add(woman);
		
		o.display(succ);
		o.display(love);
	}

}
