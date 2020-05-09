package mediator.v1;

/**
 * 中介者模式 -- 用一个中介对象来封装一系列的对象交互，使得各对象不需显式的相互调用，松散其耦合
 * 不足：中介者需要直到所有的交互对象，把交互的复杂性变成了中介者的复杂性
 * 一般应用于一组对象以定义良好但是复杂通信的场合
 * 当系统中出现“多对多”交互复杂的对象群时，不要急于使用中介者模式，要先反思系统设计合不合理
 * @author lchan
 * @date 2020年5月8日
 */
public class Client {

	public static void main(String[] args) {
		ConcreteMediator mediator = new ConcreteMediator();
		Colleuage1 c1 = new Colleuage1(mediator);
		Colleuage2 c2 = new Colleuage2(mediator);
		
		mediator.setC1(c1);
		mediator.setC2(c2);
		
		c1.send("你瞅啥");
		c2.send("瞅你咋地");
	}

}
