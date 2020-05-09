package decorator.v2;

import decorator.v1.Person;

/**
 * ͨ������£�Decorator ��   Person�Ṳͬʵ��һ�� �ӿ�
 * @author lchan
 * @date 2020��5��4��
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
