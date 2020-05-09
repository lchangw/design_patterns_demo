package builder.v2;

/**
 * 将一个复杂对象的构建与它的表示分离
 * 这似乎与模板方法把具体步骤的实现放在子类来实现一样，区别在哪？？？TODO 
 * @author lchan
 * @date 2020年5月7日
 */
public class Client {

	public static void main(String[] args) {
		PersonBuilder pb = new PersonThinBuilder();
		PersonDirector pd = new PersonDirector(pb);
		pd.createPerson();
	}

}
