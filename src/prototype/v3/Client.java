package prototype.v3;

/**
 * 浅复制
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
