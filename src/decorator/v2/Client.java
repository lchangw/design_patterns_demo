package decorator.v2;

import decorator.v1.Person;

/**
 * 装饰者模式 -- 动态的给一个对象添加一些额外的功能，比子类更加灵活
 * 包装要装饰的对象，把类的核心职责和装饰功能区分开了
 * 这样说来，装饰者模式和代理模式区分又在哪里？？？
 * 装饰者模式满足了一些只在某种特定情况下才会执行的特殊行为的需要，把每个要装饰的功能放在单独的类中，并让这个类包装它要装饰的对象，
 * 当需要执行特殊行为时，就可以在运行时根据需要有选择地、有顺序的使用包装功能包装对象了。
 * @author lchan
 * @date 2020年5月4日
 */
public class Client {	
	
	public static void main(String[] args) {
		Person person = new Person("小米");
		System.out.println("第一种装扮：");
		
		TShirtsDecorator shirt = new TShirtsDecorator();
		BigTrouserDecorator trouser = new BigTrouserDecorator();
		SneakersDecorator sneaker = new SneakersDecorator();
		
		shirt.decorate(person);
		trouser.decorate(shirt);
		sneaker.decorate(trouser);
		sneaker.show();
		
		System.out.println("第二种装扮：");
		
		SuitsDecorator suit = new SuitsDecorator();
		TiesDecorator tie = new TiesDecorator();
		LeatherShoesDecorator shoe = new LeatherShoesDecorator();
		
		shoe.decorate(person);
		tie.decorate(shoe); //小心不要自己装饰自己，否则陷入死循环
		suit.decorate(tie); //注意顺序，越后装饰的越先展示
		suit.show();
	}

}
