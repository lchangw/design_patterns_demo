package observer.v2;

/**
 * 又叫发布订阅模式，定义了一种一对多的依赖关系，让多个观察者对象同时监听某一个主题对象
 * 这个主题对象在监听对象状态变化时，会通知所有观察者对象，使它们能够自动更新自己
 * 
 * 当一个对象的变更需要同时变更其他对象的时候，考虑使用观察者模式
 * 
 * 不足：尽管用了依赖倒转原则，但是"抽象统治者"还是依赖"抽象观察者"，万一没有了抽象观察者这样的接口，这通知功能就完不成了
 * 另外，就是每个观察者的方法不一定都是"update"，如果通知者和观察者本就互相不知道，由客户端来决定来通知谁，就好了
 * @author lchan
 * @date 2020年5月7日
 */
public class Client {

	public static void main(String[] args) {
		Subject sub = new Secretary();
		Observer o1 = new StockObserver("lili", sub);
		Observer n1 = new NBAObserver("mimi", sub);
		sub.add(o1);
		sub.add(n1);
		sub.remove(n1);
		sub.setAction("老板回来了！");
		sub.notifyObservers();
	}

}
