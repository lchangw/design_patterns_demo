package memento.v2;

/**
 * 备忘录模式 -- 在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态
 * @author lchan
 * @date 2020年5月7日
 */
public class Client {

	public static void main(String[] args) {
		Originator o = new Originator();
		o.setState("On");
		o.show();
		
		CareTaker c = new CareTaker();
		c.setMemento(o.createMemento());
		
		o.setState("Off");
		o.show();
		
		o.setMemento(c.getMemento());
		o.show();
	}

}
