package decorator.v2;

import decorator.v1.Person;

/**
 * 通常情况下，Decorator 与   Person会共同实现一个 接口
 * @author lchan
 * @date 2020年5月4日
 */
public class Decorator extends Person {

	protected Person person;
	
	public void decorate(Person person) {
		this.person = person;
	}

	public void show() {
		person.show();
	}
}
