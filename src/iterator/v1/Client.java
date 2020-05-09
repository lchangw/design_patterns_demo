package iterator.v1;

/**
 * 迭代器模式 -- 提供一种方法顺序访问一个聚合对象中各个元素，而又不暴露该对象的内部表示
 * 
 * 各种高级语言都对它做了封装，反而模式本身不常用了
 * @author lchan
 * @date 2020年5月7日
 */
public class Client {

	public static void main(String[] args) {
		ConcreteAggregate a = new ConcreteAggregate();
		a.put(0, "lili");
		a.put(1, "mimi");
		a.put(2, "nini");
		Iterator i = new ConcreteIterator(a);
		Object item = i.first();
		while(!i.isDone()) {
			System.out.println(i.currentItem() + "请买车票");
			i.next();
		}
	}

}
