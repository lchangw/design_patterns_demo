package prototype.v2;

/**
 * 原型模式就是用原型实例创建新的对象，省掉了每次执行构造函数的开销
 * 在初始化信息不发生变更的情况下，克隆是最好的办法。这既隐藏了创建对象的细节，又提高了性能
 * 
 * clone方法，如果字段是值类型，对该字段逐位复制；如果字段是引用类型，则只复制引用
 * @author lchan
 * @date 2020年5月6日
 */
public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		Resume r1 = new Resume("lilin");
		r1.setPersonalInfo("man", 29);
		r1.setWorkExperience("2019-2020", "XX公司");
		
		Resume r2 = (Resume) r1.clone();
		r2.setWorkExperience("2018-2019", "YY公司");
		
		System.out.println(r1.toString());
		System.out.println(r2.toString());
	}

}
